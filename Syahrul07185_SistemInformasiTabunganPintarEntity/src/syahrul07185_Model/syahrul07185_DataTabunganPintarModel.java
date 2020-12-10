
package syahrul07185_Model;

import syahrul07185_Entity.syahrul07185_DataTabunganPintarEntity;
import java.util.ArrayList;
public class syahrul07185_DataTabunganPintarModel {
    public ArrayList<syahrul07185_DataTabunganPintarEntity> syahrul07185_datatabunganpintarEntityArrayList;
       public syahrul07185_DataTabunganPintarModel() {
        syahrul07185_datatabunganpintarEntityArrayList= new ArrayList<syahrul07185_DataTabunganPintarEntity>();
    }
    public void syahrul07185_InsertDataTabunganPintar(syahrul07185_DataTabunganPintarEntity syahrul07185_dataTabunganPintarEntity){
        syahrul07185_datatabunganpintarEntityArrayList.add(syahrul07185_dataTabunganPintarEntity);
        
    }
    
}
