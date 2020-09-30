package com.himanshu.myimsguide;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;



public class MainFragment extends Fragment {

   // private AdView adView;
    private onFragmentBtnSelected listener;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main,container,false);





        Button button1= view.findViewById(R.id.buttonAbout);
        Button button2= view.findViewById(R.id.buttonAsk);
        Button button3= view.findViewById(R.id.buttonEvents);
        Button button4= view.findViewById(R.id.buttonExams);
        Button button5= view.findViewById(R.id.buttonAttendance);
        Button button6= view.findViewById(R.id.buttonCourse);



        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onCoursesSelected();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onAttendSelected();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onExamSelected();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onEventsSelected();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onAskSelected();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onButtonSelected();
            }
        });
        return view;


    }



    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof onFragmentBtnSelected) {
            listener = (onFragmentBtnSelected) context;
        } else  {
            throw new ClassCastException(context.toString() + "must implement listener");
        }
    }

    public interface onFragmentBtnSelected {
        void onButtonSelected();
        void onAskSelected();
        void onEventsSelected();
        void onExamSelected();
        void onMeetSelected();
        void onAttendSelected();
        void onCoursesSelected();

        //courses
        void onBCASelected();

        void onBbaSelected();
        //BCA Semesters
        void onBCASem1Selected();
        void onBCASem2Selected();
        void onBCASem3Selected();
        void onBCASem4Selected();
        void onBCASem5Selected();
        void onBCASem6Selected();


        //BCA Semester 1 Subjects Selected For Papers
        void onBCASem1NotesMaths1Selected();
        void onBCASem1NotesPpaSelected();
        void onBCASem1NotesCfoaSelected();
        void onBCASem1NotesPomSelected();
        void onBCASem1NotesBcSelected();



        //BCA Semester 1 Subjects Selected For Papers
        void onBCASem1PapersMaths1Selected();
        void onBCASem1PapersPpaSelected();
        void onBCASem1PapersCfoaSelected();
        void onBCASem1PapersPomSelected();
        void onBCASem1PapersBcSelected();




        //BCA Semester 2 Subjects Selected For Notes
        void onBCASem2NotesMaths2Selected();
        void onBCASem2NotesCSelected();
        void onBCASem2NotesObSelected();
        void onBCASem2NotesDeSelected();
        void onBCASem2NotesFam2Selected();

        //BCA Semester 2 Subjects Selected For Papers
        void onBCASem2PapersMaths2Selected();
        void onBCASem2PapersCSelected();
        void onBCASem2PapersObSelected();
        void onBCASem2PapersDeSelected();
        void onBCASem2PapersFam2Selected();




        //BCA Semester 3 Subjects Selected For Notes
        void onBCASem3NotesOopsSelected();
        void onBCASem3NotesDsSelected();
        void onBCASem3NotesCaalSelected();
        void onBCASem3NotesBeSelected();
        void onBCASem3NotesFamSelected();

        //BCA Semester 3 Subjects Selected For Papers
        void onBCASem3PapersOopsSelected();
        void onBCASem3PapersDsSelected();
        void onBCASem3PapersCaalSelected();
        void onBCASem3PapersBeSelected();
        void onBCASem3PapersFamSelected();



        //BCA Semester 4 Subjects Selected For Notes
        void onBCASem4NotesCgmaSelected();
        void onBCASem4NotesOsSelected();
        void onBCASem4NotesSeSelected();
        void onBCASem4NotesOtSelected();
        void onBCASem4NotesMaths3Selected();

        //BCA Semester 4 Subjects Selected For Papers
        void onBCASem4PapersCgmaSelected();
        void onBCASem4PapersOsSelected();
        void onBCASem4PapersSeSelected();
        void onBCASem4PapersOtSelected();
        void onBCASem4PapersMaths3Selected();




        //BCA Semester 5 Subjects Selected For Notes
        void onBCASem5NotesDbmsSelected();
        void onBCASem5NotesJavaSelected();
        void onBCASem5NotesCnSelected();
        void onBCASem5NotesNmtSelected();



        //BCA Semester 5 Subjects Selected For Papers
        void onBCASem5PapersDbmsSelected();
        void onBCASem5PapersJavaSelected();
        void onBCASem5PapersCnSelected();
        void onBCASem5PaperNmSelected();



        //BCA Semester 6 Subjects Selected For Notes
        void onBCASem6NotesCnsSelected();
        void onBCASem6NotesIadiSelected();
        void onBCASem6NotesEcomSelected();
        void onBCASem6NotesKmSelected();

        //BCA Semester 6 Subjects Selected For Papers
        void onBCASem6PapersCnsSelected();
        void onBCASem6PapersIadiSelected();
        void onBCASem6PapersEcomSelected();
        void onBCASem6PapersKmSelected();



        //BCA Semester 1 Sub Selected
        void onBCASem1Maths1Selected();
        void onBCASem1PpaSelected();
        void onBCASem1CfoaSelected();
        void onBCASem1PomSelected();
        void onBCASem1BcSelected();

        //BCA Semester 2 Sub Selected
        void onBCASem2Maths2Selected();
        void onBCASem2CSelected();
        void onBCASem2ObSelected();
        void onBCASem2DeSelected();
        void onBCASem2FamSelected();

        //BCA Semester 3 Sub Selected
        void onBCASem3BeSelected();
        void onBCASem3CaalSelected();
        void onBCASem3DsSelected();
        void onBCASem3FamSelected();
        void onBCASem3OopsSelected();

        //BCA Semester 4 Sub Selected
        void onBCASem4CgmaSelected();
        void onBCASem4Maths3Selected();
        void onBCASem4OsSelected();
        void onBCASem4OtSelected();
        void onBCASem4SeSelected();

        //BCA Semester 5 Sub Selected
        void onBCASem5CnSelected();
        void onBCASem5DbmsSelected();
        void onBCASem5JavaSelected();
        void onBCASem5NmSelected();

        //BCA Semester 6 Sub Selected
        void onBCASem6CnsSelected();
        void onBCASem6EcomSelected();
        void onBCASem6IadiSelected();
        void onBCASem6KmSelected();



        //MCA Semesters

        void onMCASem4Selected();
        void onMCASem3Selected();
        void onMCASem5Selected();



        //MCA Semester 4 Subjects

        void onMCASem4aiSelected();
        void onMCASem4cdSelected();
        void onMCASem4dbmsSelected();
        void onMCASem4fodaSelected();
        void onMCASem4mcSelected();
        void onMCASem4cnSelected();


        //MCA Semester 4 Subjects Notes

        void onMCASem4NotesaiSelected();
        void onMCASem4NotescdSelected();
        void onMCASem4NotescnSelected();
        void onMCASem4NotesdbmsSelected();
        void onMCASem4NotesfodaSelected();
        void onMCASem4NotesmcSelected();


        //MCA Semester 3 Subjects

        void onMCASem3cbotSelected();
        void onMCASem3csSelected();
        void onMCASem3daaSelected();
        void onMCASem3iporgSelected();
        void onMCASem3osSelected();
        void onMCASem3wtSelected();


        //MCA Semester 5 Subjects

        void onMCASem5adSelected();
        void onMCASem5bdSelected();
        void onMCASem5ccSelected();
        void onMCASem5cgmaSelected();
        void onMCASem5seSelected();


        //BBA

        void onMcaSelected();


        //BBA Semesters

        void onBBASem2Selected();
        void onBBASem4Selected();
        void onBBASem6Selected();


    }
}
