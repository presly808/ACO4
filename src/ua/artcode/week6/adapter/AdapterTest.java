package ua.artcode.week6.adapter;

/**
 * Created by serhii on 22.03.15.
 */
public class AdapterTest {

    public static void main(String[] args) {
        PoliceDepartment department = new PoliceDepartment();

        ModernPoliceman modernPoliceman = new ModernPoliceman();

        OldPoliceman oldPoliceman = new OldPoliceman();

        OldPolicemanAdapter adapter = new OldPolicemanAdapter(oldPoliceman);

        department.check(modernPoliceman);
        department.check(adapter);

    }
}


class PoliceDepartment {

    public void check(ModernPoliceman modernPoliceman){
        modernPoliceman.defend();
    }

}

class ModernPoliceman {

    public void defend(){
        System.out.println("Modern Policeman");
    }
}

class OldPolicemanAdapter extends ModernPoliceman {

    private OldPoliceman oldPoliceman;

    public OldPolicemanAdapter(OldPoliceman oldPoliceman) {
        this.oldPoliceman = oldPoliceman;
    }

    @Override
    public void defend() {
        oldPoliceman.haveFun();
    }
}

class OldPoliceman {

    public void haveFun(){
        System.out.println("I take money and do bad things");
    }

}
