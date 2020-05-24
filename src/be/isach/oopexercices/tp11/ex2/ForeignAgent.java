package be.isach.oopexercices.tp11.ex2;

public class ForeignAgent extends Thread {
    private String name;
    private Voter[] targets;

    public ForeignAgent(String name, Voter[] targets)
    {
        super(name);
        this.name = name;
        this.targets = targets;
    }

    public void run()
    {
        for(int i = 0; i < targets.length; i++)
        {
            boolean draw = false;
            if(targets[i] instanceof Student)
                draw = (Math.random() <= 0.4);
            else if(targets[i] instanceof Worker)
                draw = (Math.random() <= 0.25);
            else
                draw = (Math.random() <= 0.1);
            if(!draw)
                continue;

            boolean interfered = targets[i].swingChances();
            if(interfered)
            {
                System.out.println(name + " influenced " + targets[i].getName() + " !");
            }
        }
    }
}

