package jdk7notes.chapter12;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by suse on 1/28/15.
 */
public class HandlerDemo
{

    public static void main(String[] args) throws IOException{
        Logger logger  = Logger.getLogger(HandlerDemo.class.getName());

        logger.setLevel(Level.CONFIG);
        FileHandler handler = new FileHandler("%h/config.log");
        handler.setLevel(Level.CONFIG);

        logger.addHandler(handler);
        logger.config("Logger 组态完成 ");

    }
}

//: RESULTS: OUTPUT
//
//<?xml version="1.0" encoding="UTF-8" standalone="no"?>
//<!DOCTYPE log SYSTEM "logger.dtd">
//<log>
//<record>
//  <date>2015-01-28T14:31:12</date>
//  <millis>1422426672381</millis>
//  <sequence>0</sequence>
//  <logger>jdk7notes.chapter12.HandlerDemo</logger>
//  <level>CONFIG</level>
//  <class>jdk7notes.chapter12.HandlerDemo</class>
//  <method>main</method>
//  <thread>1</thread>
//  <message>Logger 组态完成 </message>
//</record>
//</log>

