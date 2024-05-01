package com.example.lab2_nguyencattuong_2001216298;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Bai6a extends AppCompatActivity {

    EditText edtHoTen6a, edtCmnd6a;
    Button btnGuiThongTin;
    RadioButton radTrungCap, radCaoDang, radDaiHoc;
    CheckBox chkDocbao, chkDocsach, chkDoccode;
    RadioGroup ragBangCap;
    TextView tvBoSung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai6a);
        addConTrol();
        addEvent();
    }
    void addConTrol()
    {
        edtHoTen6a = (EditText) findViewById(R.id.edtHoTen6a);
        edtCmnd6a = (EditText) findViewById(R.id.edtCmnd6a);
        btnGuiThongTin = (Button) findViewById(R.id.btnGuiThongTin);
        radTrungCap = (RadioButton) findViewById(R.id.radTrungCap);
        radCaoDang = (RadioButton) findViewById(R.id.radCaoDang);
        radDaiHoc = (RadioButton) findViewById(R.id.radDaiHoc);
        chkDocbao = (CheckBox) findViewById(R.id.chkDocbao);
        chkDocsach = (CheckBox) findViewById(R.id.chkDocsach);
        chkDoccode = (CheckBox) findViewById(R.id.chkDoccode);
        ragBangCap = (RadioGroup) findViewById(R.id.ragBangCap);
        tvBoSung = (TextView) findViewById(R.id.tvBoSung);

    }
    void addEvent()
    {
       btnGuiThongTin.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               thongTin();
           }
       });
    }
    void thongTin()
    {


        String ten=edtHoTen6a.getText()+"";
        ten=ten.trim();
        String cmnd=edtCmnd6a.getText()+"";
        cmnd=cmnd.trim();
        String bang="";

        int id=ragBangCap.getCheckedRadioButtonId();
        if(id==-1)
        {
            Toast.makeText(this, "Phải chọn bằng cấp", Toast.LENGTH_SHORT).show();
            return;
        }

        RadioButton rad=(RadioButton) findViewById(id);
        bang=rad.getText()+"";
        String sothich="";
        if(chkDocbao.isChecked())
            sothich+=chkDocbao.getText()+"\n";
        if(chkDocsach.isChecked())
            sothich+=chkDocsach.getText()+"\n";
        if(chkDoccode.isChecked())
            sothich+=chkDoccode.getText()+"\n";

        String bosung=tvBoSung.getText()+"";

        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("Thông tin cá nhân");
   builder.setPositiveButton("Đóng", new DialogInterface.OnClickListener() {
       @Override
       public void onClick(DialogInterface dialog, int which) {
           dialog.cancel();
       }
   });

        String msg=ten+"\n";
        msg+= cmnd+"\n";
        msg+=bang+"\n";
        msg+=sothich;
        msg+="-----------------------------\n";
        msg+="Thông tin bổ sung:\n";
        msg+=bosung+ "\n";
        msg+="-----------------------------";
        builder.setMessage(msg);
        builder.create().show();
    }


}