package dev.patika.fourthhomeworkavemphract.controller;

import dev.patika.fourthhomeworkavemphract.dto.BaseDTO;
import dev.patika.fourthhomeworkavemphract.model.BaseEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BaseController<T extends BaseEntity,D extends BaseDTO> {
    public ResponseEntity<List<T>> findAll();

    public ResponseEntity<T> findById(int id);

    public ResponseEntity<T> save(D body);

    public ResponseEntity<T> update(D body);

    public ResponseEntity<T> deleteById(int id);
}
