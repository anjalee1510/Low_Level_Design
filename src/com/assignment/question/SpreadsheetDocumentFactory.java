package com.assignment.question;
import com.assignment.question.processor.*;
import com.assignment.question.parser.*;
import com.assignment.question.printer.*;

public class SpreadsheetDocumentFactory extends DocumentFactory {

    @Override
    public DocumentProcessor createProcessor(String documentName){
        return new SpreadsheetDocumentProcessor(documentName);
    }

    @Override
    public DocumentParser createParser(String path){
       return new SpreadsheetDocumentParser(path);
    }

    @Override
    public DocumentPrinter createPrinter(DocumentProcessor processor){
        return new SpreadsheetDocumentPrinter(processor);
    }

    @Override
    public DocumentType supportsType(){
        return DocumentType.SPREAD_SHEET;
    }
    
}