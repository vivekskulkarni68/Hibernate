package hello;

public class Message {
    Long msg_id;
    String mymessage;
    String details;
    int msg_no;
    String concat_msg;
    public String toString(){
    	return msg_id+" : "+mymessage;
    }
    private static final Message msg = new Message();
     Message(){
    	 details="hi there !!!";
     }
     public void setMessage(String str){
    	System.out.println("DEBUG : setMessage is called");
    	this.mymessage=str;
    }
  
   public void setDetails(String str){
  	System.out.println("DEBUG : setdetails is called");
    	this.details=str;
    }
    public String getDetails(){
    	System.out.println("DEBUG : getDetails is called");
    	return details;
    }
    Long getId(){
    	System.out.println("DEBUG : getId is called");
    	return msg_id;
    }
    
    public Long getMsg_id() {
		return msg_id;
	}
	public void setMsg_id(Long msg_id) {
		this.msg_id = msg_id;
	}
	public String getMymessage() {
		return mymessage;
	}
	public void setMymessage(String mymessage) {
		this.mymessage = mymessage;
	}
	public int getMsg_no() {
		return msg_no;
	}
	public void setMsg_no(int msg_no) {
		this.msg_no = msg_no;
	}
	public String getConcat_msg() {
		return concat_msg;
	}
	public void setConcat_msg(String concat_msg) {
		this.concat_msg = concat_msg;
	}
	public static Message getInstance(){
    	return msg;
    }
}
