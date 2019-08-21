package enumPractice;

public class Week {
    Days days;

    public Week(Days days) {
        this.days = days;
    }

    public void whatToDo() {
        switch (days) {
            case Saturday:
                System.out.println("Today is Saturday & i'm not working today");
                break;
            case Sunday:
                System.out.println("Today is Sunday & i'm going on fishing");
                break;
            case Monday:
            case Tuesday:
            case Wednesday:
            case Thursday:
                System.out.println("Today i'm going to work");
                break;
            default:
                System.out.println("Today i'm going to watch movies");
                break;

        }
    }
}
