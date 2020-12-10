
package syahrul07185_Entity;

import java.util.ArrayList;


public class syahrul07185_DataPenggunaEntity {
    private String Syahrul07185_email,Syahrul07185_nama,Syahrul07185_password,Syahrul07185_jeniskelamin;
    

   private ArrayList<syahrul07185_DataTabunganPintarEntity> syahrul07185_datatabunganpintarEntityArrayList;

    public syahrul07185_DataPenggunaEntity(String Syahrul07185_email, String Syahrul07185_nama, String Syahrul07185_password, String Syahrul07185_jeniskelamin) {
        this.Syahrul07185_email = Syahrul07185_email;
        this.Syahrul07185_nama = Syahrul07185_nama;
        this.Syahrul07185_password = Syahrul07185_password;
        this.Syahrul07185_jeniskelamin = Syahrul07185_jeniskelamin;
    }

    public syahrul07185_DataPenggunaEntity() {
        syahrul07185_datatabunganpintarEntityArrayList= new ArrayList<syahrul07185_DataTabunganPintarEntity> ();
    }

 
    
    

    public String getSyahrul07185_email() {
        return Syahrul07185_email;
    }

    public String getSyahrul07185_nama() {
        return Syahrul07185_nama;
    }

    public String getSyahrul07185_password() {
        return Syahrul07185_password;
    }

    public String getSyahrul07185_jeniskelamin() {
        return Syahrul07185_jeniskelamin;
    }

    public void setSyahrul07185_email(String Syahrul07185_email) {
        this.Syahrul07185_email = Syahrul07185_email;
    }

    public ArrayList<syahrul07185_DataTabunganPintarEntity> getSyahrul07185_datatabunganpintarEntityArrayList() {
        return syahrul07185_datatabunganpintarEntityArrayList;
    }
    
  
      
    
}
