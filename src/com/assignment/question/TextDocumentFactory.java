package com.assignment.question;
import com.assignment.question.processor.*;
import com.assignment.question.parser.*;
import com.assignment.question.printer.*;

public class TextDocumentFactory extends DocumentFactory {
    @Override
    public DocumentProcessor createProcessor(String documentName){
        return new TextDocumentProcessor(documentName);
    }

    @Override
    public DocumentParser createParser(String path){
       return new TextDocumentParser(path);
    }

    @Override
    public DocumentPrinter createPrinter(DocumentProcessor processor){
        return new TextDocumentPrinter(processor);
    }

    @Override
    public DocumentType supportsType(){
        return DocumentType.TEXT;
    }
}