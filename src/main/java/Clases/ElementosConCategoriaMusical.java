/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Enums.CategoríaMusical;

/**
 *
 * @author reena
 */
public abstract class ElementosConCategoriaMusical {
    private CategoríaMusical categoría;

    public ElementosConCategoriaMusical(CategoríaMusical categoría) {
        this.categoría = categoría;
    }

    public CategoríaMusical getCategoría() {
        return categoría;
    }

    public void setCategoría(CategoríaMusical categoría) {
        this.categoría = categoría;
    }

    @Override
    public String toString() {
        return "Categoría: " + categoría;
    }
    
    
}
