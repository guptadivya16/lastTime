package com.InterviewProg;
// How to make Singleton lazily loaded?
public class SingletonDesignPattern {
		
		private static SingletonDesignPattern singleton_reference = null;
		
		private SingletonDesignPattern()
		{
			System.out.println(" we are executing singleton");
		}		
		public static SingletonDesignPattern getInstance()
		{
			if(singleton_reference==null)
				singleton_reference = new SingletonDesignPattern();
				
			return singleton_reference;
			
		}
		public static void main(String a[])
		{
			SingletonDesignPattern.getInstance();
		}
}

//How to make Singleton thread safe?
/*
public static SingletonDesignPattern getInstance() {
    if (singleton_reference == null) {
        synchronized (SingletonDesignPattern.class) {
            if (singleton_reference == null) {
            	singleton_reference = new SingletonDesignPattern();
            }
        }
    }
 
    return singleton_reference;
}
*/

/*public class Singleton {
	 
    private Singleton() {
    }
 
    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }
 
    private static class SingletonHolder {
        private static final Singleton instance = new Singleton();
    }
}*/