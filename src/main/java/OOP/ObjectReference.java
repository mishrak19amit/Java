package OOP;

//ObjectReference 

class ObjectReference
{
    int a = 1;
    int b = 2;
 
    ObjectReference func(ObjectReference obj)
    {
    	ObjectReference obj3 = new ObjectReference();
        obj3 = obj;
        obj3.a = obj.a++ + ++obj.b;
        obj.b = obj.b;
        return obj3;
    }
 
    public static void main(String[] args)
    {
    	ObjectReference obj1 = new ObjectReference();
    	ObjectReference obj2 = obj1.func(obj1);
 
        System.out.println("obj1.a = " + obj1.a + "  obj1.b = " + obj1.b);
        System.out.println("obj2.a = " + obj2.a + "  obj1.b = " + obj2.b);
 
    }
}