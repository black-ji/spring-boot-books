package com.ost.Ktob.controller;

import com.ost.Ktob.model.Kteb;
import com.ost.Ktob.service.KtebService;
import com.ost.Ktob.service.KtebServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/book")
public class KtebController {
    @Autowired
    private KtebService ktebService;

    @PostMapping //api/book
    public ResponseEntity<?> saveBook(@RequestBody Kteb kteb)
    {
        return new ResponseEntity<>(ktebService.saveKteb(kteb), HttpStatus.CREATED);
    }

    @DeleteMapping("{ktebId}")//api/book/{ktebId}
    public ResponseEntity<?> deleteBook(@PathVariable long ktebId)
    {
        ktebService.deleteKteb(ktebId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping //api/book
    public ResponseEntity<?> getAllBooks()
    {
        return new ResponseEntity<>(ktebService.findKtob(),HttpStatus.OK);
    }
}
