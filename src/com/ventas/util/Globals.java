/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.util;

/**
 *
 * @author argia
 */
public class Globals {
    public static ThreadLocal<String> USR1;
    public static ThreadLocal<Integer> USR2;

    static {
        USR1 = new ThreadLocal<>();
    }
    
    static {
        USR2 = new ThreadLocal<>();
    }
}
