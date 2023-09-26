package BaiTapTrongExel;

import java.util.ArrayList;

public class QLCB {
    private ArrayList<CanBo> listCanBo = new ArrayList<>();
    int size=0;

    public QLCB() {
        size=0;
    }

    public ArrayList<CanBo> getListCanBo() {
        return listCanBo;
    }

    public int getSize() {
        return size;
    }
    public void add(CanBo canBoMoi){
        listCanBo.add(canBoMoi);
    }
    public void showAll(){
        for (CanBo person: getListCanBo()) {
            System.out.println(person);
        }
    }
    public ArrayList<CanBo> findByName(String name){
        ArrayList<CanBo> searchCanBo = new ArrayList<>();
        for (CanBo person : listCanBo) {
            if(person.getName().toLowerCase().contains(name.toLowerCase())){
                searchCanBo.add(person);
            }
        }
        return searchCanBo;
    }
}
