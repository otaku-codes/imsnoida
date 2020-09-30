package com.himanshu.myimsguide;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.himanshu.myimsguide.bba.BbaFragment;
import com.himanshu.myimsguide.bba.semester2.BbaSemster2Subjects;
import com.himanshu.myimsguide.bba.semester4.BbaSemster4Subjects;
import com.himanshu.myimsguide.bba.semester6.BbaSemster6Subjects;
import com.himanshu.myimsguide.bca.BcaFragment;
import com.himanshu.myimsguide.bca.semester1.BCASemester1SubjectBc;
import com.himanshu.myimsguide.bca.semester1.BCASemester1SubjectCfoa;
import com.himanshu.myimsguide.bca.semester1.BCASemester1SubjectMaths1;
import com.himanshu.myimsguide.bca.semester1.BCASemester1SubjectPom;
import com.himanshu.myimsguide.bca.semester1.BCASemester1SubjectPpa;
import com.himanshu.myimsguide.bca.semester1.BCASemester1Subjects;
import com.himanshu.myimsguide.bca.semester1.BcaSem1NotesBc;
import com.himanshu.myimsguide.bca.semester1.BcaSem1NotesCfoa;
import com.himanshu.myimsguide.bca.semester1.BcaSem1NotesMaths1;
import com.himanshu.myimsguide.bca.semester1.BcaSem1NotesPom;
import com.himanshu.myimsguide.bca.semester1.BcaSem1NotesPpa;
import com.himanshu.myimsguide.bca.semester1.BcaSem1PapersBc;
import com.himanshu.myimsguide.bca.semester1.BcaSem1PapersCfoa;
import com.himanshu.myimsguide.bca.semester1.BcaSem1PapersMaths1;
import com.himanshu.myimsguide.bca.semester1.BcaSem1PapersPom;
import com.himanshu.myimsguide.bca.semester1.BcaSem1PapersPpa;
import com.himanshu.myimsguide.bca.semester2.BCASemester2SubjectC;
import com.himanshu.myimsguide.bca.semester2.BCASemester2SubjectDe;
import com.himanshu.myimsguide.bca.semester2.BCASemester2SubjectFam;
import com.himanshu.myimsguide.bca.semester2.BCASemester2SubjectMaths2;
import com.himanshu.myimsguide.bca.semester2.BCASemester2SubjectOb;
import com.himanshu.myimsguide.bca.semester2.BCASemester2Subjects;
import com.himanshu.myimsguide.bca.semester2.BcaSem2NotesC;
import com.himanshu.myimsguide.bca.semester2.BcaSem2NotesDe;
import com.himanshu.myimsguide.bca.semester2.BcaSem2NotesFam;
import com.himanshu.myimsguide.bca.semester2.BcaSem2NotesMaths2;
import com.himanshu.myimsguide.bca.semester2.BcaSem2NotesOb;
import com.himanshu.myimsguide.bca.semester2.BcaSem2PapersC;
import com.himanshu.myimsguide.bca.semester2.BcaSem2PapersDe;
import com.himanshu.myimsguide.bca.semester2.BcaSem2PapersFam;
import com.himanshu.myimsguide.bca.semester2.BcaSem2PapersMaths2;
import com.himanshu.myimsguide.bca.semester2.BcaSem2PapersOb;
import com.himanshu.myimsguide.bca.semester3.BCASemester3SubjectBe;
import com.himanshu.myimsguide.bca.semester3.BCASemester3SubjectCaal;
import com.himanshu.myimsguide.bca.semester3.BCASemester3SubjectDs;
import com.himanshu.myimsguide.bca.semester3.BCASemester3SubjectFam;
import com.himanshu.myimsguide.bca.semester3.BCASemester3SubjectOops;
import com.himanshu.myimsguide.bca.semester3.BCASemester3Subjects;
import com.himanshu.myimsguide.bca.semester3.BcaSem3NotesBe;
import com.himanshu.myimsguide.bca.semester3.BcaSem3NotesCaal;
import com.himanshu.myimsguide.bca.semester3.BcaSem3NotesDs;
import com.himanshu.myimsguide.bca.semester3.BcaSem3NotesFam;
import com.himanshu.myimsguide.bca.semester3.BcaSem3NotesOops;
import com.himanshu.myimsguide.bca.semester3.BcaSem3PapersBe;
import com.himanshu.myimsguide.bca.semester3.BcaSem3PapersCaal;
import com.himanshu.myimsguide.bca.semester3.BcaSem3PapersDs;
import com.himanshu.myimsguide.bca.semester3.BcaSem3PapersFam;
import com.himanshu.myimsguide.bca.semester3.BcaSem3PapersOops;
import com.himanshu.myimsguide.bca.semester4.BCASemester4SubjectCgma;
import com.himanshu.myimsguide.bca.semester4.BCASemester4SubjectMaths3;
import com.himanshu.myimsguide.bca.semester4.BCASemester4SubjectOs;
import com.himanshu.myimsguide.bca.semester4.BCASemester4SubjectOt;
import com.himanshu.myimsguide.bca.semester4.BCASemester4SubjectSe;
import com.himanshu.myimsguide.bca.semester4.BCASemester4Subjects;
import com.himanshu.myimsguide.bca.semester4.BcaSem4NotesCgma;
import com.himanshu.myimsguide.bca.semester4.BcaSem4NotesMaths3;
import com.himanshu.myimsguide.bca.semester4.BcaSem4NotesOs;
import com.himanshu.myimsguide.bca.semester4.BcaSem4NotesOt;
import com.himanshu.myimsguide.bca.semester4.BcaSem4NotesSe;
import com.himanshu.myimsguide.bca.semester4.BcaSem4PapersCgma;
import com.himanshu.myimsguide.bca.semester4.BcaSem4PapersMaths3;
import com.himanshu.myimsguide.bca.semester4.BcaSem4PapersOs;
import com.himanshu.myimsguide.bca.semester4.BcaSem4PapersOt;
import com.himanshu.myimsguide.bca.semester4.BcaSem4PapersSe;
import com.himanshu.myimsguide.bca.semester5.BCASemester5SubjectCn;
import com.himanshu.myimsguide.bca.semester5.BCASemester5SubjectDbms;
import com.himanshu.myimsguide.bca.semester5.BCASemester5SubjectJava;
import com.himanshu.myimsguide.bca.semester5.BCASemester5SubjectNm;
import com.himanshu.myimsguide.bca.semester5.BCASemester5Subjects;
import com.himanshu.myimsguide.bca.semester5.BcaSem5NotesCn;
import com.himanshu.myimsguide.bca.semester5.BcaSem5NotesDbms;
import com.himanshu.myimsguide.bca.semester5.BcaSem5NotesJava;
import com.himanshu.myimsguide.bca.semester5.BcaSem5NotesNm;
import com.himanshu.myimsguide.bca.semester5.BcaSem5PapersCn;
import com.himanshu.myimsguide.bca.semester5.BcaSem5PapersDbms;
import com.himanshu.myimsguide.bca.semester5.BcaSem5PapersJava;
import com.himanshu.myimsguide.bca.semester5.BcaSem5PapersNm;
import com.himanshu.myimsguide.bca.semester6.BCASemester6SubjectCns;
import com.himanshu.myimsguide.bca.semester6.BCASemester6SubjectEcom;
import com.himanshu.myimsguide.bca.semester6.BCASemester6SubjectIadi;
import com.himanshu.myimsguide.bca.semester6.BCASemester6SubjectKm;
import com.himanshu.myimsguide.bca.semester6.BCASemester6Subjects;
import com.himanshu.myimsguide.bca.semester6.BcaSem6NotesCns;
import com.himanshu.myimsguide.bca.semester6.BcaSem6NotesEcom;
import com.himanshu.myimsguide.bca.semester6.BcaSem6NotesIadi;
import com.himanshu.myimsguide.bca.semester6.BcaSem6NotesKm;
import com.himanshu.myimsguide.bca.semester6.BcaSem6PapersCns;
import com.himanshu.myimsguide.bca.semester6.BcaSem6PapersEcom;
import com.himanshu.myimsguide.bca.semester6.BcaSem6PapersIadi;
import com.himanshu.myimsguide.bca.semester6.BcaSem6PapersKm;
import com.himanshu.myimsguide.mca.McaFragment;
import com.himanshu.myimsguide.mca.semester3.MCASemester3Subjects;
import com.himanshu.myimsguide.mca.semester3.MCASemester3cbot;
import com.himanshu.myimsguide.mca.semester3.MCASemester3cs;
import com.himanshu.myimsguide.mca.semester3.MCASemester3daa;
import com.himanshu.myimsguide.mca.semester3.MCASemester3iporg;
import com.himanshu.myimsguide.mca.semester3.MCASemester3os;
import com.himanshu.myimsguide.mca.semester3.MCASemester3wt;
import com.himanshu.myimsguide.mca.semester4.MCASemester4Subjects;
import com.himanshu.myimsguide.mca.semester4.MCASemester4ai;
import com.himanshu.myimsguide.mca.semester4.MCASemester4aiNotes;
import com.himanshu.myimsguide.mca.semester4.MCASemester4cd;
import com.himanshu.myimsguide.mca.semester4.MCASemester4cdNotes;
import com.himanshu.myimsguide.mca.semester4.MCASemester4cn;
import com.himanshu.myimsguide.mca.semester4.MCASemester4cnNotes;
import com.himanshu.myimsguide.mca.semester4.MCASemester4dbms;
import com.himanshu.myimsguide.mca.semester4.MCASemester4dbmsNotes;
import com.himanshu.myimsguide.mca.semester4.MCASemester4foda;
import com.himanshu.myimsguide.mca.semester4.MCASemester4fodaNotes;
import com.himanshu.myimsguide.mca.semester4.MCASemester4mc;
import com.himanshu.myimsguide.mca.semester4.MCASemester4mcNotes;
import com.himanshu.myimsguide.mca.semester5.MCASemester5Subjects;
import com.himanshu.myimsguide.mca.semester5.MCASemester5ad;
import com.himanshu.myimsguide.mca.semester5.MCASemester5bd;
import com.himanshu.myimsguide.mca.semester5.MCASemester5cc;
import com.himanshu.myimsguide.mca.semester5.MCASemester5cgma;
import com.himanshu.myimsguide.mca.semester5.MCASemester5se;
import com.google.android.gms.ads.AdView;
import com.google.android.material.navigation.NavigationView;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener,MainFragment.onFragmentBtnSelected{


    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    NavigationView navigationView;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    FrameLayout adContainerView;
    AdView adView;





    public boolean isOnline() {
        ConnectivityManager conMgr = (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = conMgr.getActiveNetworkInfo();

        if(netInfo == null || !netInfo.isConnected() || !netInfo.isAvailable()){


            return false;
        }
        return true;
    }



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        if(item.getItemId() == R.id.home) {

            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container_fragment, new MainFragment());
            fragmentTransaction.commit();
            drawerLayout.closeDrawer(navigationView);
            fragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
        }

        if(item.getItemId() == R.id.next) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container_fragment, new AboutFragment());
            fragmentTransaction.addToBackStack(null).commit();
            drawerLayout.closeDrawer(navigationView);
        }

        if (item.getItemId() == R.id.contact) {

            try{
                Intent intent = new Intent (Intent.ACTION_VIEW , Uri.parse("mailto:" + "asktrickswizard@gmail.com"));
                intent.putExtra(Intent.EXTRA_SUBJECT, "myIMSguide");
                startActivity(intent);
            }catch(ActivityNotFoundException e){
                //TODO smth
            }
            drawerLayout.closeDrawer(navigationView);
        }

        if (item.getItemId() == R.id.chat) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container_fragment, new Ask());
            fragmentTransaction.commit();
            drawerLayout.closeDrawer(navigationView);
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show();}


        if (item.getItemId() == R.id.upload) {
            try{
                Intent intent = new Intent (Intent.ACTION_VIEW , Uri.parse("mailto:" + "asktrickswizard@gmail.com"));
                intent.putExtra(Intent.EXTRA_SUBJECT, "myIMSguide");
                startActivity(intent);
            }catch(ActivityNotFoundException e){
                //TODO smth
            }
            Toast.makeText(this, "Send Notes By Mentioning Your Semester and Name...", Toast.LENGTH_LONG).show();
            drawerLayout.closeDrawer(navigationView);
        }

        if (item.getItemId() == R.id.share) {
            Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            String shareBodyText = "Hey! Checkout this App https://bit.ly/2YmbR0p ";
            sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT,"Subject here");
            sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBodyText);
            startActivity(Intent.createChooser(sharingIntent, "Spread The Knowledge..."));
            drawerLayout.closeDrawer(navigationView);  return true;
        }

        if (item.getItemId() == R.id.rate) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.himanshu.myimsguide")));
        }


        return true;
    }

    @Override
    public void onButtonSelected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new AboutsusFragment());
        fragmentTransaction.addToBackStack(null).commit();
    }
    public void onAskSelected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new Ask());
        fragmentTransaction.addToBackStack(null).commit();
        Toast.makeText(this,"Loading...",Toast.LENGTH_LONG).show();
    }
    public void onEventsSelected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new EventsFragment());
        fragmentTransaction.addToBackStack(null).commit();
    }
    @Override
    public void onExamSelected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new ExamFragment());
        fragmentTransaction.addToBackStack(null).commit();
        Toast.makeText(this,"Latest Examination Schedule",Toast.LENGTH_LONG).show();
    }
    public void onMeetSelected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new AboutFragment());
        fragmentTransaction.addToBackStack(null).commit();
    }
    @Override
    public void onAttendSelected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new AttendFragment());
        fragmentTransaction.addToBackStack(null).commit();
        Toast.makeText(this,"Login Here",Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onCoursesSelected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new CoursesFragment());
        fragmentTransaction.addToBackStack(null).commit();



    }

    //courses here
    public void onBCASelected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaFragment());
        fragmentTransaction.addToBackStack(null).commit();
    }
    public void onBbaSelected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new McaFragment());
        fragmentTransaction.addToBackStack(null).commit();
    }

    //BCA semesters here
    @Override
    public void onBCASem1Selected() {
    fragmentManager = getSupportFragmentManager();
      fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BCASemester1Subjects());
        fragmentTransaction.addToBackStack(null).commit();
    }
    @Override
    public void onBCASem2Selected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BCASemester2Subjects());
        fragmentTransaction.addToBackStack(null).commit();
    }
    @Override
    public void onBCASem3Selected() {
    fragmentManager = getSupportFragmentManager();
       fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BCASemester3Subjects());
        fragmentTransaction.addToBackStack(null).commit();

    }
    @Override
    public void onBCASem4Selected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BCASemester4Subjects());
        fragmentTransaction.addToBackStack(null).commit();
    }
    @Override
    public void onBCASem5Selected() {

      fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BCASemester5Subjects());
        fragmentTransaction.addToBackStack(null).commit();
    }
    @Override
    public void onBCASem6Selected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BCASemester6Subjects());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem1NotesMaths1Selected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem1NotesMaths1());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem1NotesPpaSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem1NotesPpa());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem1NotesCfoaSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem1NotesCfoa());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem1NotesPomSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem1NotesPom());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem1NotesBcSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem1NotesBc());
        fragmentTransaction.addToBackStack(null).commit();
    }


    //BCA semester wise subjects notes
    @Override
    public void onBCASem1PapersMaths1Selected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem1PapersMaths1());
        fragmentTransaction.addToBackStack(null).commit();
    }
    @Override
    public void onBCASem1PapersPpaSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem1PapersPpa());
        fragmentTransaction.addToBackStack(null).commit();
    }
    @Override
    public void onBCASem1PapersCfoaSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem1PapersCfoa());
        fragmentTransaction.addToBackStack(null).commit();
    }
    @Override
    public void onBCASem1PapersPomSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem1PapersPom());
        fragmentTransaction.addToBackStack(null).commit();
    }
    @Override
    public void onBCASem1PapersBcSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem1PapersBc());
        fragmentTransaction.addToBackStack(null).commit();
    }
    @Override
    public void onBCASem2NotesMaths2Selected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem2NotesMaths2());
        fragmentTransaction.addToBackStack(null).commit();
    }
    @Override
    public void onBCASem2NotesCSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem2NotesC());
        fragmentTransaction.addToBackStack(null).commit();
    }
    @Override
    public void onBCASem2NotesObSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem2NotesOb());
        fragmentTransaction.addToBackStack(null).commit();
    }
    @Override
    public void onBCASem2NotesDeSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem2NotesDe());
        fragmentTransaction.addToBackStack(null).commit();
    }
    @Override
    public void onBCASem2NotesFam2Selected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem2NotesFam());
        fragmentTransaction.addToBackStack(null).commit();
    }
    @Override
    public void onBCASem2PapersMaths2Selected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem2PapersMaths2());
        fragmentTransaction.addToBackStack(null).commit();
    }
    @Override
    public void onBCASem2PapersCSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem2PapersC());
        fragmentTransaction.addToBackStack(null).commit();
    }
    @Override
    public void onBCASem2PapersObSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem2PapersOb());
        fragmentTransaction.addToBackStack(null).commit();
    }
    @Override
    public void onBCASem2PapersDeSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem2PapersDe());
        fragmentTransaction.addToBackStack(null).commit();
    }
    @Override
    public void onBCASem2PapersFam2Selected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem2PapersFam());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem3NotesOopsSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem3NotesOops());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem3NotesDsSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem3NotesDs());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem3NotesCaalSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem3NotesCaal());
        fragmentTransaction.addToBackStack(null).commit();
    }



    @Override
    public void onBCASem3NotesBeSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem3NotesBe());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem3NotesFamSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem3NotesFam());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem3PapersOopsSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem3PapersOops());
        fragmentTransaction.addToBackStack(null).commit();
    }
    @Override
    public void onBCASem3PapersDsSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem3PapersDs());
        fragmentTransaction.addToBackStack(null).commit();
    }
    @Override
    public void onBCASem3PapersCaalSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem3PapersCaal());
        fragmentTransaction.addToBackStack(null).commit();
    }
    @Override
    public void onBCASem3PapersBeSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem3PapersBe());
        fragmentTransaction.addToBackStack(null).commit();
    }
    @Override
    public void onBCASem3PapersFamSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem3PapersFam());
        fragmentTransaction.addToBackStack(null).commit();
    }
    @Override
    public void onBCASem4NotesCgmaSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem4NotesCgma());
        fragmentTransaction.addToBackStack(null).commit();
    }
    @Override
    public void onBCASem4NotesOsSelected() {fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem4NotesOs());
        fragmentTransaction.addToBackStack(null).commit();
    }
    @Override
    public void onBCASem4NotesSeSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem4NotesSe());
        fragmentTransaction.addToBackStack(null).commit();
    }
    @Override
    public void onBCASem4NotesOtSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem4NotesOt());
        fragmentTransaction.addToBackStack(null).commit();
    }
    @Override
    public void onBCASem4NotesMaths3Selected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem4NotesMaths3());
        fragmentTransaction.addToBackStack(null).commit();
    }
    @Override
    public void onBCASem4PapersCgmaSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem4PapersCgma());
        fragmentTransaction.addToBackStack(null).commit();
    }
    @Override
    public void onBCASem4PapersOsSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem4PapersOs());
        fragmentTransaction.addToBackStack(null).commit();
    }
    @Override
    public void onBCASem4PapersSeSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem4PapersSe());
        fragmentTransaction.addToBackStack(null).commit();
    }
    @Override
    public void onBCASem4PapersOtSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem4PapersOt());
        fragmentTransaction.addToBackStack(null).commit();
    }
    @Override
    public void onBCASem4PapersMaths3Selected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem4PapersMaths3());
        fragmentTransaction.addToBackStack(null).commit();
    }

   @Override
    public void onBCASem5NotesDbmsSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem5NotesDbms());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem5NotesJavaSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem5NotesJava());
        fragmentTransaction.addToBackStack(null).commit();
    }


    @Override
    public void onBCASem5NotesCnSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem5NotesCn());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem5NotesNmtSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem5NotesNm());
        fragmentTransaction.addToBackStack(null).commit();
    }


    @Override
    public void onBCASem5PapersDbmsSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem5PapersDbms());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem5PapersJavaSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem5PapersJava());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem5PapersCnSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem5PapersCn());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem5PaperNmSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem5PapersNm());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem6NotesCnsSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem6NotesCns());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem6NotesIadiSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem6NotesIadi());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem6NotesEcomSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem6NotesEcom());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem6NotesKmSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem6NotesKm());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem6PapersCnsSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem6PapersCns());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem6PapersIadiSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem6PapersIadi());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem6PapersEcomSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem6PapersEcom());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem6PapersKmSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BcaSem6PapersKm());
        fragmentTransaction.addToBackStack(null).commit();
    }




       //add on
    @Override
    public void onBCASem1Maths1Selected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BCASemester1SubjectMaths1());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem1PpaSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BCASemester1SubjectPpa());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem1CfoaSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BCASemester1SubjectCfoa());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem1PomSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BCASemester1SubjectPom());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem1BcSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BCASemester1SubjectBc());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem2Maths2Selected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BCASemester2SubjectMaths2());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem2CSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BCASemester2SubjectC());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem2ObSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BCASemester2SubjectOb());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem2DeSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BCASemester2SubjectDe());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem2FamSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BCASemester2SubjectFam());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem3BeSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BCASemester3SubjectBe());
        fragmentTransaction.addToBackStack(null).commit();

    }

    @Override
    public void onBCASem3CaalSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BCASemester3SubjectCaal());
        fragmentTransaction.addToBackStack(null).commit();

    }

    @Override
    public void onBCASem3DsSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BCASemester3SubjectDs());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem3FamSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BCASemester3SubjectFam());
        fragmentTransaction.addToBackStack(null).commit();

    }

    @Override
    public void onBCASem3OopsSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BCASemester3SubjectOops());
        fragmentTransaction.addToBackStack(null).commit();

    }

    @Override
    public void onBCASem4CgmaSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BCASemester4SubjectCgma());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem4Maths3Selected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BCASemester4SubjectMaths3());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem4OsSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BCASemester4SubjectOs());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem4OtSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BCASemester4SubjectOt());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem4SeSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BCASemester4SubjectSe());
        fragmentTransaction.addToBackStack(null).commit();
    }


    //5
    @Override
    public void onBCASem5CnSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BCASemester5SubjectCn());
        fragmentTransaction.addToBackStack(null).commit();

    }

    @Override
    public void onBCASem5DbmsSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BCASemester5SubjectDbms());
        fragmentTransaction.addToBackStack(null).commit();

    }

    @Override
    public void onBCASem5JavaSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BCASemester5SubjectJava());
        fragmentTransaction.addToBackStack(null).commit();

    }

    @Override
    public void onBCASem5NmSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BCASemester5SubjectNm());
        fragmentTransaction.addToBackStack(null).commit();

    }

    @Override
    public void onBCASem6CnsSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BCASemester6SubjectCns());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem6EcomSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BCASemester6SubjectEcom());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem6IadiSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BCASemester6SubjectIadi());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBCASem6KmSelected() {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BCASemester6SubjectKm());
        fragmentTransaction.addToBackStack(null).commit();
    }


    //mca

    @Override
    public void onMCASem4Selected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new MCASemester4Subjects());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onMCASem3Selected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new MCASemester3Subjects());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onMCASem5Selected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new MCASemester5Subjects());
        fragmentTransaction.addToBackStack(null).commit();
    }


    //mca semester 4 subjects

    @Override
    public void onMCASem4aiSelected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new MCASemester4ai());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onMCASem4cdSelected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new MCASemester4cd());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onMCASem4dbmsSelected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new MCASemester4dbms());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onMCASem4fodaSelected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new MCASemester4foda());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onMCASem4mcSelected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new MCASemester4mc());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onMCASem4cnSelected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new MCASemester4cn());
        fragmentTransaction.addToBackStack(null).commit();
    }


    //mca sem4 sub selected for notes
    @Override
    public void onMCASem4NotesaiSelected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new MCASemester4aiNotes());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onMCASem4NotescdSelected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new MCASemester4cdNotes());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onMCASem4NotescnSelected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new MCASemester4cnNotes());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onMCASem4NotesdbmsSelected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new MCASemester4dbmsNotes());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onMCASem4NotesfodaSelected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new MCASemester4fodaNotes());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onMCASem4NotesmcSelected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new MCASemester4mcNotes());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onMCASem3cbotSelected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new MCASemester3cbot());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onMCASem3csSelected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new MCASemester3cs());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onMCASem3daaSelected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new MCASemester3daa());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onMCASem3iporgSelected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new MCASemester3iporg());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onMCASem3osSelected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new MCASemester3os());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onMCASem3wtSelected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new MCASemester3wt());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onMCASem5adSelected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new MCASemester5ad());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onMCASem5bdSelected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new MCASemester5bd());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onMCASem5ccSelected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new MCASemester5cc());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onMCASem5cgmaSelected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new MCASemester5cgma());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onMCASem5seSelected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new MCASemester5se());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onMcaSelected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BbaFragment());
        fragmentTransaction.addToBackStack(null).commit();
    }


    //BBA Semesters
    @Override
    public void onBBASem2Selected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BbaSemster2Subjects());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBBASem4Selected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BbaSemster4Subjects());
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBBASem6Selected() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.container_fragment, new BbaSemster6Subjects());
        fragmentTransaction.addToBackStack(null).commit();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //     getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
        setContentView(R.layout.activity_main);







        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);





        drawerLayout = findViewById(R.id.drawer);
        navigationView = findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(this);

        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        actionBarDrawerToggle.syncState();


        //default
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container_fragment, new MainFragment());
        fragmentTransaction.commit();
        fragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);



    /*      MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
      adContainerView = findViewById(R.id.ad_view_container);
        Drawable image=(Drawable)getResources().getDrawable(R.drawable.back);



        adContainerView.setBackground(image);

        adView = new AdView(this);
        adView.setAdUnitId("ca-app-pub-8329525508764632/6784379204");
        adContainerView.addView(adView);
        loadBanner();
    }

    private void loadBanner() {
        // Create an ad request.
        AdRequest adRequest = new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();

        AdSize adSize = getAdSize();

        adView.setAdSize(adSize);

        adView.loadAd(adRequest);
    }

    private AdSize getAdSize() {
        Display display = getWindowManager().getDefaultDisplay();
        DisplayMetrics outMetrics = new DisplayMetrics();
        display.getMetrics(outMetrics);

        float widthPixels = outMetrics.widthPixels;
        float density = outMetrics.density;

        int adWidth = (int) (widthPixels / density);

        return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(this, adWidth);

   */ }}






