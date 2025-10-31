package org.abb_tech.lesson6.task.interfaces;

import org.abb_tech.lesson6.task.classes.Library;

public interface BookFilter {
    boolean filter(Library<?>.Book book);
}
