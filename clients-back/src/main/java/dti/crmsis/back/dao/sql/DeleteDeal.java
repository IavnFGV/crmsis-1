package dti.crmsis.back.dao.sql;

public class DeleteDeal {

    long dealId;

    public DeleteDeal(long dealId) {
        this.dealId = dealId;
    }

    public static DeleteDeal of(long dealId){
        return new DeleteDeal(dealId);
    }

}
