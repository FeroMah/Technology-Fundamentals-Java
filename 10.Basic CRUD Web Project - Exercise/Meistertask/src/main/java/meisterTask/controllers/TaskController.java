package meisterTask.controllers;

import meisterTask.bindingModel.TaskBindingModel;
import meisterTask.entities.Task;
import meisterTask.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class TaskController {
    private final TaskRepository taskRepository;

    @Autowired
    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping("/")
    public ModelAndView index(ModelAndView modelAndView) {
//      Създаваме листове за всяка една колона за визуализация в index page

//        Колона за Open, филтрираме по getStatus() с "Open";
        modelAndView.setViewName("base-layout");
        modelAndView.addObject("view", "task/index"); // "task/index" навигираме в кой package се намира index.html
        List<Task> openTasks = this.taskRepository.findAll().stream().filter(e -> e.getStatus().equals("Open")).collect(Collectors.toList());
//        List<Task> openTasks = this.taskRepository.findAllByStatus("Open");
        modelAndView.addObject("openTasks", openTasks);

//        Колона за In progress, филтрираме по getStatus() с "In progress";
        List<Task> inProgressTasks = this.taskRepository.findAll().stream().filter(e -> e.getStatus().equals("In Progress")).collect(Collectors.toList());
//        List<Task> inProgressTasks = this.taskRepository.findAllByStatus("In progress");
        modelAndView.setViewName("base-layout");
        modelAndView.addObject("inProgressTasks", inProgressTasks);

//        Колона за Finished, филтрираме по getStatus() с "Finished";
        List<Task> finishedTasks = this.taskRepository.findAll().stream().filter(e -> e.getStatus().equals("Finished")).collect(Collectors.toList());
//        List<Task> finishedTasks = this.taskRepository.findAllByStatus("Finished");
        modelAndView.addObject("finishedTasks", finishedTasks);

        return modelAndView;
    }

    @GetMapping("/create")  // за визуализация.
    public ModelAndView create(ModelAndView modelAndView) {
        modelAndView.setViewName("base-layout");
        modelAndView.addObject("view", "task/create");
        return modelAndView;
    }

    @PostMapping("/create") // за запис и изпращане към сървъра.
    public String create(Task task) {
        this.taskRepository.saveAndFlush(task);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")   // за визуализация.
    public ModelAndView edit(ModelAndView modelAndView,
                             @PathVariable(value = "id") Integer id) {
        Task task = this.taskRepository.findById(id).get();
        modelAndView.setViewName("base-layout");
        modelAndView.addObject("view", "task/edit");
        modelAndView.addObject("task", task);
        return modelAndView;
    }

    @PostMapping("/edit/{id}")      // за запис и изпращане към сървъра.
    public String edit(TaskBindingModel taskBindingModel,
                       @PathVariable(value = "id") Integer id) {
        Task taskToEdit = this.taskRepository.findById(id).get();
        taskToEdit.setTitle(taskBindingModel.getTitle());
        taskToEdit.setStatus(taskBindingModel.getStatus());
        this.taskRepository.saveAndFlush(taskToEdit);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}") // за визуализация.
    public ModelAndView delete(ModelAndView modelAndView,
                               @PathVariable(value = "id") Integer id) {
        Task task = this.taskRepository.findById(id).get();
        modelAndView.setViewName("base-layout");
        modelAndView.addObject("view", "task/delete");
        modelAndView.addObject("task", task);
        return modelAndView;
    }

    @PostMapping("/delete/{id}")        // за запис и изпращане към сървъра.
    public String delete(Task id) {
        this.taskRepository.delete(id);
        return "redirect:/";
    }
}
