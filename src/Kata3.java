/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Kata3 {
    public static void main(String[] args){
        Histogram<String> histogram = new Histogram<String>();
        histogram.increment( "hotmail.com");
        histogram.increment( "gmail.com");
        histogram.increment( "hotmail.com");
        histogram.increment( "hotmail.com");
        histogram.increment( "outlook.es");
        histogram.increment( "ulpgc.es");
        histogram.increment( "ulpgc.es");
        histogram.increment( "outlook.es");
        //HistogramDisplay histo = new HistogramDisplay();
        new HistogramDisplay(histogram).execute();
    }
}
