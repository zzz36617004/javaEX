/*
작성자:배진현
작성일:2018.03.08
설   명:ppt.47 (연습문제)
 */
package com.javaex.OOP;

public  class TVApp {
    public static void main( String[] args ) {
    	
       TV tv = new TV( 7, 20, false);  	
        
        tv.status();	
        
        tv.power( true );
        tv.volume( 120 );
        tv.status();		          
        
        tv.volume( false );
        tv.status();
        
        tv.channel( 0 );
        tv.status();		          
        
        tv.channel( true );
        tv.channel( true );
        tv.channel( true );
        tv.status();

        tv.power( false );
        tv.status();      		          
    }
}
