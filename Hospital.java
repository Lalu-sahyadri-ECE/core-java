class Hospital{
static String[] findDoctorsBySpecilazation(String specialization){
System.out.println("Invoked findDoctorsBySpecilazation ");
 if( specialization == "General Medicine"){
 String [] doctors = {"Dr. Vinayak Ladwa","Dr. Jithendar Bhatwadekar","Dr. Pranam P Ladwa","Dr. Hanumanta Devu Gouda","Dr. Ashutosh Pandey","Dr. Raghavendra Bhat","Dr. Yuvraj Singh",
"Dr. Santhosh Nambiar","Dr. Ritesh Kulal","Dr. Pranay Mishra","Dr. Harshit Verma",
"Dr. Devyank Joshi","Dr. Adwait Kulshrestha","Dr. Manvendra Iyer","Dr. Sharath Rao",
"Dr. Arjun Thakur","Dr. Lakshit Jain","Dr. Pravin Desai"};
System.out.println("End of findDoctorsBySpecilazation");
return doctors; }
else if(specialization == "Ortho"){
String [] doctors ={"Dr. Maya","Dr.Hemanth","Dr.Fool","Dr.Harsh","Dr. Gayatri Kulkarni","Dr. Aditi Kapoor","Dr. Sonal Jain","Dr. Bhavya Patel",
"Dr. Shruthi Nair","Dr. Neelam Reddy","Dr. Gayatri Kulkarni","Dr. Aditi Kapoor","Dr. Sonal Jain","Dr. Bhavya Patel",
"Dr. Shruthi Nair","Dr. Neelam Reddy","Dr. Harini Suresh","Dr. Megha Verma","Dr. Tanisha Arora","Dr. Harini Suresh","Dr. Megha Verma","Dr. Tanisha Arora"};
return doctors;}

else  if(specialization == "Dental Science"){
String[] doctors = {
"Dr. Meena Rao","Dr. Kavya Shetty","Dr. Ritu Sharma","Dr. Lakshmi Nair","Dr. Aishwarya Patil",
"Dr. Sneha Kapoor","Dr. Bhavana Reddy","Dr. Neha Jain","Dr. Divya Menon","Dr. Pooja Desai",
"Dr. Shreya Kulkarni","Dr. Tanvi Joshi","Dr. Anjali Verma","Dr. Keerthi Iyer","Dr. Swathi Rao"
};
return doctors;}

else if(specialization == "Dermatology"){
String[] doctors = {
"Dr. Harsh Vardhan","Dr. Nikhil Bansal","Dr. Pratik Shah","Dr. Arvind Narayan","Dr. Kunal Mehta",
"Dr. Rohan Malhotra","Dr. Siddharth Rao","Dr. Tejas Gowda","Dr. Manish Kulkarni","Dr. Vivek Arora",
"Dr. Rohit Khanna","Dr. Abhishek Iyer","Dr. Karthik Ramesh","Dr. Varun Pillai","Dr. Aditya Singh"
};
return doctors;}

else if(specialization == ("Diabetology/Endocrinology")){
String[] doctors = {"Dr. Sahana Iyer","Dr. Priyanka Menon","Dr. Nandini Rao","Dr. Ishita Sharma","Dr. Rachana Deshpande",
"Dr. Mitali Shah","Dr. Gayatri Kulkarni","Dr. Aditi Kapoor","Dr. Sonal Jain","Dr. Bhavya Patel",
"Dr. Shruthi Nair","Dr. Neelam Reddy","Dr. Harini Suresh","Dr. Megha Verma","Dr. Tanisha Arora"
};
return doctors;}

else if(specialization == ("ENT")){
String[] doctors = {
"Dr. Akshay Kumar","Dr. Darshan Gowda","Dr. Pranav Shetty","Dr. Ritesh Bhat","Dr. Lokesh Naidu",
"Dr. Chirag Patel","Dr. Ashwin Rao","Dr. Naveen Thomas","Dr. Gaurav Sinha","Dr. Vikram Joshi",
"Dr. Yash Mehra","Dr. Mohit Arora","Dr. Arnav Kapoor","Dr. Tushar Nair","Dr. Rahul Bedi"
};
return doctors;}

else if(specialization==("Infectious Diseases")){
String[] doctors = {
"Dr. Abhinav Kulshrestha","Dr. Ritesh Nambiar","Dr. Sandeep Chawla","Dr. Vignesh Narayan",
"Dr. Haroon Siddiqui","Dr. Pramod Kulkarni","Dr. Karthavya Rao","Dr. Adarsh Pillai",
"Dr. Naman Trivedi","Dr. Lokith Shetty","Dr. Samarjeet Paul","Dr. Vikrant Jha",
"Dr. Devendra Iyer","Dr. Shaurya Mehta","Dr. Yatin Bhosale"
};
return doctors;}

else if(specialization==("Infertility medicine")){
String[] doctors = {
"Dr. Bhargavi Kulkarni","Dr. Manasa Reddy","Dr. Snehal Patwardhan","Dr. Amrutha Krishnan",
"Dr. Roshita Sharma","Dr. Pallavi Deshmukh","Dr. Apeksha Rao","Dr. Ishika Malhotra",
"Dr. Kavini Subramaniam","Dr. Rachita Singh","Dr. Tanushree Ghosh","Dr. Varsha Iyer",
"Dr. Shravani Patil","Dr. Nivedita Saha","Dr. Purnima Nair"
};
return doctors;}

else if(specialization==("Internal Medicine")){
String[] doctors = {
"Dr. Gaurang Desai","Dr. Aditya Kulal","Dr. Nishith Rao","Dr. Harshvardhan S",
"Dr. Mohanraj Pillai","Dr. Vivek Bharadwaj","Dr. Arpit Solanki","Dr. Shyam Sundar",
"Dr. Teerth Patel","Dr. Kanishk Arora","Dr. Lakshman Murthy","Dr. Devashish Roy",
"Dr. Tapan Chakraborty","Dr. Nikhilesh Naidu","Dr. Rohanish Gowda"
};
return doctors;}

else if(specialization==("Mental Health and Behavioural Sciences")){
String[] doctors = {
"Dr. Riya Sengupta","Dr. Meenal Kapoor","Dr. Harini Kulshreshtha","Dr. Tanvika Rao",
"Dr. Shraddha Soni","Dr. Niharika Bansal","Dr. Aditi Borkar","Dr. Saanvi Deshpande",
"Dr. Pallavika Mehra","Dr. Aashna Thomas","Dr. Ishwari Kulkarni","Dr. Shreelakshmi N",
"Dr. Navya Raghavan","Dr. Roshna Kamat","Dr. Vaishnavi Pillai"
};
return doctors;}

else if(specialization==("Nephrology")){
String[] doctors = {
"Dr. Kedar Kulkarni","Dr. Ashutosh Pandey","Dr. Raghavendra Bhat","Dr. Yuvraj Singh",
"Dr. Santhosh Nambiar","Dr. Ritesh Kulal","Dr. Pranay Mishra","Dr. Harshit Verma",
"Dr. Devyank Joshi","Dr. Adwait Kulshrestha","Dr. Manvendra Iyer","Dr. Sharath Rao",
"Dr. Arjun Thakur","Dr. Lakshit Jain","Dr. Pravin Desai"
};
return doctors;}

else if(specialization==("Neurointerventional Radiology")){
String[] doctors = {
"Dr. Yagnesh Patel","Dr. Rithvik Nair","Dr. Advaith Shetty","Dr. Sankalp Sharma",
"Dr. Hemanth Kulkarni","Dr. Prerit Malhotra","Dr. Darshith Rao","Dr. Chinmay Deshpande",
"Dr. Raghul Krishnan","Dr. Arhaad Kapoor","Dr. Siddhesh Bhat","Dr. Tanishq Mehra",
"Dr. Varadaraj Iyer","Dr. Hriday Sen","Dr. Omkar Gokhale"
};
return doctors;}

else if(specialization==("Neurology")){
String[] doctors = {
"Dr. Sriram Iyer","Dr. Aniket Joshi","Dr. Ronav Shah","Dr. Devansh Kulal",
"Dr. Nishad Verma","Dr. Harshith Gowda","Dr. Tanay Kulkarni","Dr. Akhil Reddy",
"Dr. Yashwant Bhat","Dr. Adarsh Menon","Dr. Rachit Tandon","Dr. Nandan Pillai",
"Dr. Tejomay Rao","Dr. Vishrant Kulshreshtha","Dr. Rithesh Pai"
};
return doctors;}

else if(specialization==("Neurosurgery")){
String[] doctors = {
"Dr. Aaryan Khanna","Dr. Koushik Narayan","Dr. Siddhant Arora","Dr. Prithviraj Singh",
"Dr. Mihir Desai","Dr. Gautham Shekar","Dr. Rishit Mehta","Dr. Veeresh Bhat",
"Dr. Arnav Kulal","Dr. Dhrupad Rao","Dr. Sarthak Bedi","Dr. Kiranmay Iyer",
"Dr. Haridev Nair","Dr. Lakshya Chandra","Dr. Parthiv Mukherjee"
};
return doctors;}

else if(specialization==("Obstetrics and Gynaecology")){
String[] doctors = {
"Dr. Sushmita K","Dr. Lavanya Reddy","Dr. Haripriya Menon","Dr. Meera Kulkarni",
"Dr. Tanvika Jain","Dr. Shruti Iyer","Dr. Bhavani Rao","Dr. Niharika S",
"Dr. Rupal Deshmukh","Dr. Saanika Pillai","Dr. Ishita Kapoor","Dr. Charulatha M",
"Dr. Aakriti Sharma","Dr. Pranitha Gowda","Dr. Vaidehi Narayan"
};
return doctors;}

else if(specialization==("Oncology")){
String[] doctors = {
"Dr. Arijit Banerjee","Dr. Keshav Menon","Dr. Nimit Shah","Dr. Rohansh Kulkarni",
"Dr. Devyash Patel","Dr. Sudeep Chandra","Dr. Anay Bhat","Dr. Viraj Mehta",
"Dr. Kartikeya Rao","Dr. Shourya Singh","Dr. Pranav Pillai","Dr. Aviral Desai",
"Dr. Neel Madhav","Dr. Raghunath Iyer","Dr. Tathagata Sen"
};
return doctors;}

else if(specialization==("Ophthalmology")){
String[] doctors = {
"Dr. Harshika Rao","Dr. Nivedh Iyer","Dr. Pranjal Mehta","Dr. Aaryav Kulkarni",
"Dr. Rishika Sharma","Dr. Tanmay Bhat","Dr. Devika Nair","Dr. Kavin Patel",
"Dr. Shravan Desai","Dr. Ishaan Kapoor","Dr. Mrinalini Sen","Dr. Adit Joshi",
"Dr. Yuvika Reddy","Dr. Prithu Narayan","Dr. Keshini Thomas"
};
return doctors;}

else if(specialization==("Organ Transplant")){
String[] doctors = {
"Dr. Raghudev Singh","Dr. Samanth Rao","Dr. Arindam Ghosh","Dr. Karthav Shetty",
"Dr. Dhananjay Kulal","Dr. Abeer Khan","Dr. Vivekanand Iyer","Dr. Rishab Soni",
"Dr. Shaunak Deshpande","Dr. Tirthankar Bose","Dr. Pradyot Nair","Dr. Lakshay Verma",
"Dr. Nandan Krishnan","Dr. Prabodh Patil","Dr. Satyarth Mehra"
};
return doctors;}

else if(specialization==("Orthopaedics")){
String[] doctors = {
"Dr. Vimal Raj","Dr. Koushal Jain","Dr. Pranesh Gowda","Dr. Arpit Kulshreshtha",
"Dr. Tanveer Ahmed","Dr. Shrikant Iyer","Dr. Rithvik Sharma","Dr. Nilesh Patwardhan",
"Dr. Harshit Bansal","Dr. Darpan Mehta","Dr. Yagnesh Kulkarni","Dr. Rohil Kapoor",
"Dr. Sudev Reddy","Dr. Manvik Rao","Dr. Chirayu Thomas"
};
return doctors;}

else if(specialization == ("Paediatrics")){
String[] doctors = {
"Dr. Aahana Iyer","Dr. Mihika Rao","Dr. Tanisha Kapoor","Dr. Nupura Menon",
"Dr. Rachana Jain","Dr. Devyani Bhat","Dr. Shreelatha K","Dr. Aishika Sen",
"Dr. Kavisha Patel","Dr. Meghana S","Dr. Vaanya Sharma","Dr. Rithika Pillai",
"Dr. Niharika Das","Dr. Shalini Mehra","Dr. Pranavi Kulkarni"
};
return doctors;}

else if(specialization == ("Physiotherapy and Rehabilitation")){
String[] doctors = {
"Dr. Yashodhara M","Dr. Karthikeya Rao","Dr. Sandeepan Bose","Dr. Aditri Singh",
"Dr. Varunesh Iyer","Dr. Nishtha Kulal","Dr. Pratham Shah","Dr. Shreyas Patil",
"Dr. Harini Thomas","Dr. Aviral Kulkarni","Dr. Nivedan Reddy","Dr. Ishwar Desai",
"Dr. Roshith Naidu","Dr. Shravanthi Gowda","Dr. Tanvika Chandra"
};
return doctors;}

else if(specialization == ("Plastic and Reconstructive Surgery")){
String[] doctors = {
"Dr. Aarav Mehra","Dr. Nishika Rao","Dr. Devraj Kulkarni","Dr. Ruhan Kapoor",
"Dr. Aishwika Sen","Dr. Tanish Bhat","Dr. Pranay Sood","Dr. Ishir Nair",
"Dr. Kavya Deshmukh","Dr. Shaurya Iyer","Dr. Vihana Patel","Dr. Adhrit Verma",
"Dr. Riyaansh Malhotra","Dr. Tanirika Bose","Dr. Yuvansh Pillai"
};
return doctors;}

else if(specialization == ("Pulmonology")){
String[] doctors = {
"Dr. Sarthak Reddy","Dr. Mihir Kulal","Dr. Prisha Jain","Dr. Advik Narayan",
"Dr. Rachit Shetty","Dr. Devanshi Patel","Dr. Kavin Bansal","Dr. Yuvraj Iyer",
"Dr. Harleen Kaur","Dr. Naitik Desai","Dr. Ishani Kapoor","Dr. Rithesh Thomas",
"Dr. Tanmayee Rao","Dr. Aaryaman Singh","Dr. Shreyan Ghosh"
};
return doctors;}

else if(specialization == ("Radiology")){
String[] doctors = {
"Dr. Ahaan Bhat","Dr. Nivaan Mehta","Dr. Roshini Kulkarni","Dr. Pradyumna Iyer",
"Dr. Kavish Soni","Dr. Shravanika Das","Dr. Yashika Reddy","Dr. Aarush Nambiar",
"Dr. Devika Shah","Dr. Rithika Bose","Dr. Tanvay Sharma","Dr. Mihika Patel",
"Dr. Advaith Kulshrestha","Dr. Saanjh Verma","Dr. Ishwaran Pillai"
};
return doctors;}

else if(specialization == ("Rheumatology")){
String[] doctors = {
"Dr. Aayushman Rao","Dr. Nihar Deshpande","Dr. Kavitha Bansal","Dr. Prerit Jain",
"Dr. Sahana Kulkarni","Dr. Ronav Kapoor","Dr. Devyashree Iyer","Dr. Tanveer Shah",
"Dr. Mihika Narayan","Dr. Aarini Patel","Dr. Lakshith Mehra","Dr. Shrivalli Nair",
"Dr. Advaika Singh","Dr. Vardhan Bose","Dr. Yuvika Menon"
};
return doctors;}

else if(specialization == ("Support Specialties")){
String[] doctors = {
"Dr. Harshit Kulal","Dr. Pranaya Iyer","Dr. Aakansha Rao","Dr. Suryansh Mehta",
"Dr. Rishika Pillai","Dr. Devang Shah","Dr. Tanvika Desai","Dr. Yashveer Nair",
"Dr. Kavindra Bhat","Dr. Mihira Kapoor","Dr. Adithya Narayan","Dr. Shreeya Sen",
"Dr. Aaradhya Patel","Dr. Lakshyendra Singh","Dr. Nivedita Bose"
};
return doctors;}

else if(specialization == ("Thoracic Surgery")){
String[] doctors = {
"Dr. Aarush Kulkarni","Dr. Nayanthara Rao","Dr. Praveer Sinha","Dr. Devika Iyer",
"Dr. Raghavendra Pillai","Dr. Tanush Mehta","Dr. Ishvika Kapoor","Dr. Yuvraj Kulal",
"Dr. Mihir Chandra","Dr. Shrivatsa Nair","Dr. Kavish Reddy","Dr. Aaryika Bose",
"Dr. Harshvardhan Patel","Dr. Nandika Shah","Dr. Rithvik Narayan"
};
return doctors;}

else if(specialization == ("Transfusion Medicine")){
String[] doctors = {
"Dr. Saanvi Kulkarni","Dr. Pratham Rao","Dr. Devyani Iyer","Dr. Aayansh Mehra",
"Dr. Nivedhita Sharma","Dr. Tanvir Bhat","Dr. Ishaanika Sen","Dr. Yashodh Jain",
"Dr. Kaviraj Pillai","Dr. Mihika Desai","Dr. Aaradhana Kapoor","Dr. Rishan Thomas",
"Dr. Lakshika Nair","Dr. Adhvik Reddy","Dr. Suryaprakash Bose"
};
return doctors;}

else if(specialization == ("Urology")){
String[] doctors = {
"Dr. Arnav Iyer","Dr. Nishant Kulal","Dr. Devansh Mehta","Dr. Pranitha Rao",
"Dr. Rithesh Kapoor","Dr. Kavisha Sharma","Dr. Yuvika Bhat","Dr. Ahaan Deshmukh",
"Dr. Mihira Pillai","Dr. Tanmay Narayan","Dr. Shravan Patel","Dr. Ishwari Sinha",
"Dr. Lakshman Verma","Dr. Aditi Kulkarni","Dr. Rohit Bose"
};
return doctors;}

else if(specialization == ("Endocrine Surgery")){
String[] doctors = {
"Dr. Sarthika Rao","Dr. Pranav Kulshrestha","Dr. Devika Reddy","Dr. Aaryan Nair",
"Dr. Niharika Desai","Dr. Tanvish Mehta","Dr. Ishir Kapoor","Dr. Yashita Sen",
"Dr. Kavya Narayan","Dr. Mihir Shah","Dr. Aarav Pillai","Dr. Roshini Kulal",
"Dr. Lakshit Iyer","Dr. Aditya Bose","Dr. Shruthi Patel"
};
return doctors;}

else if(specialization == ("Vascular Surgery")){
String[] doctors = {
"Dr. Aaryav Deshmukh","Dr. Nishika Rao","Dr. Devraj Mehta","Dr. Pranav Sinha",
"Dr. Rithika Kulkarni","Dr. Kavish Nair","Dr. Yuvraj Shah","Dr. Aahana Iyer",
"Dr. Mihir Patel","Dr. Tanvika Bose","Dr. Ishaan Reddy","Dr. Lakshya Kapoor",
"Dr. Saanjh Narayan","Dr. Rohini Kulal","Dr. Varun Chandra"
};
return doctors;}

else if(specialization == ("Liver Transplant and Hepatobiliary Sciences")){
String[] doctors = {
"Dr. Aarini Desai","Dr. Nishith Rao","Dr. Devanshi Kulkarni","Dr. Prayan Mehta",
"Dr. Raghunav Pillai","Dr. Kavitha Sinha","Dr. Yuvansh Iyer","Dr. Aadhira Kapoor",
"Dr. Mihit Narayan","Dr. Tanirika Shah","Dr. Ishwar Kulal","Dr. Lakshita Bose",
"Dr. Shravanth Reddy","Dr. Adhira Nair","Dr. Varsha Patel"
};
return doctors;}

else if(specialization == ("Palliative Medicine")){
String[] doctors = {
"Dr. Saanvika Mehra","Dr. Prithu Rao","Dr. Devika Kulshreshtha","Dr. Aarav Shah",
"Dr. Niharika Iyer","Dr. Tanmay Deshpande","Dr. Ishika Reddy","Dr. Yashwant Kapoor",
"Dr. Kaviraj Narayan","Dr. Mihira Bose","Dr. Aaryan Pillai","Dr. Lakshmi Verma",
"Dr. Shrivani Kulal","Dr. Rithvik Sen","Dr. Aditya Chandra"
};
return doctors;}

else if(specialization == ("Medical Genetics")){
String[] doctors = {
"Dr. Aadhvik Sharma","Dr. Nishka Rao","Dr. Devyash Mehta","Dr. Pranavi Kulkarni",
"Dr. Rithesh Iyer","Dr. Kavini Patel","Dr. Yuvraj Bose","Dr. Aishani Desai",
"Dr. Mihir Nair","Dr. Tanvay Kapoor","Dr. Ishaanika Sen","Dr. Lakshman Shah",
"Dr. Shraddhanjali Pillai","Dr. Rohit Kulal","Dr. Varunika Reddy"
};
return doctors;}

else if(specialization == ("Pain and Palliative Medicine")){
String[] doctors = {
"Dr. Aarushi Jain","Dr. Nishant Reddy","Dr. Devendra Kulkarni","Dr. Pranith Rao",
"Dr. Rachita Mehta","Dr. Kavish Iyer","Dr. Yuvika Sharma","Dr. Aaryav Bose",
"Dr. Mihika Pillai","Dr. Tanmayee Desai","Dr. Ishir Kapoor","Dr. Lakshit Narayan",
"Dr. Shreya Kulal","Dr. Rohansh Verma","Dr. Vardhini Sen"
};
return doctors;}

else if(specialization == ("Geriatric Medicine")){
String[] doctors = {
"Dr. Aahan Patel","Dr. Nishita Iyer","Dr. Devika Rao","Dr. Pratham Kulshrestha",
"Dr. Rithika Mehra","Dr. Kavya Bose","Dr. Yashveer Shah","Dr. Aditi Narayan",
"Dr. Mihir Deshmukh","Dr. Tanushri Nair","Dr. Ishwar Singh","Dr. Lakshmi Kulal",
"Dr. Shravan Kapoor","Dr. Rohini Reddy","Dr. Varunika Jain"
};
return doctors;}


else if(specialization==("Neurology")){
String[] doctors = {
"Dr. Sriram Iyer","Dr. Aniket Joshi","Dr. Ronav Shah","Dr. Devansh Kulal",
"Dr. Nishad Verma","Dr. Harshith Gowda","Dr. Tanay Kulkarni","Dr. Akhil Reddy",
"Dr. Yashwant Bhat","Dr. Adarsh Menon","Dr. Rachit Tandon","Dr. Nandan Pillai",
"Dr. Tejomay Rao","Dr. Vishrant Kulshreshtha","Dr. Rithesh Pai"
};
return doctors;}

else if(specialization==("Neurosurgery")){
String[] doctors = {
"Dr. Aaryan Khanna","Dr. Koushik Narayan","Dr. Siddhant Arora","Dr. Prithviraj Singh",
"Dr. Mihir Desai","Dr. Gautham Shekar","Dr. Rishit Mehta","Dr. Veeresh Bhat",
"Dr. Arnav Kulal","Dr. Dhrupad Rao","Dr. Sarthak Bedi","Dr. Kiranmay Iyer",
"Dr. Haridev Nair","Dr. Lakshya Chandra","Dr. Parthiv Mukherjee"
};
return doctors;}

else if(specialization==("Obstetrics and Gynaecology")){
String[] doctors = {
"Dr. Sushmita K","Dr. Lavanya Reddy","Dr. Haripriya Menon","Dr. Meera Kulkarni",
"Dr. Tanvika Jain","Dr. Shruti Iyer","Dr. Bhavani Rao","Dr. Niharika S",
"Dr. Rupal Deshmukh","Dr. Saanika Pillai","Dr. Ishita Kapoor","Dr. Charulatha M",
"Dr. Aakriti Sharma","Dr. Pranitha Gowda","Dr. Vaidehi Narayan"
};
return doctors;}

else if(specialization==("Oncology")){
String[] doctors = {
"Dr. Arijit Banerjee","Dr. Keshav Menon","Dr. Nimit Shah","Dr. Rohansh Kulkarni",
"Dr. Devyash Patel","Dr. Sudeep Chandra","Dr. Anay Bhat","Dr. Viraj Mehta",
"Dr. Kartikeya Rao","Dr. Shourya Singh","Dr. Pranav Pillai","Dr. Aviral Desai",
"Dr. Neel Madhav","Dr. Raghunath Iyer","Dr. Tathagata Sen"
};
return doctors;}

else if(specialization==("Ophthalmology")){
String[] doctors = {
"Dr. Harshika Rao","Dr. Nivedh Iyer","Dr. Pranjal Mehta","Dr. Aaryav Kulkarni",
"Dr. Rishika Sharma","Dr. Tanmay Bhat","Dr. Devika Nair","Dr. Kavin Patel",
"Dr. Shravan Desai","Dr. Ishaan Kapoor","Dr. Mrinalini Sen","Dr. Adit Joshi",
"Dr. Yuvika Reddy","Dr. Prithu Narayan","Dr. Keshini Thomas"
};
return doctors;}

else if(specialization==("Organ Transplant")){
String[] doctors = {
"Dr. Raghudev Singh","Dr. Samanth Rao","Dr. Arindam Ghosh","Dr. Karthav Shetty",
"Dr. Dhananjay Kulal","Dr. Abeer Khan","Dr. Vivekanand Iyer","Dr. Rishab Soni",
"Dr. Shaunak Deshpande","Dr. Tirthankar Bose","Dr. Pradyot Nair","Dr. Lakshay Verma",
"Dr. Nandan Krishnan","Dr. Prabodh Patil","Dr. Satyarth Mehra"
};
return doctors;}

else if(specialization==("Orthopaedics")){
String[] doctors = {
"Dr. Vimal Raj","Dr. Koushal Jain","Dr. Pranesh Gowda","Dr. Arpit Kulshreshtha",
"Dr. Tanveer Ahmed","Dr. Shrikant Iyer","Dr. Rithvik Sharma","Dr. Nilesh Patwardhan",
"Dr. Harshit Bansal","Dr. Darpan Mehta","Dr. Yagnesh Kulkarni","Dr. Rohil Kapoor",
"Dr. Sudev Reddy","Dr. Manvik Rao","Dr. Chirayu Thomas"
};
return doctors;}


else {System.out.println("No doctors found");}
return null;
}
static void getDoctors(String [] doctors){
for(String doctor : doctors){
System.out.println(doctor);
}
System.out.println("above is the doctor list");


}}
