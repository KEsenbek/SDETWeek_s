package week12;

public class Class12_8_1_Call_class_and_it_s_details_OOP {
    public static void main(String[] args) {


    }

}


class Call {
    private String callType;
    private String startCall;
    private String endCall;
    private String caller;
    private String recipient;

    public Call() {
        // Default constructor
    }

    public String getCallType() {
        return callType;
    }

    public String getStartCall() {
        return startCall;
    }

    public String getEndCall() {
        return endCall;
    }

    public String getCaller() {
        return caller;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setCallType(String callType) {
        if (callType.equals("INBOUND") || callType.equals("OUTBOUND") || callType.equals("CAMPAIGN")) {
            this.callType = callType;
        } else {
            System.out.println("Invalid call type.");
        }
    }

    public void setStartCall(String startCall) {
        if (!startCall.isEmpty()) {
            this.startCall = startCall;
        } else {
            System.out.println("Start time cannot be empty.");
        }
    }

    public void setEndCall(String endCall) {
        if (!endCall.isEmpty()) {
            if (this.startCall != null && !this.startCall.isEmpty()) {
                if (endCall.compareTo(this.startCall) >= 0) {
                    this.endCall = endCall;
                } else {
                    System.out.println("Invalid: End time cannot be before the start time.");
                }
            } else {
                System.out.println("Start time is missing.");
            }
        } else {
            System.out.println("End time cannot be empty.");
        }
    }

    public void setCaller(String caller) {
        if (caller.matches("\\+\\d{10}")) {  // Update the regular expression to match 10 digits
            this.caller = caller;
        } else {
            System.out.println("Invalid caller phone number.");
        }
    }

    public void setRecipient(String recipient) {
        if (recipient.matches("\\+\\d{10}")) {  // Update the regular expression to match 10 digits
            this.recipient = recipient;
        } else {
            System.out.println("Invalid recipient phone number.");
        }
    }

    public void displayCallDetails() {
        System.out.println("Call Type: " + callType);
        System.out.println("Start Time: " + startCall);
        System.out.println("End Time: " + endCall);
        System.out.println("Caller: " + caller);
        System.out.println("Recipient: " + recipient);
    }

    public int calculateCallDuration() {
        if (startCall != null && endCall != null) {
            // Calculate call duration in seconds based on start and end times
            // You need to implement this calculation
            // For example:
            int startTimeInSeconds = timeToSeconds(startCall);
            int endTimeInSeconds = timeToSeconds(endCall);
            return endTimeInSeconds - startTimeInSeconds;
        } else {
            System.out.println("Start time or end time is missing.");
            return 0;
        }
    }

    public static int calculateCallDuration(Call call) {
        return call.calculateCallDuration();
    }

    private int timeToSeconds(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        int seconds = Integer.parseInt(parts[2]);
        return hours * 3600 + minutes * 60 + seconds;
    }
}