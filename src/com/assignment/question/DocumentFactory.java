package com.assignment.question;
import com.assignment.question.processor.DocumentProcessor;
import com.assignment.question.parser.DocumentParser;
import com.assignment.question.printer.DocumentPrinter;

public abstract class DocumentFactory {
    
    public abstract DocumentProcessor createProcessor(String documentName);
    public abstract DocumentParser createParser(String path);
    public abstract DocumentPrinter createPrinter(DocumentProcessor processor);

    public abstract DocumentType supportsType();
}