package com.fullcycle.admin.catalogo.application;

import com.fullcycle.admin.catalogo.domain.category.Category;
public class UseCase {

    public Category execute() {
        final String aName = null;
        final var aDescription = "A categoria mais assistida";
        final var aIsActive = true;
        return Category.newCategory(aName, aDescription, aIsActive);
    }

}