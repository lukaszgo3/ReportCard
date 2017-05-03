package com.example.android.reportcard;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SchoolSubjectAdapter extends ArrayAdapter<SchoolSubjects> {

    public SchoolSubjectAdapter(Context context, ArrayList<SchoolSubjects> schoolSubjects) {
        super(context, 0, schoolSubjects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        /**
         * I have a question here, why the @NonNull method is automatically generated (there is no such a thing on video)
         * and what does it mean?
         */

        View subjectList = convertView;
        if (subjectList == null) {
            subjectList = LayoutInflater.from(getContext()).inflate(R.layout.activity_school_subjects, parent, false);
        }

        SchoolSubjects currentSchoolSubjects = getItem(position);

        // Find the TextView in the activity_school_subjects.xml layout with the ID gradeID
        TextView gradeTextView = (TextView) subjectList.findViewById(R.id.gradeID);
        gradeTextView.setText(currentSchoolSubjects.getGrade());  // <-- Should i worry about this? (java.lang.nullpointerexception)

        // Find the TextView in the activity_school_subjects.xml layout with the ID subjectID
        TextView subjectTextView = (TextView) subjectList.findViewById(R.id.subjectID);
        subjectTextView.setText(currentSchoolSubjects.getSubject());

        // Find the TextView in the activity_school_subjects.xml layout with the ID dateID
        TextView dateTextView = (TextView) subjectList.findViewById(R.id.dateID);
        dateTextView.setText(currentSchoolSubjects.getDate());

        return subjectList;
    }
}