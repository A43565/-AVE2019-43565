import java.lang.reflect.*;

class A {}
class B extends A {}
class C extends B {
    public int x,y;
    public void Foo(){}
}

class App{
    public static void main(String[] args) {
        PrintBaseTypes("ola");
        PrintBaseTypes(19);
        PrintBaseTypes(new C());


        PrintMembers(new C());
        PrintMethods(new C());
        PrintFields(new C());
    }

    private static void PrintFields(Object object) {
        System.out.println("Fields: ");
        Field[] fields = object.getClass().getFields();
        for(Field f : fields){
            System.out.println("\t"+f.getName());
        }
    }

    private static void PrintMethods(Object object) {
        System.out.println("Methods: ");
        Method[] methods = object.getClass().getMethods();
        for(Method m : methods){
            System.out.println("\t"+m.getName());
        }
    }

    private static void PrintMembers(Object object) {
        System.out.println("Members: ");
        Member[] members = object.getClass().getMethods();
        for(Member m : members){
            System.out.println("\t"+m.getName());
        }
    }

    private static void PrintBaseTypes(Object obj) {
        Class c = obj.getClass();
        do{
            System.out.println(c.getName()+" ");
            PrintInterfaces(c);
            c = c.getSuperclass();
        }while (c != Object.class);
        System.out.println();
    }

    private static void PrintInterfaces(Class c) {
        Class[] interfaces = c.getInterfaces();
        int i =0;
        while(i < interfaces.length){
            System.out.println("\t"+interfaces[i].getName());
            ++i;
        }
    }
}