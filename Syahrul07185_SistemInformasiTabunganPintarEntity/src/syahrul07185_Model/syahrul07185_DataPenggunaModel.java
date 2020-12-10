
package syahrul07185_Model;

import syahrul07185_Entity.syahrul07185_DataPenggunaEntity;
import java.util.ArrayList;
public class syahrul07185_DataPenggunaModel implements syahrul07185_ModelInterfaces {
    private ArrayList<syahrul07185_DataPenggunaEntity> syahrul07185_datapenggunaEntityArrayList;
    

    public syahrul07185_DataPenggunaModel() {
        syahrul07185_datapenggunaEntityArrayList= new ArrayList<syahrul07185_DataPenggunaEntity>();
    }
    @Override
    public void syahrul07185_view(){
        if(syahrul07185_datapenggunaEntityArrayList.isEmpty()){
            System.out.println("Data Kosong");
        }else{
            for(int syahrul07185_a=0;syahrul07185_a<syahrul07185_datapenggunaEntityArrayList.size();syahrul07185_a++){
                    System.out.println("Nama = "+syahrul07185_datapenggunaEntityArrayList.get(syahrul07185_a).getSyahrul07185_nama());
                    System.out.println("Jenis Kelamin = "+syahrul07185_datapenggunaEntityArrayList.get(syahrul07185_a).getSyahrul07185_jeniskelamin());
                    System.out.println("Email = "+syahrul07185_datapenggunaEntityArrayList.get(syahrul07185_a).getSyahrul07185_email());
                    System.out.println("");
                    
                    
                    
                    
                }
        }
    }
    public int syahrul07185_CekData(String syahrul07185_Email,String syahrul07185_Password){
        int syahrul07185_loop=0;
        if(syahrul07185_datapenggunaEntityArrayList.size()==0){
            syahrul07185_loop=-1;
        }else{
            for(int syahrul07185_a=0;syahrul07185_a<syahrul07185_datapenggunaEntityArrayList.size();syahrul07185_a++){
                if(syahrul07185_datapenggunaEntityArrayList.get(syahrul07185_a).getSyahrul07185_email().equals(syahrul07185_Email)&&syahrul07185_datapenggunaEntityArrayList.get(syahrul07185_a).getSyahrul07185_password().equals(syahrul07185_Password)){
                    syahrul07185_loop=syahrul07185_a;
                    break;
                }else{
                    syahrul07185_loop=-2;
                }
            }
        }
        return syahrul07185_loop;
    }
     
     public void syahrul07185_hapusnama(String syahrul07185_nama){
      if(syahrul07185_nama.equals(syahrul07185_datapenggunaEntityArrayList.get(syahrul07185_carinama(syahrul07185_nama)).getSyahrul07185_nama())){
           syahrul07185_datapenggunaEntityArrayList.remove(syahrul07185_carinama(syahrul07185_nama));
            System.out.println("Nama Sudah Dihapus");
      }else{
          System.out.println("Nama Tidak Ditemukan");
      }
   }
     
     public void syahrul07185_update(String syahrul07185_nama,String syahrul07185_email){
       if(syahrul07185_carinama(syahrul07185_nama)!=-1){     
           syahrul07185_datapenggunaEntityArrayList.get(syahrul07185_carinama(syahrul07185_nama)).setSyahrul07185_email(syahrul07185_email);
       }else{
           System.out.println("Nama Tidak Ditemukan");
       }
   }
     
      private int syahrul07185_carinama(String syahrul07185_nama){
       int indeks=-1;
       
       for(int a=0;a<syahrul07185_datapenggunaEntityArrayList.size();a++){
           if(syahrul07185_nama.equals(syahrul07185_datapenggunaEntityArrayList.get(a).getSyahrul07185_nama())){
               indeks=a;
               break;
           }
       }
       return indeks;
   }
      public void syahrul07185_InsertDataPengguna(syahrul07185_DataPenggunaEntity syahrul07185_dataPenggunaEntity){
          
          syahrul07185_datapenggunaEntityArrayList.add(syahrul07185_dataPenggunaEntity);
      }
      
}
