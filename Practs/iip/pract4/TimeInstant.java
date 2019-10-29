    package pract4;
    
    /**
     * Clase TimeInstant. 
     *<p>
     * Esta clase permite representar instantes o marcas de tiempo
     * (<code>Timestamp</code>) con detalle de horas y minutos. Así,  
     * esta clase representa el momento que define un instante de tiempo,
     * en este caso, las horas y los minutos de un día cualquiera.
     * </p>
     * 
     *  @author IIP. Grado en Informatica. ETSINF, UPV 
     *  @version Curso 2019-20
     */
    public class TimeInstant {
        // ATRIBUTOS:
        /** 
         *  Variable entera para almacenar las horas. 
         *  Debe pertenecer al rango <code>[0..23]</code>.
         */
        private int hours;
        /** 
         *  Variable entera para almacenar los minutos. 
         *  Debe pertenecer al rango <code>[0..59]</code>. 
         */
        private int minutes;
        // CONSTRUCTORES:
        /**
         *  Crea un <code>TimeInstant</code> con el valor de
         *  las horas y los minutos que recibe como argumentos,
         *  <code>iniHours</code> y <code>iniMinutes</code>, 
         *  respectivamente.
         *  <p> Debe cumplirse la precondición: 
         *  <code>0 <= iniHours < 24, 0 <= iniMinutes < 60</code>. </p>
         */
        public TimeInstant(int iniHours, int iniMinutes){
            this.hours = iniHours;
            this.minutes = iniMinutes;
        }
        /**
         * Crea un <code>TimeInstant</code> con el valor del instante
         * actual UTC (tiempo universal coordinado).
         */
        public TimeInstant(){
            long minTotals = System.currentTimeMillis()/(60*1000);
            int minActuals = (int) (minTotals % (24*60)); 
            //hours calcula hores dividint entre 60
            this.hours = minActuals/ 60;
            //minutes calcula minuts amb el reste de la multiplicacio
            this.minutes = minActuals %60; 
         }
       
        // CONSULTORES Y MODIFICADORES:
        /** Devuelve las horas del TimeInstant. */ 
        public int getHours(){return hours;} //Bien
        
        /** Devuelve los minutos del TimeInstant. */
        public int getMinutes(){return minutes;}
        
        /** Actualiza las horas del TimeInstant. */ 
        public void setHours(int iniHours){this.hours = iniHours;}
       
        /** Actualiza los minutos del TimeInstant. */ 
        public void setMinutes(int iniMinutes){this.minutes = iniMinutes;}//Bien
       
        // OTROS MÉTODOS:
        /** Devuelve el TimeInstant en el formato "<code>hh:mm</code>". */
        public String toString(){
            String hh,mm;
            hh="0"+ this.hours;
            mm="0"+ this.minutes;
            hh=hh.substring(hh.length()-2);  
            mm=mm.substring(mm.length()-2);
            return hh+":"+mm;
        }
        /** Devuelve <code>true</code> sii <code>o</code> es 
         *  un objeto de la clase <code>TimeInstant</code>
         *  y sus horas y minutos coinciden con los del 
         *  objeto en curso. 
         */
        public boolean equals(Object o){
        return o instanceof TimeInstant
            && minutes==((TimeInstant)o).minutes
            && hours==((TimeInstant)o).hours;
        }
        
        /** Devuelve el número de minutos transcurridos desde las 00:00 
         *  hasta el instante representado por el objeto en curso.
         */
        
        
        public int toMinutes(){
            int resulMinutes=this.hours*60+this.minutes;
            return resulMinutes;
        }
        
        /** Compara cronológicamente el instante del objeto en curso
         *  con el del objeto de la clase TimeInstant
         *  referenciado por tInstant.
         *  
         *  El resultado es la resta entre la conversión a minutos
         *  de ambos objetos, en particular, este resultado será un valor:
         *  
         *      negativo si el instante del objeto en curso es anterior
         *          al del tInstant,
         *          
         *      cero si son iguales,
         *      
         *      positivo si el instante del objeto en curso es posterior
         *          al del tInstant
         *  
         *  
         */
         public int compareTo(TimeInstant tInstant){
         int resulTimeI=this.minutes+this.hours*60;    
         int resultIns=tInstant.minutes+tInstant.hours*60;
         int resul = resulTimeI-resultIns;
         if(resulTimeI<resultIns){
             return resul;}
         else if(resulTimeI==resultIns){return resul;}
            else{return resul;}
    }
    }
    // ACTIVIDAD EXTRA:
    /** Devuelve un <code>TimeInstant</code> a partir de la descripción 
     *  textual (<code>String</code>) en formato "<code>hh:mm</code>".
     */
    

