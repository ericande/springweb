package com.ericande.springweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChessController {

    @GetMapping("/chess")
    public String newBoard(@RequestParam(value = "invert", defaultValue = "true") boolean aInvert) {
        StringBuilder myRow = new StringBuilder();
        myRow.append("\u265C");
        myRow.append("\u265E");
        myRow.append("\u265D");
        myRow.append("\u265B");
        myRow.append("\u265A");
        myRow.append("\u265D");
        myRow.append("\u265E");
        myRow.append("\u265C");
        return myRow.toString();
    }
}
