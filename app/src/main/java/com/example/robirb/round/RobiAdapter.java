package com.example.robirb.round;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ROBI RB on 8/13/2017.
 */

public class RobiAdapter  extends RecyclerView.Adapter<RobiAdapter.RobiHolder> {
    private Context context;
    private Student[] students;
    private LayoutInflater inflater;

    public RobiAdapter(Context context, Student[] students) {
        this.context = context;
        this.students = students;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public RobiHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.single_student,parent,false);
        RobiHolder robiHolder = new RobiHolder(view);
        return robiHolder;
    }

    @Override
    public void onBindViewHolder(RobiHolder holder, int position) {

        Student student = students[position];

        holder.tvName.setText(student.getName());
        holder.tvEmail.setText(student.getEmail());
        holder.tvPhone.setText(student.getPhone());
        holder.tvAge.setText(student.getAge()+"");

    }

    @Override
    public int getItemCount() {
        return students.length;
    }

    class RobiHolder extends RecyclerView.ViewHolder{
         TextView tvName,tvEmail,tvPhone,tvAge;

        public RobiHolder(View itemView) {
            super(itemView);

            tvName =itemView.findViewById(R.id.name);
            tvEmail =itemView.findViewById(R.id.email);
            tvPhone =itemView.findViewById(R.id.phone);
            tvAge =itemView.findViewById(R.id.age);
        }
    }
}
