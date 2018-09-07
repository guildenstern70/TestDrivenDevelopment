package it.ibm.com.bocconi.tdd;

public class Locker
{
    private LockerStatus status;

    public Locker()
    {
        this.status = LockerStatus.OPEN;
    }

    public LockerStatus getStatus()
    {
        return this.status;
    }

    public boolean close()
    {
        this.status = LockerStatus.CLOSED;
        return true;
    }

    public boolean open()
    {
        if (this.status == LockerStatus.LOCKED)
        {
            return false;
        }

        this.status = LockerStatus.OPEN;
        return true;
    }

    public boolean lock()
    {
        if (this.status == LockerStatus.CLOSED)
        {
            this.status = LockerStatus.LOCKED;
            return true;
        }

        return false;
    }
}
