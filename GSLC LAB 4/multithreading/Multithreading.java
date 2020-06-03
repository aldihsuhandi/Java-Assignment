class Multithreading implements Runnable
{
    Thread t;
    String name;
    int num, limit;
    public Multithreading(String name, int num, int limit)
    {
        this.name = name;
        this.num = num;
        this.limit = limit;
    }

    public void run() 
    {
        for (int i = 0;i < limit;++i) {
            System.out.printf("%s: %d\n", name, num + (2 * i));
            try 
            {
                if(num == 2)
                    Thread.sleep(1000);
                else
                    Thread.sleep(2000);
            } 
            catch (Exception e) 
            {
                System.out.println(e);
            }
        }
    }
}
