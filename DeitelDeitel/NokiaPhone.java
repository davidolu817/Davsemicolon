package tdd;

import java.util.Scanner;

public class NokiaPhone {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        System.out.println("""
                1 - Phone book
                2 - Messages
                3 - Chat
                4 - Call register
                5 - Tone
                6 - Settings
                7 - Call divert
                8 - Games
                9 - Calculator
                10 - Reminders
                11 - Clock
                12 - Profiles
                13 - Sim services
                """);
        int userInput = Input.nextInt();
        switch (userInput){
            case 1: {
                System.out.println("""
                        1.Search
                        2.Service Nos
                        3.Add name
                        4.Erase
                        5.Edit
                        6.Assign tone
                        7.Send b'card
                        8.Options
                        9.Speed dials
                        10.Voice tags
                        """);
                userInput = Input.nextInt();
                switch (userInput) {
                    case 1:
                        System.out.println("Search");
                        break;
                    case 2:
                        System.out.println("Service");
                        break;
                    case 3:
                        System.out.println("Add name");
                        break;
                    case 4:
                        System.out.println("Erase");
                        break;
                    case 5:
                        System.out.println("Edit");
                        break;
                    case 6:
                        System.out.println("Assign tone");
                        break;
                    case 7:
                        System.out.println("Send b'card");
                        break;
                    case 8:
                        System.out.println("Options");
                        System.out.println("""
                                1.Type of view
                                2. Memory status
                                """);
                        break;
                    case 9:
                        System.out.println("Speed dials");
                        break;
                    case 10:
                        System.out.println("Voice tags");

                }
            }
            break;
            case 2: {
                System.out.println("""
                                1.Write messages
                                2.Inbox
                                3.Outbox
                                4.Picture messages
                                5.Templates
                                6.Smileys
                                7.Messages sittings
                                8.Info service
                                9.Voice mailbox number
                                10.Service command editor
                                """);
                userInput = Input.nextInt();
                switch (userInput) {
                    case 1:
                        System.out.println("Write messages");
                        break;
                    case 2:
                        System.out.println("Inbox");
                        break;
                    case 3:
                        System.out.println("Outbox");
                        break;
                    case 4:
                        System.out.println("Picture messages");
                        break;
                    case 5:
                        System.out.println("Templates");
                        break;
                    case 6:
                        System.out.println("Smileys");
                        break;
                    case 7:
                        System.out.println("Message settings");
                        System.out.println("""
                                1.Set 1
                                2.Common
                                """);
                        userInput = Input.nextInt();
                        switch (userInput) {
                            case 1:
                                System.out.println("""
                                        1.Message center number
                                        2.Message sent as
                                        3.Message validity
                                        """);
                                userInput = Input.nextInt();
                                switch (userInput) {
                                    case 2:
                                        System.out.println("""
                                        1.Delivery reports
                                        2.Reply via same centre
                                        3.Character support
                                         """);
                                        break;
                                    case 8:
                                        System.out.println("Info service");
                                        break;
                                    case 9:
                                        System.out.println("Voice mailbox number");
                                        break;
                                    case 10:
                                        System.out.println("Service command editor");


                                }


                        }
                }   } break;
            case 3: {
                System.out.println("""
                        Chat
                        """);
            }
            break;
            case 4:{
                System.out.println("""
                        1. Missed calls
                        2. Received calls
                        3. Dialled numbers
                        4. Erase recent call lists
                        5. Show call duration
                        6. Show call cost
                        7. Call cost settings
                        8. Prepaid credit
                        """);
                userInput = Input.nextInt();
                switch (userInput){
                    case 1:
                        System.out.println("Missed calls");
                        break;
                    case 2:
                        System.out.println("Received calls");
                        break;
                    case 3:
                        System.out.println("Dialled numbers");
                        break;
                    case 4:
                        System.out.println("Erase recent call lists");
                        break;
                    case 5:
                        System.out.println("Show call duration");
                        System.out.println("""
                                1.Last call duration
                                2.All calls duration
                                3.Received calls duration
                                4.Dialled calls duration
                                5.Clear timers
                                """);
                        break;
                    case 6:
                        System.out.println("Show call cost");
                        System.out.println("""
                                1.Last call cost
                                2.All calls cost
                                3.Clear counters
                                """);
                        break;
                    case 7:
                        System.out.println("Call cost settings");
                        System.out.println("""
                                1.Call cost limit
                                2.Show costs in
                                """);
                        break;
                    case 8:
                        System.out.println("Prepaid credit");

                }
            }
            break;
            case 5: {
                System.out.println("""
                        1. Ringing tone
                        2. Ringing volume
                        3. Incoming call alert
                        4. Composer
                        5. Message alert tone
                        6. Keypad tones
                        7. Warning and games tones
                        8. Vibrating alert
                        9. Screen saver
                        """);
                userInput = Input.nextInt();
                switch (userInput) {
                    case 1:
                        System.out.println("Ringing tone");
                        break;
                    case 2:
                        System.out.println("Ringing volume");
                        break;
                    case 3:
                        System.out.println("Incoming call alert");
                        break;
                    case 4:
                        System.out.println("Composer");
                        break;
                    case 5:
                        System.out.println("Message alert tone");
                        break;
                    case 6:
                        System.out.println("Keypad tones");
                        break;
                    case 7:
                        System.out.println("Warning and games tones");
                        break;
                    case 8:
                        System.out.println("Vibrating alert");
                        break;
                    case 9:
                        System.out.println("Screen saver");




                }
            }
            break;
            case 6: {
                System.out.println("""
                        1.Call settings
                        2.Phone settings
                        3.Security settings
                        4.Restore factory settings
                        """);
                userInput = Input.nextInt();
                switch (userInput){
                    case 1:
                        System.out.println("Call settings");
                        System.out.println("""
                                1. Automatic redial
                                2. Speed dialling
                                3. Call waiting options
                                4. Own number sending
                                5. Phone line in use
                                6. Automatic answer
                                """);
                        break;
                    case 2:
                        System.out.println("Phone settings");
                        System.out.println("""
                                1. Language
                                2. Cell info display
                                3. Welcome note
                                4. Network selection
                                5. Lights
                                6. Confirm Sim service actions
                                """);
                        break;
                    case 3:
                        System.out.println("Security settings");
                        System.out.println("""
                                1. PIN code request
                                2. Call barring service
                                3. Fixed dialling
                                4. Closed user group
                                5. Phone security
                                6. Change access codes
                                """);
                        break;
                    case 4:
                        System.out.println("Restore factory settings");


                }
            }
            break;
            case 7: {
                System.out.println("""
                        Call divert
                        """);

            }
            break;
            case 8: {
                System.out.println("""
                        Games
                        """);

            }
            break;
            case 9: {
                System.out.println("""
                        Calculator
                        """);

            }
            break;
            case 10: {
                System.out.println("""
                        Remainders
                        """);

            }
            break;
            case 11: {
                System.out.println("""
                        1. Alarms clock
                        2. Clock settings
                        3. Date setting
                        4. Stopwatch
                        5. Countdown timer
                        6. Auto update of date and time
                        """);
                userInput = Input.nextInt();
                switch (userInput){
                    case 1:
                        System.out.println("Alarm clock");
                        break;
                    case 2:
                        System.out.println("Clock settings");
                        break;
                    case 3:
                        System.out.println("Date settings");
                        break;
                    case 4:
                        System.out.println("Stopwatch");
                        break;
                    case 5:
                        System.out.println("Countdown timer");
                        break;
                    case 6:
                        System.out.println("Auto update of date and time");


                }

            }
            break;
            case 12: {
                System.out.println("""
                        Profiles
                        """);

            }
            break;
            case 13: {
                System.out.println("""
                        SIM services
                        """);
            }




        }
    }
}
