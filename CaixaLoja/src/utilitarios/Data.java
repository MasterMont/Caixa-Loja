package utilitarios;

import java.util.Date;
import java.text.SimpleDateFormat;
    public class Data{
        public String mes, dia , ano, dia_semana, hora;
        
        SimpleDateFormat horaFormatada = new SimpleDateFormat("HH:mm:ss");
        
        public void le_hora(){
            Date horaAtual = new Date();
            hora = horaFormatada.format(horaAtual);
        }
        
        public void le_data(){
            Date data = new Date();
            //mes = ""+data.getMonth();
           // dia = ""+data.getDate();
             switch(data.getDate()){
                case 1: dia = "01";break;
                case 2: dia = "02";break;
                case 3: dia = "03";break;
                case 4: dia = "04";break;    
                case 5: dia = "05";break;    
                case 6: dia = "06";break;    
                case 7: dia = "07";break;    
                case 8: dia = "08";break;    
                case 9: dia = "09";break;
                case 10: dia = "10";break;
                case 11: dia = "11";break;    
                case 12: dia = "12";break;
                case 13: dia = "13";break;
                case 14: dia = "14";break;
                case 15: dia = "15";break;
                case 16: dia = "16";break;
                case 17: dia = "17";break;
                case 18: dia = "18";break;
                case 19: dia = "19";break;
                case 20: dia = "20";break; 
                case 21: dia = "21";break;     
                case 22: dia = "22";break;           
                case 23: dia = "23";break;            
                case 24: dia = "24";break;            
                case 25: dia = "25";break;            
                case 26: dia = "26";break;        
                case 27: dia = "27";break;        
                case 28: dia = "28";break;
                case 29: dia = "29";break;           
                case 30: dia = "30";break;            
                case 31: dia = "31";break;            
             }    
            
            ano = ""+(1900 + data.getYear());
            dia_semana = ""+data.getDay();
            
             switch(data.getMonth()){
                case 0: mes = "01";break;
                case 1: mes = "02";break;
                case 2: mes = "03";break;
                case 3: mes = "04";break;
                case 4: mes = "05";break;    
                case 5: mes = "06";break;    
                case 6: mes = "07";break;    
                case 7: mes = "08";break;    
                case 8: mes = "09";break;    
                case 9: mes = "10";break;    
                case 10: mes = "11";break;    
                case 11: mes = "12";break;
            }
             
            
            /*
            switch(data.getDay()){
            case 0: dia_semana = "Domingo";break;
            case 1: dia_semana = "Segunda-feira";break;    
            case 2: dia_semana = "Terça-feira";break;
            case 3: dia_semana = "Quarta-feira";break;    
            case 4: dia_semana = "Quinta-feira";break;    
            case 5: dia_semana = "Sexta-feira";break;
            case 6: dia_semana = "Sábado";break;                
            }
            switch(data.getMonth()){
                case 0: mes = "Janeiro";break;
                case 1: mes = "Fevereiro";break;
                case 2: mes = "Março";break;
                case 3: mes = "Abril";break;
                case 4: mes = "Maio";break;    
                case 5: mes = "Junho";break;    
                case 6: mes = "Julho";break;    
                case 7: mes = "Agosto";break;    
                case 8: mes = "Setembro";break;    
                case 9: mes = "Outubro";break;    
                case 10: mes = "Novembro";break;    
                case 11: mes = "Dezembro";break;
            }*/
        
        }

        

}