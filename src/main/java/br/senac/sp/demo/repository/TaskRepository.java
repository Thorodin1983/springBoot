package br.senac.sp.demo.repository;

import br.senac.sp.demo.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
