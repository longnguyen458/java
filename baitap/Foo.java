package baitap;

	public class Foo {
	    public void useBarMethod() {
	        Bar theBar = new Bar();
	        theBar.barMethod(this);
	    }
	 
	    public String getName() {
	        return "Foo";
	    }
	}
	public class Bar {
	    public void barMethod(Foo obj) {
	        obj.getName();
	    }
	}	 
	

