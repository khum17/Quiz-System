
package com.quizsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quizsystem.model.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
