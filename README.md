# Firebase Authentication

<details>
<summary><b>Java file</b></summary>
<br>
<ul>
<li>MainActivity</li>
<li>ResetPassword</li>
<li>SignIn</li>
<li>SignUp</li>
<ul>
</details>
<details>
<summary><b>XML file</b></summary>
<br>
<ul>
<li>activity_main</li>
<li>activity_reset_password</li>
<li>activity_sign_in</li>
<li>activity_sign_up</li>
<ul>
</details>
<details>
<summary><b>Menu directory</b></summary>
<br>
<ul>
<li>menu_layout</li>
<ul>
</details>
<br>

   <details>
    <summary><b>1. Open firebase console panel</b></summary>
    <br>
    <ul>
    <li>
![console](https://user-images.githubusercontent.com/81482212/151155743-af1ad8a4-a764-458a-8461-ac55ed814ce6.png)  
    </li>
    <ul>
    </details>
    <br>

# Short Course
### **Step 1: Open Your android project**

### **Step 2: Connect Firebase to your project**
 <details>
    <summary><b>1. Open firebase console panel</b></summary>
    <br>
    
![console](https://user-images.githubusercontent.com/81482212/151155743-af1ad8a4-a764-458a-8461-ac55ed814ce6.png) 
    
 </details>
    
        
 <details>
    <summary><b>2. Click on add project</b></summary>
    <br>
    
![image](https://user-images.githubusercontent.com/81482212/151156201-ed14e55b-46b1-4996-bb07-55da96a54bfa.png)
    
 </details>
    
  
 <details>
    <summary><b>3. Enter your project name</b></summary>
    <br>
    
![image](https://user-images.githubusercontent.com/81482212/151156548-d97c50ff-a4ae-4cb3-a145-4872148e0fa1.png)
    
 </details>
 <details>
    <summary><b>4. Create Project</b></summary>
    <br>
    
![image](https://user-images.githubusercontent.com/81482212/151156736-44d1b495-705d-4c83-b3bc-f6b3f09146a3.png)
    
 </details>
 <details>
    <summary><b>5. Click android</b></summary>
    <br>
    
![image](https://user-images.githubusercontent.com/81482212/151156865-8e5e7a15-3efa-4807-9356-1e29ebf717d9.png)
    
 </details>
 <details>
    <summary><b>6. Fill up the package name of your android project (You will get it on your android project)</b></summary>
    <br>
    
![image](https://user-images.githubusercontent.com/81482212/151157212-7cb55412-21c0-4d8e-8651-e3379de56127.png)
![image](https://user-images.githubusercontent.com/81482212/151157293-820b3b9f-3011-4015-aa65-7cb7df5540b8.png)
    
 </details>
 <details>
    <summary><b>7. Download the google service jeson file & paste it on app folder of your android project.</b></summary>
    <br>
    
![image](https://user-images.githubusercontent.com/81482212/151157610-d183ddd4-dfd9-4ad9-9481-95fbf96b1317.png)
![image](https://user-images.githubusercontent.com/81482212/151157827-b5baeac2-254c-4cc4-9ec9-8a22d7b14dc9.png)
    
 </details>
 <details>
    <summary><b>8. Add this line on your project level build.gradle</b></summary>
    <br>
    
![image](https://user-images.githubusercontent.com/81482212/151158091-56b31d03-ed8b-452e-bdeb-ab1d49a2de1d.png)
![image](https://user-images.githubusercontent.com/81482212/151158208-6a5b9e16-7287-4bee-9b8f-70d7b68fd675.png)
    
 </details>
 <details>
    <summary><b>9. Add these lines on your app level build.gradle </b></summary>
    <br>
    
![image](https://user-images.githubusercontent.com/81482212/151158443-60fd2f7e-42e5-4e8a-a43c-106ac42e9a4a.png)
![image](https://user-images.githubusercontent.com/81482212/151158616-b14cb4b3-d413-4b4b-983f-326ac463b0d9.png)
    
 </details>
 <details>
    <summary><b>10. Add Firebase auth dependency line from firebase documentations</b></summary>
    <br>
    
![image](https://user-images.githubusercontent.com/81482212/151159156-31c59257-8353-4b49-9004-d30c9a866550.png)
    
 </details>
 <details>
    <summary><b>11. Sync the project</b></summary>
    <br>
    
![image](https://user-images.githubusercontent.com/81482212/151158827-faf0aff3-ea01-4d8c-8c2b-2d26a947f44a.png)
    
 </details>
 <details>
    <summary><b>12. Firebase Authentication Connected (Done !)</b></summary>
    <br>
    
    
 </details>
    



- ### **Step 3:**
    ##### Copy paste the codes
    
     ### 1. Make/Copy 3 new activities. ResetPassword,SignIn,SignUp  
    
    ![image](https://user-images.githubusercontent.com/81482212/151159966-de6e51c5-5183-478a-915f-a96e4766d630.png)
    
     ### 2. Copy & paste the whole menu directory (including menu_layout file) on resource folder
    
    ![image](https://user-images.githubusercontent.com/81482212/151160513-93a2f730-1924-4f0f-a56f-aa13657cb8fa.png)
    
     ### 3. Now copy & paste the ResetPassword java file
    
    ![image](https://user-images.githubusercontent.com/81482212/151162495-38b6403c-17a9-44f7-ab68-9df2adf3c137.png)
    
    ```java
         public class ResetPassword extends AppCompatActivity {

            /*This is reset password activity

              here firebase reset password codes.
          */

          private EditText registeredEmailEditText;
          private TextView resetInfoTextView;
          private Button resetPassButton;
          private FirebaseAuth mAuth;
          private ProgressBar progressBar;

          @Override
          protected void onCreate(Bundle savedInstanceState) {
              super.onCreate(savedInstanceState);
              setContentView(R.layout.activity_reset_password);

              registeredEmailEditText = findViewById(R.id.registeredEmailEditTextId);
              resetPassButton = findViewById(R.id.resetPassButtonId);
              resetInfoTextView = findViewById(R.id.resetInfoTextView);
              progressBar = findViewById(R.id.progressbarId);
              mAuth = FirebaseAuth.getInstance();

              resetPassButton.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View view) {

                      resetPassword();

                  }
              });



          }

          private void resetPassword() {

              String email = registeredEmailEditText.getText().toString();
              progressBar.setVisibility(View.VISIBLE);

              mAuth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
                  @Override
                  public void onComplete(@NonNull Task<Void> task) {

                      if (task.isSuccessful()){
                          progressBar.setVisibility(View.GONE);
                          resetInfoTextView.setVisibility(View.VISIBLE);
                          Toast.makeText(getApplicationContext(), "Password Reset Email ", Toast.LENGTH_SHORT).show();
                          resetInfoTextView.setText("Check your email. Reset Password Has Been Sent On "+email);
                          resetPassButton.setEnabled(false);

                      }else {
                          progressBar.setVisibility(View.GONE);
                          Toast.makeText(getApplicationContext(), "Something Went Wrong ", Toast.LENGTH_SHORT).show();

                      }

                  }
              });

          }
      } 
    
    ```
    
     ### 4. Now copy & paste the SignIn java file
    
    ![image](https://user-images.githubusercontent.com/81482212/151163465-a23583df-c907-4aa0-a2bf-e086e23f4b1b.png)
    
     ```java
        public class SignIn extends AppCompatActivity {

            /* Sign in activity here

            Firebase signin activity codes here.

          */

          private EditText signInEmailEditText, signInPasswordEditText;
          private TextView signUpTextView,forgotPassTextView;
          private Button signInButton;

          private ProgressBar progressBar;

          private FirebaseAuth mAuth;

          @Override
          protected void onCreate(Bundle savedInstanceState) {
              super.onCreate(savedInstanceState);
              setContentView(R.layout.activity_sign_in);
              this.setTitle("Sign In Activity");

              signInEmailEditText = findViewById(R.id.signInEmailEditTextId);
              signInPasswordEditText = findViewById(R.id.signInPasswordTextId);
              signInButton = findViewById(R.id.signInButtonId);
              signUpTextView = findViewById(R.id.signUpTextViewId);
              forgotPassTextView = findViewById(R.id.forgotPassTextViewId);
              progressBar = findViewById(R.id.progressbarId);

              mAuth = FirebaseAuth.getInstance();



              signUpTextView.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View view) {
                      Intent intent = new Intent(getApplicationContext(),SignUp.class);
                      startActivity(intent);
                  }
              });

              forgotPassTextView.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View view) {
                      Intent intent = new Intent(getApplicationContext(),ResetPassword.class);
                      startActivity(intent);
                  }
              });

              signInButton.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View view) {

                      userLogin();

                  }
              });
          }

          private void userLogin() {


              String email = signInEmailEditText.getText().toString().trim();
              String password = signInPasswordEditText.getText().toString().trim();


              // validation check
              if(email.isEmpty()){

                  signInEmailEditText.setError("Enter an email address");
                  signInEmailEditText.requestFocus();
                  return;
              }

              if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){

                  signInEmailEditText.setError("Enter a valid email address");
                  signInEmailEditText.requestFocus();
                  return;
              }
              if(password.isEmpty()){

                  signInPasswordEditText.setError("Enter a password");
                  signInPasswordEditText.requestFocus();
                  return;
              }
              if(password.length()<6){

                  signInPasswordEditText.setError("Minimum length of a password should be 6");
                  signInPasswordEditText.requestFocus();
                  return;
              }

              progressBar.setVisibility(View.VISIBLE); // progress bar start to show

              mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                  @Override
                  public void onComplete(@NonNull Task<AuthResult> task) {

                      progressBar.setVisibility(View.GONE); // progress bar finish

                      if(task.isSuccessful()){

                          finish();  //finish the previous activity so that the login page dont show again after login
                          Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                          intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                          startActivity(intent);


                      }
                      else {
                          Toast.makeText(getApplicationContext(), "Login Unsuccessful", Toast.LENGTH_SHORT).show();
                      }


                  }
              });


          }
      }
    
     ```
     

     ### 5. Now copy & paste SignUp Java file
     ![image](https://user-images.githubusercontent.com/81482212/151164583-25ef770b-0e03-4003-b34e-46936cc9d6ff.png)

 ```java
       public class SignUp extends AppCompatActivity {


          /*This is signup activity

          Firebase signUp codes here

           */


          private EditText signUpEmailEditText, signUpPasswordEditText;
          private TextView signInTextView;
          private Button signUpButton;
          private FirebaseAuth mAuth;
          private ProgressBar progressBar;


          @Override
          protected void onCreate(Bundle savedInstanceState) {
              super.onCreate(savedInstanceState);
              setContentView(R.layout.activity_sign_up);

              mAuth = FirebaseAuth.getInstance();
              progressBar = findViewById(R.id.progressbarId);

              signUpEmailEditText = findViewById(R.id.signUpEmailEditTextId);
              signUpPasswordEditText = findViewById(R.id.signUpPasswordTextId);
              signUpButton = findViewById(R.id.signUpButtonId);
              signInTextView = findViewById(R.id.signInTextViewId);

              signInTextView.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View view) {
                      Intent intent = new Intent(getApplicationContext(), SignIn.class);
                      startActivity(intent);
                  }
              });

              signUpButton.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View view) {

                      userRegister();

                  }


              });


          }

          private void userRegister() {

              String email = signUpEmailEditText.getText().toString().trim();
              String password = signUpPasswordEditText.getText().toString().trim();


              if(email.isEmpty()){

                  signUpEmailEditText.setError("Enter an email address");
                  signUpEmailEditText.requestFocus();
                  return;
              }

              if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){

                  signUpEmailEditText.setError("Enter a valid email address");
                  signUpEmailEditText.requestFocus();
                  return;
              }
              if(password.isEmpty()){

                  signUpPasswordEditText.setError("Enter a password");
                  signUpPasswordEditText.requestFocus();
                  return;
              }
              if(password.length()<6){

                  signUpPasswordEditText.setError("Minimum length of a password should be 6");
                  signUpPasswordEditText.requestFocus();
                  return;
              }

              progressBar.setVisibility(View.VISIBLE);

              mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                  @Override
                  public void onComplete(@NonNull Task<AuthResult> task) {

                      progressBar.setVisibility(View.GONE);
                      if (task.isSuccessful()) {

                          finish();
                          Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                          intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                          startActivity(intent);

                      } else {

                          if(task.getException() instanceof FirebaseAuthUserCollisionException){

                              Toast.makeText(getApplicationContext(), "User is already Registered", Toast.LENGTH_SHORT).show();
                          }
                          else{
                              Toast.makeText(getApplicationContext(), "Error : "+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                          }
                      }

                  }
              });



          }
      }
  ```
  
   ### 5. Now copy & paste activity_reset_password xml file
   ![image](https://user-images.githubusercontent.com/81482212/151165852-38b4040d-1885-4bf9-936a-99af4248f182.png)


 ```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".ResetPassword">

    <EditText
        android:id="@+id/registeredEmailEditTextId"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:ems="10"
        android:layout_margin="10dp"
        android:inputType="textPersonName"
        android:text="Registered Email" />

    <Button
        android:id="@+id/resetPassButtonId"
        android:layout_margin="20dp"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Reset Password" />

    <TextView
        android:id="@+id/resetInfoTextView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_margin="10dp"
        android:gravity="center"
        android:textStyle="bold"
        android:visibility="invisible"
        android:text="Check your email. Reset Password Has Been Sent On" />

    <ProgressBar
        android:visibility="gone"
        android:layout_gravity="center"
        android:id="@+id/progressbarId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/>


</LinearLayout>
  ```
  
   ### 6. Now copy & paste activity-sign_in xml file
   ![image](https://user-images.githubusercontent.com/81482212/151166304-9f5bdba1-5fbb-4454-b698-fd92b701be14.png)


 ```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".SignIn">



    <EditText
        android:id="@+id/signInEmailEditTextId"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:ems="10"
        android:layout_margin="10dp"
        android:inputType="textPersonName"
        android:text="Email" />

    <EditText
        android:id="@+id/signInPasswordTextId"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:ems="10"
        android:layout_margin="10dp"
        android:inputType="textPersonName"
        android:text="Password" />

    <Button
        android:id="@+id/signInButtonId"
        android:layout_margin="20dp"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="SignIn" />

    <TextView
        android:id="@+id/forgotPassTextViewId"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="right"
        android:layout_margin="15dp"
        android:textStyle="bold"
        android:text="Forgot Password ?" />

    <TextView
        android:id="@+id/signUpTextViewId"
        android:layout_margin="10dp"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="center"
        android:textStyle="bold"
        android:text="Are you not registered? please Sign Up" />

    <ProgressBar
        android:visibility="gone"
        android:layout_gravity="center"
        android:id="@+id/progressbarId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/>


</LinearLayout>
  ```
  
   ### 7. Now copy & paste activity_sign_up xml file
   ![image](https://user-images.githubusercontent.com/81482212/151166527-4aa3e41f-edd0-4d2c-8ae9-fd95834e75fa.png)


 ```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".SignUp">



    <EditText
        android:id="@+id/signUpEmailEditTextId"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:ems="10"
        android:layout_margin="10dp"
        android:inputType="textPersonName"
        android:text="Email" />

    <EditText
        android:id="@+id/signUpPasswordTextId"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:ems="10"
        android:layout_margin="10dp"
        android:inputType="textPersonName"
        android:text="Password" />

    <Button
        android:id="@+id/signUpButtonId"
        android:layout_margin="20dp"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="SignUp" />

    <TextView
        android:id="@+id/signInTextViewId"
        android:layout_margin="10dp"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="center"
        android:textStyle="bold"
        android:text="Are you registered already? please Sign In" />

    <ProgressBar
        android:visibility="gone"
        android:layout_gravity="center"
        android:id="@+id/progressbarId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/>
</LinearLayout>
  ```
  
  ### 8. Import all the classes (ALT+Ent)
  
  ### 9. Done
  
  
  
      

  
     
  
    
    



 









    











