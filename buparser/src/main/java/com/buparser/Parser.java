package com.buparser;

import java.io.IOException;

import com.handlexer.TokenList;

public class Parser {
    public void Parse(TokenList tokenList) throws IOException {
        // SHIFT-REDUCE PARSER
        // - read input from file
        // - check if stack top matches any rule asserted in the grammar
        // - if yes,
        // - - check if next in input possibly matches any rule asserted in the grammar
        // (lookahead)
        // - - if yes, shift
        // - - if no, reduce
        // - if no, shift
        // - if end of input reached, error
        // - if goal state rached, success
    }
}
