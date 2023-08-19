# ايه هو البرنامج ده؟
- البرنامج ده هو عباره عن مثال لل Command Design Pattern باستخدام لغة java
# بنستخدم امتي ال Design Pattern ده؟
- لما يكون عندي request عايز اعمله handling بس يكون ال handling في class مختص بيه هنا هنسميه ال receiver
- ال class بتاعي هيبقي هو ال command اللي هيستخدم ال receiver عشان يعمل calling لل handling اللي مكتوب جوا ال receiver بدون اي علم عن ال implementation اللي جواه
- لو عملنا list of commands هيبقي هو هو ال Chain Of Responsibility Design Pattern
# بيتكون من ايه البرنامج ده ؟
- ال package بتاعت ال commands:
  - ال Calculator Class
- ال package بتاعت ال receivers:
  - ال AdditionReceiver و ده فيه ال handling بتاع ال requests انه يعمل adding لرقمين
  - ال MultiplyReceiver و ده فيه ال handling بتاع ال requests انه يعمل multiply لرقمين
