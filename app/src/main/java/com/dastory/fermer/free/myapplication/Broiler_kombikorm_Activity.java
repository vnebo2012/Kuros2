package com.dastory.fermer.free.myapplication;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;



import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

public class Broiler_kombikorm_Activity extends AppCompatActivity {


    Button etText;
    Button etText2;
    Button etText3;
    Button etText4;
    Button etText5;
    Button etText6;
    Button etText7;
    Button etText8;
    Button etText9;
    Button etText10;
    Button etText11;
    TextView etText12;
    TextView etText13;
    Button etText14;
    Button etText15;
    Button etText16;
    Button etText17;
    Button etText18;
    Button etText19;
    Button etText20;
    Button etText21;
    Button etText22;

    Button etText23;
    Button etText24;
    Button etText25;
    Button etText26;
    Button etText27;
    Button etText28;
    Button etText29;
    Button etText30;
    Button etText31;
    Button etText32;
    Button etText33;
    Button etText34;
    Button etText35;
    Button etText36;
    Button etText37;
    Button etText38;
    Button etText39;
    Button etText40;
    Button etText41;
    Button etText42;
    Button etText43;
    Button etText44;
    Button etText45;

    Button etText46;
    Button etText47;
    Button etText48;
    Button etText49;
    Button etText50;
    Button etText51;

    //Арматура
    Button etText52;
    Button etText53;
    Button etText54;
    Button etText55;

    Button etText56;
    Button etText57;
    Button etText58;
    Button etText59;

    Button etText60;
    Button etText61;
    Button etText62;
    Button etText63;
    Button etText64;
    Button etText65;

    Button etText66;
    Button etText67;
    Button etText68;

    Button etText69;
    Button etText70;
    Button etText71;
    Button etText72;

    Button etText73;
    Button etText74;

    Button etText75;
    Button etText76;

    Button etText77;
    Button etText78;

    Button etText79;
    Button etText80;
    Button etText81;
    Button etText82;

    TextView etText83;
    TextView etText84;
    TextView etText85;
    TextView etText86;
    TextView etText87;
    TextView etText88;
    TextView etText89;

    Button etText201;
    Button etText202;
    Button etText203;
    Button etText204;
    Button etText205;
    Button etText206;
    Button etText207;
    Button etText208;
    Button etText209;
    Button etText210;
    Button etText211;
    Button etText212;
    Button etText213;
    Button etText214;
    Button etText215;
    Button etText216;
    Button etText217;
    Button etText218;
    Button etText219;
    Button etText220;
    Button etText221;
    Button etText222;
    Button etText223;
    Button etText224;
    Button etText225;
    Button etText226;
    Button etText227;
    Button etText228;
    Button etText229;
    Button etText230;
    Button etText231;
    Button etText232;
    Button etText233;
    Button etText234;
    Button etText235;
    Button etText236;
    Button etText237;
    Button etText238;
    Button etText239;
    Button etText240;
    Button etText241;
    Button etText242;
    Button etText243;
    Button etText244;
    Button etText245;
    Button etText246;
    Button etText247;
    Button etText248;

    Button etText197;
    Button etText277;
    Button etText257;

    TextView etText301;
    TextView etText302;
    TextView etText303;
    TextView etText304;

    TextView etText408;



    Button btnSave, btnLoad;


    SharedPreferences sPref;
    SharedPreferences sPref2;
    SharedPreferences sPref3;

    final String SAVED_TEXT = "saved_text";
    final String SAVED_TEXT2 = "saved_text2";
    final String SAVED_TEXT3 = "saved_text3";
    final String SAVED_TEXT4 = "saved_text4";
    final String SAVED_TEXT5 = "saved_text5";
    final String SAVED_TEXT6 = "saved_text6";
    final String SAVED_TEXT7 = "saved_text7";
    final String SAVED_TEXT8 = "saved_text8";
    final String SAVED_TEXT9 = "saved_text9";
    final String SAVED_TEXT10 = "saved_text10";
    final String SAVED_TEXT11 = "saved_text11";
    final String SAVED_TEXT12 = "saved_text12";
    final String SAVED_TEXT13 = "saved_text13";
    final String SAVED_TEXT14 = "saved_text14";
    final String SAVED_TEXT15 = "saved_text15";
    final String SAVED_TEXT16 = "saved_text16";
    final String SAVED_TEXT17 = "saved_text17";
    final String SAVED_TEXT18 = "saved_text18";
    final String SAVED_TEXT19 = "saved_text19";
    final String SAVED_TEXT20 = "saved_text20";
    final String SAVED_TEXT21 = "saved_text21";
    final String SAVED_TEXT22 = "saved_text22";

    final String SAVED_TEXT23 = "saved_text23";
    final String SAVED_TEXT24 = "saved_text24";
    final String SAVED_TEXT25 = "saved_text25";
    final String SAVED_TEXT26 = "saved_text26";
    final String SAVED_TEXT27 = "saved_text27";
    final String SAVED_TEXT28 = "saved_text28";
    final String SAVED_TEXT29 = "saved_text29";
    final String SAVED_TEXT30 = "saved_text30";
    final String SAVED_TEXT31 = "saved_text31";
    final String SAVED_TEXT32 = "saved_text32";
    final String SAVED_TEXT33 = "saved_text33";
    final String SAVED_TEXT34 = "saved_text34";

    final String SAVED_TEXT35 = "saved_text35";
    final String SAVED_TEXT36 = "saved_text36";
    final String SAVED_TEXT37 = "saved_text37";
    final String SAVED_TEXT38 = "saved_text38";
    final String SAVED_TEXT39 = "saved_text39";
    final String SAVED_TEXT40 = "saved_text40";
    final String SAVED_TEXT41 = "saved_text41";
    final String SAVED_TEXT42 = "saved_text42";
    final String SAVED_TEXT43 = "saved_text43";
    final String SAVED_TEXT44 = "saved_text44";
    final String SAVED_TEXT45 = "saved_text45";
    final String SAVED_TEXT46 = "saved_text46";
    final String SAVED_TEXT47 = "saved_text47";
    final String SAVED_TEXT48 = "saved_text48";
    final String SAVED_TEXT49 = "saved_text49";
    final String SAVED_TEXT50 = "saved_text50";
    final String SAVED_TEXT51 = "saved_text51";

    final String SAVED_TEXT52 = "saved_text52";
    final String SAVED_TEXT53 = "saved_text53";
    final String SAVED_TEXT54 = "saved_text54";
    final String SAVED_TEXT55 = "saved_text55";
    final String SAVED_TEXT56 = "saved_text56";
    final String SAVED_TEXT57 = "saved_text57";
    final String SAVED_TEXT58 = "saved_text58";
    final String SAVED_TEXT59 = "saved_text59";
    final String SAVED_TEXT60 = "saved_text60";
    final String SAVED_TEXT61 = "saved_text61";
    final String SAVED_TEXT62 = "saved_text62";
    final String SAVED_TEXT63 = "saved_text63";
    final String SAVED_TEXT64 = "saved_text64";
    final String SAVED_TEXT65 = "saved_text65";
    final String SAVED_TEXT66 = "saved_text66";
    final String SAVED_TEXT67 = "saved_text67";
    final String SAVED_TEXT68 = "saved_text68";

    final String SAVED_TEXT69 = "saved_text69";
    final String SAVED_TEXT70 = "saved_text70";
    final String SAVED_TEXT71 = "saved_text71";
    final String SAVED_TEXT72 = "saved_text72";

    final String SAVED_TEXT73 = "saved_text73";
    final String SAVED_TEXT74 = "saved_text74";

    final String SAVED_TEXT79 = "saved_text79";
    final String SAVED_TEXT80 = "saved_text80";
    final String SAVED_TEXT81 = "saved_text81";
    final String SAVED_TEXT82 = "saved_text82";

    final String SAVED_TEXT83 = "saved_text83";
    final String SAVED_TEXT84 = "saved_text84";
    final String SAVED_TEXT85 = "saved_text85";
    final String SAVED_TEXT86 = "saved_text86";

    final String SAVED_TEXT89 = "saved_text89";


    final String SAVED_TEXT197 = "saved_text197";
    final String SAVED_TEXT277 = "saved_text277";
    final String SAVED_TEXT257 = "saved_text257";


    final String SAVED_TEXT201 = "saved_text201";
    final String SAVED_TEXT202 = "saved_text202";
    final String SAVED_TEXT203 = "saved_text203";
    final String SAVED_TEXT204 = "saved_text204";
    final String SAVED_TEXT205 = "saved_text205";
    final String SAVED_TEXT206 = "saved_text206";
    final String SAVED_TEXT207 = "saved_text207";
    final String SAVED_TEXT208 = "saved_text208";
    final String SAVED_TEXT209 = "saved_text209";
    final String SAVED_TEXT210 = "saved_text210";
    final String SAVED_TEXT211 = "saved_text211";
    final String SAVED_TEXT212 = "saved_text212";
    final String SAVED_TEXT213 = "saved_text213";
    final String SAVED_TEXT214 = "saved_text214";
    final String SAVED_TEXT215 = "saved_text215";
    final String SAVED_TEXT216 = "saved_text216";
    final String SAVED_TEXT217 = "saved_text217";
    final String SAVED_TEXT218 = "saved_text218";
    final String SAVED_TEXT219 = "saved_text219";
    final String SAVED_TEXT220 = "saved_text220";
    final String SAVED_TEXT221 = "saved_text221";
    final String SAVED_TEXT222 = "saved_text222";
    final String SAVED_TEXT223 = "saved_text223";
    final String SAVED_TEXT224 = "saved_text224";
    final String SAVED_TEXT225 = "saved_text225";
    final String SAVED_TEXT226 = "saved_text226";
    final String SAVED_TEXT227 = "saved_text227";
    final String SAVED_TEXT228 = "saved_text228";
    final String SAVED_TEXT229 = "saved_text229";
    final String SAVED_TEXT230 = "saved_text230";
    final String SAVED_TEXT231 = "saved_text231";
    final String SAVED_TEXT232 = "saved_text232";
    final String SAVED_TEXT233 = "saved_text233";
    final String SAVED_TEXT234 = "saved_text234";
    final String SAVED_TEXT235 = "saved_text235";
    final String SAVED_TEXT236 = "saved_text236";
    final String SAVED_TEXT237 = "saved_text237";
    final String SAVED_TEXT238 = "saved_text238";
    final String SAVED_TEXT239 = "saved_text239";
    final String SAVED_TEXT240 = "saved_text240";
    final String SAVED_TEXT241 = "saved_text241";
    final String SAVED_TEXT242 = "saved_text242";
    final String SAVED_TEXT243 = "saved_text243";
    final String SAVED_TEXT244 = "saved_text244";
    final String SAVED_TEXT245 = "saved_text245";
    final String SAVED_TEXT246 = "saved_text246";
    final String SAVED_TEXT247 = "saved_text247";
    final String SAVED_TEXT248 = "saved_text248";

    final String SAVED_TEXT301 = "saved_text301";
    final String SAVED_TEXT302 = "saved_text302";
    final String SAVED_TEXT303 = "saved_text303";
    final String SAVED_TEXT304 = "saved_text304";

    final String SAVED_TEXT408 = "saved_text408";



    final Context context2 = this;
    boolean flag = true;
    Context context;
    ScrollView myScroll;

    private TextView wir_1;
    private TextView wir_2;
    private TextView wir_3;
    private TextView wir_4;
    private TextView wir_5;
    private TextView wir_6;

    private TextView wir_7;
    private TextView wir_8;
    private TextView wir_9;
    private TextView wir_10;
    private TextView wir_11;
    private TextView wir_12;

    private TextView wir_13;
    private TextView wir_14;
    private TextView wir_15;
    private TextView wir_16;
    private TextView wir_17;


    //region секция private Button btn1 - btn51;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn10;
    private Button btn11;

    private Button btn12;
    private Button btn13;
    private Button btn14;
    private Button btn15;
    private Button btn16;
    private Button btn17;
    private Button btn18;
    private Button btn19;
    private Button btn20;
    private Button btn21;
    private Button btn22;

    private Button btn23;
    private Button btn24;
    private Button btn25;
    private Button btn26;
    private Button btn27;
    private Button btn28;
    private Button btn29;
    private Button btn30;
    private Button btn31;
    private Button btn32;
    private Button btn33;

    private Button btn34;
    private Button btn35;
    private Button btn36;
    private Button btn37;
    private Button btn38;
    private Button btn39;

    private Button btn40;
    private Button btn41;
    private Button btn42;
    private Button btn43;
    private Button btn44;
    private Button btn45;

    private Button btn46;
    private Button btn47;
    private Button btn48;
    private Button btn49;
    private Button btn50;
    private Button btn51;

    private Button btn52;
    private Button btn53;
    private Button btn54;
    private Button btn55;

    private Button btn56;
    private Button btn57;
    private Button btn58;
    private Button btn59;

    private Button btn60;
    private Button btn61;
    private Button btn62;
    private Button btn63;
    private Button btn64;
    private Button btn65;

    private Button btn66;
    private Button btn67;
    private Button btn68;

    private Button btn69;
    private Button btn70;
    private Button btn71;
    private Button btn72;

    private Button btn73;
    private Button btn74;
    private Button btn75;

    private Button btn77;
    private Button btn78;

    private Button btn79;
    private Button btn80;
    private Button btn81;
    private Button btn82;

    private Button btn201;
    private Button btn202;
    private Button btn203;
    private Button btn204;
    private Button btn205;
    private Button btn206;
    private Button btn207;
    private Button btn208;
    private Button btn209;
    private Button btn210;
    private Button btn211;
    private Button btn212;
    private Button btn213;
    private Button btn214;
    private Button btn215;
    private Button btn216;
    private Button btn217;
    private Button btn218;
    private Button btn219;
    private Button btn220;
    private Button btn221;
    private Button btn222;
    private Button btn223;
    private Button btn224;
    private Button btn225;
    private Button btn226;
    private Button btn227;
    private Button btn228;
    private Button btn229;
    private Button btn230;
    private Button btn231;
    private Button btn232;
    private Button btn233;
    private Button btn234;
    private Button btn235;
    private Button btn236;
    private Button btn237;
    private Button btn238;
    private Button btn239;
    private Button btn240;
    private Button btn241;
    private Button btn242;
    private Button btn243;
    private Button btn244;
    private Button btn245;
    private Button btn246;
    private Button btn247;
    private Button btn248;

    private Button btn197;
    private Button btn277;
    private Button btn257;






    //endregion

    //region секция private Button aetText1 - aetText51;
    private Button aetText1;
    private Button aetText2;
    private Button aetText3;
    private Button aetText4;
    private Button aetText5;
    private Button aetText6;
    private Button aetText7;
    private Button aetText8;
    private Button aetText9;
    private Button aetText10;
    private Button aetText11;

    private Button aetText12;
    private Button aetText13;
    private Button aetText14;
    private Button aetText15;
    private Button aetText16;
    private Button aetText17;
    //private Button aetText18;
    private Button aetText19;
    private Button aetText20;
    private Button aetText21;
    private Button aetText22;

    private Button aetText23;
    private Button aetText24;
    private Button aetText25;
    private Button aetText26;
    private Button aetText27;
    private Button aetText28;
    private Button aetText29;
    private Button aetText30;
    private Button aetText31;
    private Button aetText32;
    private Button aetText33;

    private Button aetText34;
    private Button aetText35;
    private Button aetText36;
    private Button aetText37;
    private Button aetText38;
    private Button aetText39;

    private Button aetText40;
    private Button aetText41;
    private Button aetText42;
    private Button aetText43;
    private Button aetText44;
    private Button aetText45;

    private Button aetText46;
    private Button aetText47;
    private Button aetText48;
    private Button aetText49;
    private Button aetText50;
    private Button aetText51;

    private Button aetText52;
    private Button aetText53;
    private Button aetText54;
    private Button aetText55;

    private Button aetText56;
    private Button aetText57;
    private Button aetText58;
    private Button aetText59;

    private Button aetText60;
    private Button aetText61;
    private Button aetText62;
    private Button aetText63;
    private Button aetText64;
    private Button aetText65;

    private Button aetText66;
    private Button aetText67;
    private Button aetText68;

    private Button aetText69;
    private Button aetText70;
    private Button aetText71;
    private Button aetText72;

    private Button aetText73;
    private Button aetText74;

    private Button aetText77;
    private Button aetText78;

    private Button aetText79;
    private Button aetText80;
    private Button aetText81;
    private Button aetText82;

    private Button aetText201;
    private Button aetText202;
    private Button aetText203;
    private Button aetText204;
    private Button aetText205;
    private Button aetText206;
    private Button aetText207;
    private Button aetText208;
    private Button aetText209;
    private Button aetText210;
    private Button aetText211;
    private Button aetText212;
    private Button aetText213;
    private Button aetText214;
    private Button aetText215;
    private Button aetText216;
    private Button aetText217;
    private Button aetText218;
    private Button aetText219;
    private Button aetText220;
    private Button aetText221;
    private Button aetText222;
    private Button aetText223;
    private Button aetText224;
    private Button aetText225;
    private Button aetText226;
    private Button aetText227;
    private Button aetText228;
    private Button aetText229;
    private Button aetText230;
    private Button aetText231;
    private Button aetText232;
    private Button aetText233;
    private Button aetText234;
    private Button aetText235;
    private Button aetText236;
    private Button aetText237;
    private Button aetText238;
    private Button aetText239;
    private Button aetText240;
    private Button aetText241;
    private Button aetText242;
    private Button aetText243;
    private Button aetText244;
    private Button aetText245;
    private Button aetText246;
    private Button aetText247;
    private Button aetText248;

    private Button aetText301;
    private Button aetText302;
    private Button aetText303;
    private Button aetText304;

    private Button aetText197;
    private Button aetText277;
    private Button aetText257;
    private TextView aetText18;




//endregion


    //region секция Button button101 - button101;
    Button button101;
    Button button102;
    Button button103;
    Button button104;
    Button button105;
    Button button106;
    Button button107;
    Button button108;
    Button button109;
    Button button110;
    Button button111;

    Button button112;
    Button button113;
    Button button114;
    Button button115;
    Button button116;
    Button button117;
    Button button118;
    Button button119;
    Button button120;
    Button button121;
    Button button122;

    Button button123;
    Button button124;
    Button button125;
    Button button126;
    Button button127;
    Button button128;
    Button button129;
    Button button130;
    Button button131;
    Button button132;
    Button button133;

    Button button134;
    Button button135;
    Button button136;
    Button button137;
    Button button138;
    Button button139;

    Button button140;
    Button button141;
    Button button142;
    Button button143;
    Button button144;
    Button button145;

    Button button146;
    Button button147;
    Button button148;
    Button button149;
    Button button150;
    Button button151;


    Button button152;
    Button button153;
    Button button154;
    Button button155;


    Button button158;
    Button button159;

    Button button160;
    Button button161;
    Button button162;
    Button button163;
    Button button164;
    Button button165;

    Button button166;
    Button button167;
    Button button168;

    Button button169;
    Button button170;
    Button button171;
    Button button172;

    Button button173;
    Button button174;

    Button button175;
    Button button176;

    Button button177;
    Button button178;

    Button button179;
    Button button180;
    Button button181;
    Button button182;

    Button button201;
    Button button202;
    Button button203;
    Button button204;
    Button button205;
    Button button206;
    Button button207;
    Button button208;
    Button button209;
    Button button210;
    Button button211;
    Button button212;
    Button button213;
    Button button214;
    Button button215;
    Button button216;
    Button button217;
    Button button218;
    Button button219;
    Button button220;
    Button button221;
    Button button222;
    Button button223;
    Button button224;
    Button button225;
    Button button226;
    Button button227;
    Button button228;
    Button button229;
    Button button230;
    Button button231;
    Button button232;
    Button button233;
    Button button234;
    Button button235;
    Button button236;
    Button button237;
    Button button238;
    Button button239;
    Button button240;
    Button button241;
    Button button242;
    Button button243;
    Button button244;
    Button button245;
    Button button246;
    Button button247;
    Button button248;

    Button button197;
    Button button277;
    Button button257;





    //endregion

    //region секция private TextView final_text - final_text51;
    private TextView final_text;
    private TextView final_text2;
    private TextView final_text3;
    private TextView final_text4;
    private TextView final_text5;
    private TextView final_text6;
    private TextView final_text7;
    private TextView final_text8;
    private TextView final_text9;
    private TextView final_text10;
    private TextView final_text11;

    private TextView final_text12;
    private TextView final_text13;
    private TextView final_text14;
    private TextView final_text15;
    private TextView final_text16;
    private TextView final_text17;
    private TextView final_text18;
    private TextView final_text19;
    private TextView final_text20;
    private TextView final_text21;
    private TextView final_text22;

    private TextView final_text23;
    private TextView final_text24;
    private TextView final_text25;
    private TextView final_text26;
    private TextView final_text27;
    private TextView final_text28;
    private TextView final_text29;
    private TextView final_text30;
    private TextView final_text31;
    private TextView final_text32;
    private TextView final_text33;

    private TextView final_text34;
    private TextView final_text35;
    private TextView final_text36;
    private TextView final_text37;
    private TextView final_text38;
    private TextView final_text39;

    private TextView final_text40;
    private TextView final_text41;
    private TextView final_text42;
    private TextView final_text43;
    private TextView final_text44;
    private TextView final_text45;

    private TextView final_text46;
    private TextView final_text47;
    private TextView final_text48;
    private TextView final_text49;
    private TextView final_text50;
    private TextView final_text51;

    private TextView final_text52;
    private TextView final_text53;
    private TextView final_text54;
    private TextView final_text55;

    private TextView final_text56;
    private TextView final_text57;
    private TextView final_text58;
    private TextView final_text59;

    private TextView final_text60;
    private TextView final_text61;
    private TextView final_text62;
    private TextView final_text63;
    private TextView final_text64;
    private TextView final_text65;

    private TextView final_text66;
    private TextView final_text67;
    private TextView final_text68;

    private TextView final_text69;
    private TextView final_text70;
    private TextView final_text71;
    private TextView final_text72;

    private TextView final_text73;
    private TextView final_text74;

    private TextView final_text75;
    private TextView final_text76;

    private TextView final_text77;
    private TextView final_text78;

    private TextView final_text79;
    private TextView final_text80;
    private TextView final_text81;
    private TextView final_text82;



    private TextView final_text83;
    private TextView final_text84;
    private TextView final_text85;
    private TextView final_text86;
    private TextView final_text87;
    private TextView final_text88;
    private TextView final_text89;

    private TextView final_text201;
    private TextView final_text202;
    private TextView final_text203;
    private TextView final_text204;
    private TextView final_text205;
    private TextView final_text206;
    private TextView final_text207;
    private TextView final_text208;
    private TextView final_text209;
    private TextView final_text210;
    private TextView final_text211;
    private TextView final_text212;
    private TextView final_text213;
    private TextView final_text214;
    private TextView final_text215;
    private TextView final_text216;
    private TextView final_text217;
    private TextView final_text218;
    private TextView final_text219;
    private TextView final_text220;
    private TextView final_text221;
    private TextView final_text222;
    private TextView final_text223;
    private TextView final_text224;
    private TextView final_text225;
    private TextView final_text226;
    private TextView final_text227;
    private TextView final_text228;
    private TextView final_text229;
    private TextView final_text230;
    private TextView final_text231;
    private TextView final_text232;
    private TextView final_text233;
    private TextView final_text234;
    private TextView final_text235;
    private TextView final_text236;
    private TextView final_text237;
    private TextView final_text238;
    private TextView final_text239;
    private TextView final_text240;
    private TextView final_text241;
    private TextView final_text242;
    private TextView final_text243;
    private TextView final_text244;
    private TextView final_text245;
    private TextView final_text246;
    private TextView final_text247;
    private TextView final_text248;

    private TextView final_text301;
    private TextView final_text302;
    private TextView final_text303;
    private TextView final_text304;

    private TextView final_text197;
    private TextView final_text277;
    private TextView final_text257;

    ImageView imageView;
    ImageView imageView1;



    private static int SPLASH_TIME_OUT = 5000;
    static Context context4;
    Timer t = new Timer();
    static Intent intent;









    //endregion

    /**
     * Called when the activity is first created.
     */

    final String MY_SETTINGS = "saved_text_vse29944";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broiler_kombi);








        //ImageView imageView2 = (ImageView) findViewById(R.id.imageView3);
        //TextView textView = (TextView) findViewById(R.id.textView);


        //imageView2.setOnClickListener(viewClickListener);


        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);








        SharedPreferences sp = getSharedPreferences(MY_SETTINGS,
                Context.MODE_PRIVATE);
        // проверяем, первый ли раз открывается программа
        boolean hasVisited = sp.getBoolean("hasVisited_vse29944", false);

        if (!hasVisited) {

            LayoutInflater li = LayoutInflater.from(context2);
            View promptsView = li.inflate(R.layout.prompt2, null);
            AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
            mDialogBuilder.setView(promptsView);


            final TextView bill1 = (TextView) findViewById(R.id.button10);
            final TextView bill2 = (TextView) findViewById(R.id.button2);
            final TextView bill3 = (TextView) findViewById(R.id.button);
            final TextView bill4 = (TextView) findViewById(R.id.button3);
            final TextView bill5 = (TextView) findViewById(R.id.button5);
            final TextView bill6 = (TextView) findViewById(R.id.button6);
            final TextView bill7 = (TextView) findViewById(R.id.button7);
            final TextView bill8 = (TextView) findViewById(R.id.button38);
            final TextView bill9 = (TextView) findViewById(R.id.button40);
            final TextView bill10 = (TextView) findViewById(R.id.button39);
            final TextView bill11 = (TextView) findViewById(R.id.button8);

            final TextView bill12 = (TextView) findViewById(R.id.textView142);
            final TextView bill13 = (TextView) findViewById(R.id.textView242);



            final TextView bill23 = (TextView) findViewById(R.id.button97);
            final TextView bill24 = (TextView) findViewById(R.id.button98);
            final TextView bill25 = (TextView) findViewById(R.id.button99);
            final TextView bill26 = (TextView) findViewById(R.id.button100);
            final TextView bill27 = (TextView) findViewById(R.id.button101);
            final TextView bill28 = (TextView) findViewById(R.id.button102);
            final TextView bill29 = (TextView) findViewById(R.id.button103);
            final TextView bill30 = (TextView) findViewById(R.id.button104);
            final TextView bill31 = (TextView) findViewById(R.id.button105);
            final TextView bill32 = (TextView) findViewById(R.id.button11);
            final TextView bill33 = (TextView) findViewById(R.id.button12);



            final TextView bill40 = (TextView) findViewById(R.id.button61);
            final TextView bill41 = (TextView) findViewById(R.id.button62);
            final TextView bill42 = (TextView) findViewById(R.id.button63);
            final TextView bill43 = (TextView) findViewById(R.id.button64);
            final TextView bill44 = (TextView) findViewById(R.id.button65);
            final TextView bill45 = (TextView) findViewById(R.id.button66);

            final TextView bill46 = (TextView) findViewById(R.id.button70);
            final TextView bill47 = (TextView) findViewById(R.id.button71);
            final TextView bill48 = (TextView) findViewById(R.id.button72);
            final TextView bill49 = (TextView) findViewById(R.id.button73);
            final TextView bill50 = (TextView) findViewById(R.id.button74);
            final TextView bill51 = (TextView) findViewById(R.id.button75);


            final TextView bill52 = (TextView) findViewById(R.id.button15);
            final TextView bill53 = (TextView) findViewById(R.id.button16);
            final TextView bill54 = (TextView) findViewById(R.id.button17);
            final TextView bill55 = (TextView) findViewById(R.id.button18);

            //final TextView bill56 = (TextView) findViewById(R.id.button21);
            //final TextView bill57 = (TextView) findViewById(R.id.button22);
            // final TextView bill58 = (TextView) findViewById(R.id.button23);
            // final TextView bill59 = (TextView) findViewById(R.id.button24);

            /*final TextView bill60 = (TextView) findViewById(R.id.button27);
            final TextView bill61 = (TextView) findViewById(R.id.button28);
            final TextView bill62 = (TextView) findViewById(R.id.button29);
            final TextView bill63 = (TextView) findViewById(R.id.button30);
            final TextView bill64 = (TextView) findViewById(R.id.button31);
            final TextView bill65 = (TextView) findViewById(R.id.button32);*/

            final TextView bill66 = (TextView) findViewById(R.id.button19);
            final TextView bill67 = (TextView) findViewById(R.id.button20);
            final TextView bill68 = (TextView) findViewById(R.id.button25);

            // final TextView bill69 = (TextView) findViewById(R.id.button41);
            // final TextView bill70 = (TextView) findViewById(R.id.button42);
            // final TextView bill71 = (TextView) findViewById(R.id.button43);
            //  final TextView bill72 = (TextView) findViewById(R.id.button44);

            final TextView bill73 = (TextView) findViewById(R.id.button45);
            final TextView bill74 = (TextView) findViewById(R.id.button46);

            final TextView bill79 = (TextView) findViewById(R.id.button26);
            final TextView bill80 = (TextView) findViewById(R.id.button33);
            final TextView bill81 = (TextView) findViewById(R.id.button34);
            final TextView bill82 = (TextView) findViewById(R.id.button35);

            //final TextView bill83 = (TextView) findViewById(R.id.textView14);
            //final TextView bill84 = (TextView) findViewById(R.id.textView20);
            //final TextView bill85 = (TextView) findViewById(R.id.textView43);
           // final TextView bill86 = (TextView) findViewById(R.id.textView24);
            // final TextView bill87 = (TextView) findViewById(R.id.textView39);
            // final TextView bill88 = (TextView) findViewById(R.id.textView37);
            //final TextView bill89 = (TextView) findViewById(R.id.textView28);

            final TextView bill201 = (TextView) findViewById(R.id.button201);
            final TextView bill202 = (TextView) findViewById(R.id.button202);
            final TextView bill203 = (TextView) findViewById(R.id.button203);
            final TextView bill204 = (TextView) findViewById(R.id.button204);
            final TextView bill205 = (TextView) findViewById(R.id.button205);
            final TextView bill206 = (TextView) findViewById(R.id.button206);
            final TextView bill207 = (TextView) findViewById(R.id.button207);
            final TextView bill208 = (TextView) findViewById(R.id.button208);
            final TextView bill209 = (TextView) findViewById(R.id.button209);
            final TextView bill210 = (TextView) findViewById(R.id.button210);
            final TextView bill211 = (TextView) findViewById(R.id.button211);

            final TextView bill212 = (TextView) findViewById(R.id.button212);
            final TextView bill213 = (TextView) findViewById(R.id.button213);
            final TextView bill214 = (TextView) findViewById(R.id.button214);
            final TextView bill215 = (TextView) findViewById(R.id.button215);
            final TextView bill216 = (TextView) findViewById(R.id.button216);
            final TextView bill217 = (TextView) findViewById(R.id.button217);

            final TextView bill218 = (TextView) findViewById(R.id.button218);
            final TextView bill219 = (TextView) findViewById(R.id.button219);
            final TextView bill220 = (TextView) findViewById(R.id.button220);
            final TextView bill221 = (TextView) findViewById(R.id.button221);

            final TextView bill222 = (TextView) findViewById(R.id.button222);
            final TextView bill223 = (TextView) findViewById(R.id.button223);
            final TextView bill224 = (TextView) findViewById(R.id.button224);
            final TextView bill225 = (TextView) findViewById(R.id.button225);

           // final TextView bill226 = (TextView) findViewById(R.id.button226);
           // final TextView bill227 = (TextView) findViewById(R.id.button227);
            //final TextView bill228 = (TextView) findViewById(R.id.button228);
           // final TextView bill229 = (TextView) findViewById(R.id.button229);

            final TextView bill230 = (TextView) findViewById(R.id.button230);
            final TextView bill231 = (TextView) findViewById(R.id.button231);
            final TextView bill232 = (TextView) findViewById(R.id.button232);
            final TextView bill233 = (TextView) findViewById(R.id.button233);

            final TextView bill234 = (TextView) findViewById(R.id.button234);
            final TextView bill235 = (TextView) findViewById(R.id.button235);
            final TextView bill236 = (TextView) findViewById(R.id.button236);

            final TextView bill237 = (TextView) findViewById(R.id.button237);
            final TextView bill238 = (TextView) findViewById(R.id.button238);
            final TextView bill239 = (TextView) findViewById(R.id.button239);
            final TextView bill240 = (TextView) findViewById(R.id.button240);
            final TextView bill241 = (TextView) findViewById(R.id.button241);
            final TextView bill242 = (TextView) findViewById(R.id.button242);

            final TextView bill243 = (TextView) findViewById(R.id.button243);
            final TextView bill244 = (TextView) findViewById(R.id.button244);
            final TextView bill245 = (TextView) findViewById(R.id.button245);
            final TextView bill246 = (TextView) findViewById(R.id.button246);
            final TextView bill247 = (TextView) findViewById(R.id.button247);
            final TextView bill248 = (TextView) findViewById(R.id.button248);


            final TextView bill197 = (TextView) findViewById(R.id.button197);
            final TextView bill277 = (TextView) findViewById(R.id.button277);
            final TextView bill257 = (TextView) findViewById(R.id.button257);


            final TextView bill301 = (TextView) findViewById(R.id.textView201);
            final TextView bill302 = (TextView) findViewById(R.id.textView301);
            final TextView bill303 = (TextView) findViewById(R.id.textView401);
            final TextView bill304 = (TextView) findViewById(R.id.textView4);

            final TextView bill408 = (TextView) findViewById(R.id.textView208);


            //etText83 = (TextView) findViewById(R.id.textView14);
           // etText84 = (TextView) findViewById(R.id.textView20);
            // etText85 = (TextView) findViewById(R.id.textView43);
           // etText86 = (TextView) findViewById(R.id.textView24);

            etText301 = (TextView) findViewById(R.id.textView201);
            etText302 = (TextView) findViewById(R.id.textView301);
            etText303 = (TextView) findViewById(R.id.textView401);
            etText304 = (TextView) findViewById(R.id.textView4);

            //  etText89 = (TextView) findViewById(R.id.textView28);

            //final TextView bill75 = (TextView) findViewById(R.id.button36);
            //final TextView bill76 = (TextView) findViewById(R.id.button37);




            mDialogBuilder
                    .setCancelable(false)
                    .setPositiveButton("OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {


                                    //a
                                    bill1.setText(0 + "");
                                    bill2.setText(2 + "");
                                    bill3.setText(5 + "");
                                    bill4.setText(10 + "");
                                    bill5.setText(20 + "");
                                    bill6.setText(30 + "");
                                    bill7.setText(50 + "");
                                    bill8.setText(100 + "");
                                    bill9.setText(150 + "");
                                    bill10.setText(200 + "");
                                    bill11.setText(300 + "");

                                    bill12.setText(0.0 + "");
                                    bill13.setText(0.0 + "");


                                    //b
                                    bill23.setText(0 + "");
                                    bill24.setText(10 + "");
                                    bill25.setText(20 + "");
                                    bill26.setText(50 + "");
                                    bill27.setText(80 + "");
                                    bill28.setText(100 + "");
                                    bill29.setText(150 + "");
                                    bill30.setText(200 + "");
                                    bill31.setText(250 + "");
                                    bill32.setText(300 + "");
                                    bill33.setText(350 + "");



                                    bill40.setText(0 + "");
                                    bill41.setText(3 + "");
                                    bill42.setText(5 + "");
                                    bill43.setText(10 + "");
                                    bill44.setText(15 + "");
                                    bill45.setText(20 + "");

                                    bill46.setText(0 + "");
                                    bill47.setText(2.1 + "");
                                    bill48.setText(2.2 + "");
                                    bill49.setText(2.4 + "");
                                    bill50.setText(2.8 + "");
                                    bill51.setText(3.1 + "");


                                    bill52.setText(9 + "");
                                    bill53.setText(10 + "");
                                    bill54.setText(11 + "");
                                    bill55.setText(12 + "");
                                    bill73.setText(15 + "");
                                    bill74.setText(18 + "");



                                    /*bill60.setText(295 + "");
                                    bill61.setText(296 + "");
                                    bill62.setText(298 + "");
                                    bill63.setText(300 + "");
                                    bill64.setText(310 + "");
                                    bill65.setText(320 + "");*/

                                    bill66.setText(50 + "");
                                    bill67.setText(80 + "");
                                    bill68.setText(100 + "");

                                    //bill69.setText(1 + "");
                                    // bill72.setText(2 + "");
                                    // bill70.setText(3 + "");






                                    bill79.setText(18 + "");
                                    bill80.setText(21 + "");
                                    bill81.setText(25 + "");
                                    bill82.setText(30 + "");

//                                    bill83.setText(00.00 + "");
                                    //bill84.setText(00.00 + "");
                                    //bill85.setText(00.00 + "");
                                   // bill86.setText(00.00 + "");

                                    bill201.setText(0 + "");
                                    bill202.setText(20 + "");
                                    bill203.setText(50 + "");
                                    bill204.setText(100 + "");
                                    bill205.setText(200 + "");
                                    bill206.setText(500 + "");
                                    bill207.setText(700 + "");
                                    bill208.setText(800 + "");
                                    bill209.setText(1000 + "");
                                    bill210.setText(1500 + "");
                                    bill211.setText(2000 + "");

                                    bill212.setText(40 + "");
                                    bill213.setText(80 + "");
                                    bill214.setText(90 + "");
                                    bill215.setText(100 + "");
                                    bill216.setText(110 + "");
                                    bill217.setText(120 + "");

                                    bill218.setText(19 + "");
                                    bill219.setText(20 + "");
                                    bill220.setText(21+ "");
                                    bill221.setText(22 + "");

                                    bill222.setText(9 + "");
                                    bill223.setText(10 + "");
                                    bill224.setText(11 + "");
                                    bill225.setText(15 + "");

                                    //bill226.setText(1.5 + "");
                                    //bill227.setText(2.0 + "");
                                  //  bill228.setText(4.0 + "");
                                  //  bill229.setText(5.0 + "");

                                    bill230.setText(15 + "");
                                    bill231.setText(30 + "");
                                    bill232.setText(60 + "");
                                    bill233.setText(80 + "");

                                    bill234.setText(100 + "");
                                    bill235.setText(110 + "");
                                    bill236.setText(150 + "");

                                    bill237.setText(0 + "");
                                    bill238.setText(10 + "");
                                    bill239.setText(20 + "");
                                    bill240.setText(25 + "");
                                    bill241.setText(30 + "");
                                    bill242.setText(35 + "");

                                    bill243.setText(50 + "");
                                    bill244.setText(80 + "");
                                    bill245.setText(90 + "");
                                    bill246.setText(150 + "");
                                    bill247.setText(200 + "");
                                    bill248.setText(250 + "");

                                    bill301.setText(0.0 + "");
                                    bill302.setText(0.0 + "");
                                    bill303.setText(0.0 + "");
                                    bill304.setText(0.0 + "");

                                    bill197.setText(4 + "");
                                    bill277.setText(5 + "");
                                    bill257.setText(10 + "");

                                    bill408.setText(00.00 + "");



                                }
                            });
            AlertDialog alertDialog = mDialogBuilder.create();
            alertDialog.show();




            // выводим нужную активность
            // напр.


            SharedPreferences.Editor e = sp.edit();
            e.putBoolean("hasVisited_vse29944", true);
            e.commit(); // не забудьте подтвердить изменения
        }



        etText = (Button) findViewById(R.id.button10);
        etText2 = (Button) findViewById(R.id.button2);
        etText3 = (Button) findViewById(R.id.button);
        etText4 = (Button) findViewById(R.id.button3);
        etText5 = (Button) findViewById(R.id.button5);
        etText6 = (Button) findViewById(R.id.button6);
        etText7 = (Button) findViewById(R.id.button7);
        etText8 = (Button) findViewById(R.id.button38);
        etText9 = (Button) findViewById(R.id.button40);
        etText10 = (Button) findViewById(R.id.button39);
        etText11 = (Button) findViewById(R.id.button8);





        etText23 = (Button) findViewById(R.id.button97);
        etText24 = (Button) findViewById(R.id.button98);
        etText25 = (Button) findViewById(R.id.button99);
        etText26 = (Button) findViewById(R.id.button100);
        etText27 = (Button) findViewById(R.id.button101);
        etText28 = (Button) findViewById(R.id.button102);
        etText29 = (Button) findViewById(R.id.button103);
        etText30 = (Button) findViewById(R.id.button104);
        etText31 = (Button) findViewById(R.id.button105);
        etText32 = (Button) findViewById(R.id.button11);
        etText33 = (Button) findViewById(R.id.button12);


        etText40 = (Button) findViewById(R.id.button61);
        etText41 = (Button) findViewById(R.id.button62);
        etText42 = (Button) findViewById(R.id.button63);
        etText43 = (Button) findViewById(R.id.button64);
        etText44 = (Button) findViewById(R.id.button65);
        etText45 = (Button) findViewById(R.id.button66);

        etText46 = (Button) findViewById(R.id.button70);
        etText47 = (Button) findViewById(R.id.button71);
        etText48 = (Button) findViewById(R.id.button72);
        etText49 = (Button) findViewById(R.id.button73);
        etText50 = (Button) findViewById(R.id.button74);
        etText51 = (Button) findViewById(R.id.button75);


        etText52 = (Button) findViewById(R.id.button15);
        etText53 = (Button) findViewById(R.id.button16);
        etText54 = (Button) findViewById(R.id.button17);
        etText55 = (Button) findViewById(R.id.button18);



       /* etText60 = (Button) findViewById(R.id.button27);
        etText61 = (Button) findViewById(R.id.button28);

        etText62 = (Button) findViewById(R.id.button29);
        etText63 = (Button) findViewById(R.id.button30);
        etText64 = (Button) findViewById(R.id.button31);
        etText65 = (Button) findViewById(R.id.button32);*/

        etText66 = (Button) findViewById(R.id.button19);
        etText67 = (Button) findViewById(R.id.button20);
        etText68 = (Button) findViewById(R.id.button25);

        //etText69 = (Button) findViewById(R.id.button41);
       // etText70 = (Button) findViewById(R.id.button42);
       // etText71 = (Button) findViewById(R.id.button43);
        //etText72 = (Button) findViewById(R.id.button44);

        etText73 = (Button) findViewById(R.id.button45);
        etText74 = (Button) findViewById(R.id.button46);

        //etText77 = (Button) findViewById(R.id.button36);
        // etText78 = (Button) findViewById(R.id.button37);

        etText79 = (Button) findViewById(R.id.button26);
        etText80 = (Button) findViewById(R.id.button33);
        etText81 = (Button) findViewById(R.id.button34);
        etText82 = (Button) findViewById(R.id.button35);

       // etText83 = (TextView) findViewById(R.id.textView14);
       // etText84 = (TextView) findViewById(R.id.textView20);
        // etText85 = (TextView) findViewById(R.id.textView43);
       // etText86 = (TextView) findViewById(R.id.textView24);

        etText12 = (TextView) findViewById(R.id.textView142);
        etText13 = (TextView) findViewById(R.id.textView242);

        etText301 = (TextView) findViewById(R.id.textView201);
        etText302 = (TextView) findViewById(R.id.textView301);
        etText303 = (TextView) findViewById(R.id.textView401);
        etText304 = (TextView) findViewById(R.id.textView4);

        // etText89 = (TextView) findViewById(R.id.textView28);

        etText201 = (Button) findViewById(R.id.button201);
        etText202 = (Button) findViewById(R.id.button202);
        etText203 = (Button) findViewById(R.id.button203);
        etText204 = (Button) findViewById(R.id.button204);
        etText205 = (Button) findViewById(R.id.button205);
        etText206 = (Button) findViewById(R.id.button206);
        etText207 = (Button) findViewById(R.id.button207);
        etText208 = (Button) findViewById(R.id.button208);
        etText209 = (Button) findViewById(R.id.button209);
        etText210 = (Button) findViewById(R.id.button210);
        etText211 = (Button) findViewById(R.id.button211);

        etText212 = (Button) findViewById(R.id.button212);
        etText213 = (Button) findViewById(R.id.button213);
        etText214 = (Button) findViewById(R.id.button214);
        etText215 = (Button) findViewById(R.id.button215);
        etText216 = (Button) findViewById(R.id.button216);
        etText217 = (Button) findViewById(R.id.button217);

        etText218 = (Button) findViewById(R.id.button218);
        etText219 = (Button) findViewById(R.id.button219);
        etText220 = (Button) findViewById(R.id.button220);
        etText221 = (Button) findViewById(R.id.button221);

        etText222 = (Button) findViewById(R.id.button222);
        etText223 = (Button) findViewById(R.id.button223);
        etText224 = (Button) findViewById(R.id.button224);
        etText225 = (Button) findViewById(R.id.button225);

        //etText226 = (Button) findViewById(R.id.button226);
      //  etText227 = (Button) findViewById(R.id.button227);
      //  etText228 = (Button) findViewById(R.id.button228);
      //  etText229 = (Button) findViewById(R.id.button229);

        etText230 = (Button) findViewById(R.id.button230);
        etText231 = (Button) findViewById(R.id.button231);
        etText232 = (Button) findViewById(R.id.button232);
        etText233 = (Button) findViewById(R.id.button233);

        etText234 = (Button) findViewById(R.id.button234);
        etText235 = (Button) findViewById(R.id.button235);
        etText236 = (Button) findViewById(R.id.button236);

        etText237 = (Button) findViewById(R.id.button237);
        etText238 = (Button) findViewById(R.id.button238);
        etText239 = (Button) findViewById(R.id.button239);
        etText240 = (Button) findViewById(R.id.button240);
        etText241 = (Button) findViewById(R.id.button241);
        etText242 = (Button) findViewById(R.id.button242);

        etText243 = (Button) findViewById(R.id.button243);
        etText244 = (Button) findViewById(R.id.button244);
        etText245 = (Button) findViewById(R.id.button245);
        etText246 = (Button) findViewById(R.id.button246);
        etText247 = (Button) findViewById(R.id.button247);
        etText248 = (Button) findViewById(R.id.button248);

        etText197 = (Button) findViewById(R.id.button197);
        etText277 = (Button) findViewById(R.id.button277);
        etText257 = (Button) findViewById(R.id.button257);

        etText408 = (TextView) findViewById(R.id.textView208);





        loadText();
        loadText2();
        loadText3();
        loadText4();
        loadText5();
        loadText6();
        loadText7();
        loadText8();
        loadText9();
        loadText10();
        loadText11();

        loadText12();
        loadText13();









        loadText23();
        loadText24();
        loadText25();
        loadText26();
        loadText27();
        loadText28();
        loadText29();
        loadText30();
        loadText31();
        loadText32();
        loadText33();

        loadText40();
        loadText41();
        loadText42();
        loadText43();
        loadText44();
        loadText45();
        loadText46();
        loadText47();
        loadText48();
        loadText49();
        loadText50();
        loadText51();


        loadText52();
        loadText53();
        loadText54();
        loadText55();



        //loadText60();
//        loadText61();

        //loadText62();
      //  loadText63();
       // loadText64();
      //  loadText65();

        loadText66();
        loadText67();
        loadText68();





        loadText73();
        loadText74();

        loadText79();
        loadText80();
        loadText81();
        loadText82();

//        loadText83();
//        loadText84();
        //loadText85();
//        loadText86();

        // loadText89();

        loadText201();
        loadText202();
        loadText203();
        loadText204();
        loadText205();
        loadText206();
        loadText207();
        loadText208();
        loadText209();
        loadText210();
        loadText211();
        loadText212();
        loadText213();
        loadText214();
        loadText215();
        loadText216();
        loadText217();
        loadText218();
        loadText219();
        loadText220();
        loadText221();
        loadText222();
        loadText223();
        loadText224();
        loadText225();
        //loadText226();
       // loadText227();
       // loadText228();
       // loadText229();
        loadText230();
        loadText231();
        loadText232();
        loadText233();
        loadText234();
        loadText235();
        loadText236();
        loadText237();
        loadText238();
        loadText239();
        loadText240();
        loadText241();
        loadText242();
        loadText243();
        loadText244();
        loadText245();
        loadText246();
        loadText247();
        loadText248();

        loadText301();
        loadText302();
        loadText303();

        loadText304();

        loadText197();
        loadText277();
        loadText257();
        loadText408();



        //Ряды кнопок (по Алерт Диалогу)

        //region секция 1 (button101 = (Button) findViewById(R.id.button10);)
        button101 = (Button) findViewById(R.id.button10);
        final_text = (TextView) findViewById(R.id.button10);
        button101.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );
        button102 = (Button) findViewById(R.id.button2);
        final_text2 = (TextView) findViewById(R.id.button2);
        button102.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text2.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );
        button103 = (Button) findViewById(R.id.button);
        final_text3 = (TextView) findViewById(R.id.button);
        button103.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text3.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );
        button104 = (Button) findViewById(R.id.button3);
        final_text4 = (TextView) findViewById(R.id.button3);
        button104.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text4.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );
        button105 = (Button) findViewById(R.id.button5);
        final_text5 = (TextView) findViewById(R.id.button5);
        button105.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text5.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );
        button106 = (Button) findViewById(R.id.button6);
        final_text6 = (TextView) findViewById(R.id.button6);
        button106.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text6.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );
        button107 = (Button) findViewById(R.id.button7);
        final_text7 = (TextView) findViewById(R.id.button7);
        button107.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text7.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );
        button108 = (Button) findViewById(R.id.button38);
        final_text8 = (TextView) findViewById(R.id.button38);
        button108.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text8.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );
        button109 = (Button) findViewById(R.id.button40);
        final_text9 = (TextView) findViewById(R.id.button40);
        button109.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text9.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );
        button110 = (Button) findViewById(R.id.button39);
        final_text10 = (TextView) findViewById(R.id.button39);
        button110.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text10.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );
        button111 = (Button) findViewById(R.id.button8);
        final_text11 = (TextView) findViewById(R.id.button8);
        button111.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text11.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion



        //region секция 3
        button123 = (Button) findViewById(R.id.button97);
        final_text23 = (TextView) findViewById(R.id.button97);
        button123.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button123
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text23.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button124 = (Button) findViewById(R.id.button98);
        final_text24 = (TextView) findViewById(R.id.button98);
        button124.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button124
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text24.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button125 = (Button) findViewById(R.id.button99);
        final_text25 = (TextView) findViewById(R.id.button99);
        button125.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button114
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text25.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button126 = (Button) findViewById(R.id.button100);
        final_text26 = (TextView) findViewById(R.id.button100);
        button126.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button126
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text26.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button127 = (Button) findViewById(R.id.button101);
        final_text27 = (TextView) findViewById(R.id.button101);
        button127.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button127
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text27.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button128 = (Button) findViewById(R.id.button102);
        final_text28 = (TextView) findViewById(R.id.button102);
        button128.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button128
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text28.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button129 = (Button) findViewById(R.id.button103);
        final_text29 = (TextView) findViewById(R.id.button103);
        button129.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button129
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text29.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button130 = (Button) findViewById(R.id.button104);
        final_text30 = (TextView) findViewById(R.id.button104);
        button130.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button130
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text30.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button131 = (Button) findViewById(R.id.button105);
        final_text31 = (TextView) findViewById(R.id.button105);
        button131.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button131
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text31.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button132 = (Button) findViewById(R.id.button11);
        final_text32 = (TextView) findViewById(R.id.button11);
        button132.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button132
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text32.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button133 = (Button) findViewById(R.id.button12);
        final_text33 = (TextView) findViewById(R.id.button12);
        button133.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button133
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text33.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );



        //endregion




//endregion




        //region секция 5
        button140 = (Button) findViewById(R.id.button61);
        final_text40 = (TextView) findViewById(R.id.button61);
        button140.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button123
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text40.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button141 = (Button) findViewById(R.id.button62);
        final_text41 = (TextView) findViewById(R.id.button62);
        button141.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button124
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text41.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button142 = (Button) findViewById(R.id.button63);
        final_text42 = (TextView) findViewById(R.id.button63);
        button142.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button114
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text42.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button143 = (Button) findViewById(R.id.button64);
        final_text43 = (TextView) findViewById(R.id.button64);
        button143.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button126
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text43.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button144 = (Button) findViewById(R.id.button65);
        final_text44 = (TextView) findViewById(R.id.button65);
        button144.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button127
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text44.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button145 = (Button) findViewById(R.id.button66);
        final_text45 = (TextView) findViewById(R.id.button66);
        button145.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button128
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text45.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion


        //endregion

        //region секция 6
        button146 = (Button) findViewById(R.id.button70);
        final_text46 = (TextView) findViewById(R.id.button70);
        button146.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button123
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt3, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text46.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button147 = (Button) findViewById(R.id.button71);
        final_text47 = (TextView) findViewById(R.id.button71);
        button147.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button124
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text47.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button148 = (Button) findViewById(R.id.button72);
        final_text48 = (TextView) findViewById(R.id.button72);
        button148.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button114
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text48.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button149 = (Button) findViewById(R.id.button73);
        final_text49 = (TextView) findViewById(R.id.button73);
        button149.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button126
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text49.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button150 = (Button) findViewById(R.id.button74);
        final_text50 = (TextView) findViewById(R.id.button74);
        button150.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button127
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text50.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button151 = (Button) findViewById(R.id.button75);
        final_text51 = (TextView) findViewById(R.id.button75);
        button151.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button128
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text51.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion


        //endregion


        //region секция 7


        button152 = (Button) findViewById(R.id.button15);
        final_text52 = (TextView) findViewById(R.id.button15);
        button152.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button123
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text52.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button153 = (Button) findViewById(R.id.button16);
        final_text53 = (TextView) findViewById(R.id.button16);
        button153.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button124
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text53.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button154 = (Button) findViewById(R.id.button17);
        final_text54 = (TextView) findViewById(R.id.button17);
        button154.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button114
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text54.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button155 = (Button) findViewById(R.id.button18);
        final_text55 = (TextView) findViewById(R.id.button18);
        button155.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button126
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text55.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion




        //endregion

        //region секция 8


        //endregion



        //endregion

        /*button160 = (Button) findViewById(R.id.button27);
        final_text60 = (TextView) findViewById(R.id.button27);
        button160.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button114
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text60.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button161 = (Button) findViewById(R.id.button28);
        final_text61 = (TextView) findViewById(R.id.button28);
        button161.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button126
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text61.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button162 = (Button) findViewById(R.id.button29);
        final_text62 = (TextView) findViewById(R.id.button29);
        button162.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button127
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text62.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button163 = (Button) findViewById(R.id.button30);
        final_text63 = (TextView) findViewById(R.id.button30);
        button163.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button128
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text63.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion


        //endregion

        //region секция 9
        button164 = (Button) findViewById(R.id.button31);
        final_text64 = (TextView) findViewById(R.id.button31);
        button164.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button123
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text64.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button165 = (Button) findViewById(R.id.button32);
        final_text65 = (TextView) findViewById(R.id.button32);
        button165.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button124
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text65.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );*/

        //endregion

        button166 = (Button) findViewById(R.id.button19);
        final_text66 = (TextView) findViewById(R.id.button19);
        button166.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button114
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt3, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text66.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button167 = (Button) findViewById(R.id.button20);
        final_text67 = (TextView) findViewById(R.id.button20);
        button167.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button126
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt3, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text67.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button168 = (Button) findViewById(R.id.button25);
        final_text68 = (TextView) findViewById(R.id.button25);
        button168.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button127
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt3, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text68.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion


        //endregion

        //region секция 10



        //endregion

        //endregion




        //endregion



        //endregion
        button173 = (Button) findViewById(R.id.button45);
        final_text73 = (TextView) findViewById(R.id.button45);
        button173.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button114
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text73.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button174 = (Button) findViewById(R.id.button46);
        final_text74 = (TextView) findViewById(R.id.button46);
        button174.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button126
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text74.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion


        //endregion


        //endregion



        //endregion




        //endregion




        //endregion


        //endregion

        //region секция 12 button 26. 33. 34. 35


        button179 = (Button) findViewById(R.id.button26);
        final_text79 = (TextView) findViewById(R.id.button26);
        button179.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button112
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text79.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button180 = (Button) findViewById(R.id.button33);
        final_text80 = (TextView) findViewById(R.id.button33);
        button180.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button113
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text80.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button181 = (Button) findViewById(R.id.button34);
        final_text81 = (TextView) findViewById(R.id.button34);
        button181.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button114
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text81.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button182 = (Button) findViewById(R.id.button35);
        final_text82 = (TextView) findViewById(R.id.button35);
        button182.setOnLongClickListener(new View.OnLongClickListener() {
                                             //region button113
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text82.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );



        button201 = (Button) findViewById(R.id.button201);
        final_text201 = (TextView) findViewById(R.id.button201);
        button201.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text201.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );


        button202 = (Button) findViewById(R.id.button202);
        final_text202 = (TextView) findViewById(R.id.button202);
        button202.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text202.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );


        button203 = (Button) findViewById(R.id.button203);
        final_text203 = (TextView) findViewById(R.id.button203);
        button203.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text203.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );


        button204 = (Button) findViewById(R.id.button204);
        final_text204 = (TextView) findViewById(R.id.button204);
        button204.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text204.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );


        button205 = (Button) findViewById(R.id.button205);
        final_text205 = (TextView) findViewById(R.id.button205);
        button205.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text205.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );


        button206 = (Button) findViewById(R.id.button206);
        final_text206 = (TextView) findViewById(R.id.button206);
        button206.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text206.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );


        button207 = (Button) findViewById(R.id.button207);
        final_text207 = (TextView) findViewById(R.id.button207);
        button207.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text207.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );


        button208 = (Button) findViewById(R.id.button208);
        final_text208 = (TextView) findViewById(R.id.button208);
        button208.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text208.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );


        button209 = (Button) findViewById(R.id.button209);
        final_text209 = (TextView) findViewById(R.id.button209);
        button209.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text209.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );


        button210 = (Button) findViewById(R.id.button210);
        final_text210 = (TextView) findViewById(R.id.button210);
        button210.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text210.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );


        button211 = (Button) findViewById(R.id.button211);
        final_text211 = (TextView) findViewById(R.id.button211);
        button211.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text211.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );


        button212 = (Button) findViewById(R.id.button212);
        final_text212 = (TextView) findViewById(R.id.button212);
        button212.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text212.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );


        button213 = (Button) findViewById(R.id.button213);
        final_text213 = (TextView) findViewById(R.id.button213);
        button213.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text213.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );


        button214 = (Button) findViewById(R.id.button214);
        final_text214 = (TextView) findViewById(R.id.button214);
        button214.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text214.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );


        button215 = (Button) findViewById(R.id.button215);
        final_text215 = (TextView) findViewById(R.id.button215);
        button215.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text215.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );


        button216 = (Button) findViewById(R.id.button216);
        final_text216 = (TextView) findViewById(R.id.button216);
        button216.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text216.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );


        button217 = (Button) findViewById(R.id.button217);
        final_text217 = (TextView) findViewById(R.id.button217);
        button217.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text217.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );


        button218 = (Button) findViewById(R.id.button218);
        final_text218 = (TextView) findViewById(R.id.button218);
        button218.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text218.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );


        button219 = (Button) findViewById(R.id.button219);
        final_text219 = (TextView) findViewById(R.id.button219);
        button219.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text219.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );


        button220 = (Button) findViewById(R.id.button220);
        final_text220 = (TextView) findViewById(R.id.button220);
        button220.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text220.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );


        button221 = (Button) findViewById(R.id.button221);
        final_text221 = (TextView) findViewById(R.id.button221);
        button221.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text221.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );


        button222 = (Button) findViewById(R.id.button222);
        final_text222 = (TextView) findViewById(R.id.button222);
        button222.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text222.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );


        button223 = (Button) findViewById(R.id.button223);
        final_text223 = (TextView) findViewById(R.id.button223);
        button223.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text223.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );


        button224 = (Button) findViewById(R.id.button224);
        final_text224 = (TextView) findViewById(R.id.button224);
        button224.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text224.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );


        button225 = (Button) findViewById(R.id.button225);
        final_text225 = (TextView) findViewById(R.id.button225);
        button225.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text225.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

         /*button226 = (Button) findViewById(R.id.button226);
        final_text226 = (TextView) findViewById(R.id.button226);
        button226.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text226.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

         button227 = (Button) findViewById(R.id.button227);
        final_text227 = (TextView) findViewById(R.id.button227);
        button227.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text227.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

         button228 = (Button) findViewById(R.id.button228);
        final_text228 = (TextView) findViewById(R.id.button228);
        button228.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text228.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

         button229 = (Button) findViewById(R.id.button229);
        final_text229= (TextView) findViewById(R.id.button229);
        button229.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text229.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );*/

         button230 = (Button) findViewById(R.id.button230);
        final_text230 = (TextView) findViewById(R.id.button230);
        button230.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text230.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

         button231 = (Button) findViewById(R.id.button231);
        final_text231 = (TextView) findViewById(R.id.button231);
        button231.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text231.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

         button232 = (Button) findViewById(R.id.button232);
        final_text232 = (TextView) findViewById(R.id.button232);
        button232.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text232.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

         button233 = (Button) findViewById(R.id.button233);
        final_text233 = (TextView) findViewById(R.id.button233);
        button233.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text233.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

         button234 = (Button) findViewById(R.id.button234);
        final_text234 = (TextView) findViewById(R.id.button234);
        button234.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text234.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

         button235 = (Button) findViewById(R.id.button235);
        final_text235 = (TextView) findViewById(R.id.button235);
        button235.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text235.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

         button236 = (Button) findViewById(R.id.button236);
        final_text236 = (TextView) findViewById(R.id.button236);
        button236.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text236.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

         button237 = (Button) findViewById(R.id.button237);
        final_text237 = (TextView) findViewById(R.id.button237);
        button237.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text237.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

         button238 = (Button) findViewById(R.id.button238);
        final_text238 = (TextView) findViewById(R.id.button238);
        button238.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text238.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

         button239 = (Button) findViewById(R.id.button239);
        final_text239 = (TextView) findViewById(R.id.button239);
        button239.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text239.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

         button240 = (Button) findViewById(R.id.button240);
        final_text240 = (TextView) findViewById(R.id.button240);
        button240.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text240.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

         button241 = (Button) findViewById(R.id.button241);
        final_text241 = (TextView) findViewById(R.id.button241);
        button241.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text241.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

         button242 = (Button) findViewById(R.id.button242);
        final_text242 = (TextView) findViewById(R.id.button242);
        button242.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text242.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

         button243 = (Button) findViewById(R.id.button243);
        final_text243 = (TextView) findViewById(R.id.button243);
        button243.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text243.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

         button244 = (Button) findViewById(R.id.button244);
        final_text244 = (TextView) findViewById(R.id.button244);
        button244.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text244.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

         button245 = (Button) findViewById(R.id.button245);
        final_text245 = (TextView) findViewById(R.id.button245);
        button245.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text245.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

         button246 = (Button) findViewById(R.id.button246);
        final_text246 = (TextView) findViewById(R.id.button246);
        button246.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text246.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

         button247 = (Button) findViewById(R.id.button247);
        final_text247 = (TextView) findViewById(R.id.button247);
        button247.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text247.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

         button248 = (Button) findViewById(R.id.button248);
        final_text248 = (TextView) findViewById(R.id.button248);
        button248.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text248.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        button197 = (Button) findViewById(R.id.button197);
        final_text197 = (TextView) findViewById(R.id.button197);
        button197.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text197.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        button277 = (Button) findViewById(R.id.button277);
        final_text277 = (TextView) findViewById(R.id.button277);
        button277.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text277.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        button257 = (Button) findViewById(R.id.button257);
        final_text257 = (TextView) findViewById(R.id.button257);
        button257.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             dialog.cancel();
                                                                         }else
                                                                         {
                                                                             final_text257.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );






        //endregion




        //endregion




//endregion


        // &&&&&&&

//region секция - для копирования
        //endregion - для копирования

        //region секция btn1-btn11
        btn1 = (Button) findViewById(R.id.button10);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button);
        btn4 = (Button) findViewById(R.id.button3);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button38);
        btn9 = (Button) findViewById(R.id.button40);
        btn10 = (Button) findViewById(R.id.button39);
        btn11 = (Button) findViewById(R.id.button8);
        //endregion

        //region секция btn23-btn33
        btn23 = (Button) findViewById(R.id.button97);
        btn24 = (Button) findViewById(R.id.button98);
        btn25 = (Button) findViewById(R.id.button99);
        btn26 = (Button) findViewById(R.id.button100);
        btn27 = (Button) findViewById(R.id.button101);
        btn28 = (Button) findViewById(R.id.button102);
        btn29 = (Button) findViewById(R.id.button103);
        btn30 = (Button) findViewById(R.id.button104);
        btn31 = (Button) findViewById(R.id.button105);
        btn32 = (Button) findViewById(R.id.button11);
        btn33 = (Button) findViewById(R.id.button12);
        //endregion

        //region секция btn34-btn51
       /* btn34 = (Button) findViewById(R.id.button52);
        btn35 = (Button) findViewById(R.id.button53);
        btn36 = (Button) findViewById(R.id.button54);
        btn37 = (Button) findViewById(R.id.button55);
        btn38 = (Button) findViewById(R.id.button59);
        btn39 = (Button) findViewById(R.id.button60);
        */

        btn40 = (Button) findViewById(R.id.button61);
        btn41 = (Button) findViewById(R.id.button62);
        btn42 = (Button) findViewById(R.id.button63);
        btn43 = (Button) findViewById(R.id.button64);
        btn44 = (Button) findViewById(R.id.button65);
        btn45 = (Button) findViewById(R.id.button66);

        btn46 = (Button) findViewById(R.id.button70);
        btn47 = (Button) findViewById(R.id.button71);
        btn48 = (Button) findViewById(R.id.button72);
        btn49 = (Button) findViewById(R.id.button73);
        btn50 = (Button) findViewById(R.id.button74);
        btn51 = (Button) findViewById(R.id.button75);
        //endregion

        //region секция btn52-btn82
        btn52 = (Button) findViewById(R.id.button15);
        btn53 = (Button) findViewById(R.id.button16);
        btn54 = (Button) findViewById(R.id.button17);
        btn55 = (Button) findViewById(R.id.button18);

        Button btn83 = (Button) findViewById(R.id.button45);
        Button btn84 = (Button) findViewById(R.id.button46);


        //btn60 = (Button) findViewById(R.id.button27);
        //btn61 = (Button) findViewById(R.id.button28);
       // btn62 = (Button) findViewById(R.id.button29);
        //btn63 = (Button) findViewById(R.id.button30);
       // btn64 = (Button) findViewById(R.id.button31);
      //  btn65 = (Button) findViewById(R.id.button32);

        btn66 = (Button) findViewById(R.id.button19);
        btn67 = (Button) findViewById(R.id.button20);
        btn68 = (Button) findViewById(R.id.button25);

       // btn69 = (Button) findViewById(R.id.button41);
      //  btn70 = (Button) findViewById(R.id.button42);
      //  btn71 = (Button) findViewById(R.id.button43);
      //  btn72 = (Button) findViewById(R.id.button44);

        //btn73 = (Button) findViewById(R.id.button450);
       // btn74 = (Button) findViewById(R.id.button460);
      //  btn75 = (Button) findViewById(R.id.button461);

        //btn77 = (Button) findViewById(R.id.button36);
        // btn78 = (Button) findViewById(R.id.button37);

        btn79 = (Button) findViewById(R.id.button26);
        btn80 = (Button) findViewById(R.id.button33);
        btn81 = (Button) findViewById(R.id.button34);
        btn82 = (Button) findViewById(R.id.button35);

        btn201 = (Button) findViewById(R.id.button201);
        btn202 = (Button) findViewById(R.id.button202);
        btn203 = (Button) findViewById(R.id.button203);
        btn204 = (Button) findViewById(R.id.button204);
        btn205 = (Button) findViewById(R.id.button205);
        btn206 = (Button) findViewById(R.id.button206);
        btn207 = (Button) findViewById(R.id.button207);
        btn208 = (Button) findViewById(R.id.button208);
        btn209 = (Button) findViewById(R.id.button209);
        btn210 = (Button) findViewById(R.id.button210);
        btn211 = (Button) findViewById(R.id.button211);
        btn212 = (Button) findViewById(R.id.button212);
        btn213 = (Button) findViewById(R.id.button213);
        btn214 = (Button) findViewById(R.id.button214);
        btn215 = (Button) findViewById(R.id.button215);
        btn216 = (Button) findViewById(R.id.button216);
        btn217 = (Button) findViewById(R.id.button217);
        btn218 = (Button) findViewById(R.id.button218);
        btn219 = (Button) findViewById(R.id.button219);
        btn220 = (Button) findViewById(R.id.button220);
        btn221 = (Button) findViewById(R.id.button221);
        btn222 = (Button) findViewById(R.id.button222);
        btn223 = (Button) findViewById(R.id.button223);
        btn224 = (Button) findViewById(R.id.button224);
        btn225 = (Button) findViewById(R.id.button225);
        //btn226 = (Button) findViewById(R.id.button226);
        //btn227 = (Button) findViewById(R.id.button227);
       // btn228 = (Button) findViewById(R.id.button228);
      //  btn229 = (Button) findViewById(R.id.button229);
        btn230 = (Button) findViewById(R.id.button230);
        btn231 = (Button) findViewById(R.id.button231);
        btn232 = (Button) findViewById(R.id.button232);
        btn233 = (Button) findViewById(R.id.button233);
        btn234 = (Button) findViewById(R.id.button234);
        btn235 = (Button) findViewById(R.id.button235);
        btn236 = (Button) findViewById(R.id.button236);
        btn237 = (Button) findViewById(R.id.button237);
        btn238 = (Button) findViewById(R.id.button238);
        btn239 = (Button) findViewById(R.id.button239);
        btn240 = (Button) findViewById(R.id.button240);
        btn241 = (Button) findViewById(R.id.button241);
        btn242 = (Button) findViewById(R.id.button242);
        btn243 = (Button) findViewById(R.id.button243);
        btn244 = (Button) findViewById(R.id.button244);
        btn245 = (Button) findViewById(R.id.button245);
        btn246 = (Button) findViewById(R.id.button246);
        btn247 = (Button) findViewById(R.id.button247);
        btn248 = (Button) findViewById(R.id.button248);

        btn197 = (Button) findViewById(R.id.button197);
        btn277 = (Button) findViewById(R.id.button277);
        btn257 = (Button) findViewById(R.id.button257);


        //endregion


        //region секция wir_1-wir_10
        wir_1 = (TextView) findViewById(R.id.textViewWir);
        wir_2 = (TextView) findViewById(R.id.textViewWir2);
        wir_3 = (TextView) findViewById(R.id.textViewWir3);
        wir_4 = (TextView) findViewById(R.id.textViewWir4);
        wir_5 = (TextView) findViewById(R.id.textViewWir5);
        wir_6 = (TextView) findViewById(R.id.textViewWir6);
        wir_7 = (TextView) findViewById(R.id.textViewWir7);
        wir_8 = (TextView) findViewById(R.id.textViewWir8);
       // wir_9 = (TextView) findViewById(R.id.textViewWir9);
        wir_10 = (TextView) findViewById(R.id.textViewWir10);
        wir_11 = (TextView) findViewById(R.id.textViewWir11);
      //  wir_12 = (TextView) findViewById(R.id.textViewWir12);
        wir_13 = (TextView) findViewById(R.id.textViewWir13);
        wir_14 = (TextView) findViewById(R.id.textViewWir14);
        wir_15 = (TextView) findViewById(R.id.textViewWir15);
        wir_16 = (TextView) findViewById(R.id.textViewWir16);
        wir_17 = (TextView) findViewById(R.id.textViewWir17);




        //endregion


        View.OnClickListener btnClk = new View.OnClickListener() {

            @Override
            public void onClick(View v) {




                final TextView bill = (TextView) findViewById(R.id.button8);
                if (bill.getText().length() == 0)
                {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Заполнение пустых ячеек", Toast.LENGTH_LONG);

                    toast.show();

                    final TextView bill1 = (TextView) findViewById(R.id.button10);
                    final TextView bill2 = (TextView) findViewById(R.id.button2);
                    final TextView bill3 = (TextView) findViewById(R.id.button);
                    final TextView bill4 = (TextView) findViewById(R.id.button3);
                    final TextView bill5 = (TextView) findViewById(R.id.button5);
                    final TextView bill6 = (TextView) findViewById(R.id.button6);
                    final TextView bill7 = (TextView) findViewById(R.id.button7);
                    final TextView bill8 = (TextView) findViewById(R.id.button38);
                    final TextView bill9 = (TextView) findViewById(R.id.button40);
                    final TextView bill10 = (TextView) findViewById(R.id.button39);
                    final TextView bill11 = (TextView) findViewById(R.id.button8);

                    final TextView bill12 = (TextView) findViewById(R.id.textView142);
                    final TextView bill13 = (TextView) findViewById(R.id.textView242);



                    final TextView bill23 = (TextView) findViewById(R.id.button97);
                    final TextView bill24 = (TextView) findViewById(R.id.button98);
                    final TextView bill25 = (TextView) findViewById(R.id.button99);
                    final TextView bill26 = (TextView) findViewById(R.id.button100);
                    final TextView bill27 = (TextView) findViewById(R.id.button101);
                    final TextView bill28 = (TextView) findViewById(R.id.button102);
                    final TextView bill29 = (TextView) findViewById(R.id.button103);
                    final TextView bill30 = (TextView) findViewById(R.id.button104);
                    final TextView bill31 = (TextView) findViewById(R.id.button105);
                    final TextView bill32 = (TextView) findViewById(R.id.button11);
                    final TextView bill33 = (TextView) findViewById(R.id.button12);



                    final TextView bill40 = (TextView) findViewById(R.id.button61);
                    final TextView bill41 = (TextView) findViewById(R.id.button62);
                    final TextView bill42 = (TextView) findViewById(R.id.button63);
                    final TextView bill43 = (TextView) findViewById(R.id.button64);
                    final TextView bill44 = (TextView) findViewById(R.id.button65);
                    final TextView bill45 = (TextView) findViewById(R.id.button66);

                    final TextView bill46 = (TextView) findViewById(R.id.button70);
                    final TextView bill47 = (TextView) findViewById(R.id.button71);
                    final TextView bill48 = (TextView) findViewById(R.id.button72);
                    final TextView bill49 = (TextView) findViewById(R.id.button73);
                    final TextView bill50 = (TextView) findViewById(R.id.button74);
                    final TextView bill51 = (TextView) findViewById(R.id.button75);


                    final TextView bill52 = (TextView) findViewById(R.id.button15);
                    final TextView bill53 = (TextView) findViewById(R.id.button16);
                    final TextView bill54 = (TextView) findViewById(R.id.button17);
                    final TextView bill55 = (TextView) findViewById(R.id.button18);

                    //final TextView bill56 = (TextView) findViewById(R.id.button21);
                    //final TextView bill57 = (TextView) findViewById(R.id.button22);
                    // final TextView bill58 = (TextView) findViewById(R.id.button23);
                    // final TextView bill59 = (TextView) findViewById(R.id.button24);

            /*final TextView bill60 = (TextView) findViewById(R.id.button27);
            final TextView bill61 = (TextView) findViewById(R.id.button28);
            final TextView bill62 = (TextView) findViewById(R.id.button29);
            final TextView bill63 = (TextView) findViewById(R.id.button30);
            final TextView bill64 = (TextView) findViewById(R.id.button31);
            final TextView bill65 = (TextView) findViewById(R.id.button32);*/

                    final TextView bill66 = (TextView) findViewById(R.id.button19);
                    final TextView bill67 = (TextView) findViewById(R.id.button20);
                    final TextView bill68 = (TextView) findViewById(R.id.button25);

                    // final TextView bill69 = (TextView) findViewById(R.id.button41);
                    // final TextView bill70 = (TextView) findViewById(R.id.button42);
                    // final TextView bill71 = (TextView) findViewById(R.id.button43);
                    //  final TextView bill72 = (TextView) findViewById(R.id.button44);

                    final TextView bill73 = (TextView) findViewById(R.id.button45);
                    final TextView bill74 = (TextView) findViewById(R.id.button46);

                    final TextView bill79 = (TextView) findViewById(R.id.button26);
                    final TextView bill80 = (TextView) findViewById(R.id.button33);
                    final TextView bill81 = (TextView) findViewById(R.id.button34);
                    final TextView bill82 = (TextView) findViewById(R.id.button35);

                    //final TextView bill83 = (TextView) findViewById(R.id.textView14);
                    //final TextView bill84 = (TextView) findViewById(R.id.textView20);
                    //final TextView bill85 = (TextView) findViewById(R.id.textView43);
                    // final TextView bill86 = (TextView) findViewById(R.id.textView24);
                    // final TextView bill87 = (TextView) findViewById(R.id.textView39);
                    // final TextView bill88 = (TextView) findViewById(R.id.textView37);
                    //final TextView bill89 = (TextView) findViewById(R.id.textView28);

                    final TextView bill201 = (TextView) findViewById(R.id.button201);
                    final TextView bill202 = (TextView) findViewById(R.id.button202);
                    final TextView bill203 = (TextView) findViewById(R.id.button203);
                    final TextView bill204 = (TextView) findViewById(R.id.button204);
                    final TextView bill205 = (TextView) findViewById(R.id.button205);
                    final TextView bill206 = (TextView) findViewById(R.id.button206);
                    final TextView bill207 = (TextView) findViewById(R.id.button207);
                    final TextView bill208 = (TextView) findViewById(R.id.button208);
                    final TextView bill209 = (TextView) findViewById(R.id.button209);
                    final TextView bill210 = (TextView) findViewById(R.id.button210);
                    final TextView bill211 = (TextView) findViewById(R.id.button211);

                    final TextView bill212 = (TextView) findViewById(R.id.button212);
                    final TextView bill213 = (TextView) findViewById(R.id.button213);
                    final TextView bill214 = (TextView) findViewById(R.id.button214);
                    final TextView bill215 = (TextView) findViewById(R.id.button215);
                    final TextView bill216 = (TextView) findViewById(R.id.button216);
                    final TextView bill217 = (TextView) findViewById(R.id.button217);

                    final TextView bill218 = (TextView) findViewById(R.id.button218);
                    final TextView bill219 = (TextView) findViewById(R.id.button219);
                    final TextView bill220 = (TextView) findViewById(R.id.button220);
                    final TextView bill221 = (TextView) findViewById(R.id.button221);

                    final TextView bill222 = (TextView) findViewById(R.id.button222);
                    final TextView bill223 = (TextView) findViewById(R.id.button223);
                    final TextView bill224 = (TextView) findViewById(R.id.button224);
                    final TextView bill225 = (TextView) findViewById(R.id.button225);

                    // final TextView bill226 = (TextView) findViewById(R.id.button226);
                    // final TextView bill227 = (TextView) findViewById(R.id.button227);
                    //final TextView bill228 = (TextView) findViewById(R.id.button228);
                    // final TextView bill229 = (TextView) findViewById(R.id.button229);

                    final TextView bill230 = (TextView) findViewById(R.id.button230);
                    final TextView bill231 = (TextView) findViewById(R.id.button231);
                    final TextView bill232 = (TextView) findViewById(R.id.button232);
                    final TextView bill233 = (TextView) findViewById(R.id.button233);

                    final TextView bill234 = (TextView) findViewById(R.id.button234);
                    final TextView bill235 = (TextView) findViewById(R.id.button235);
                    final TextView bill236 = (TextView) findViewById(R.id.button236);

                    final TextView bill237 = (TextView) findViewById(R.id.button237);
                    final TextView bill238 = (TextView) findViewById(R.id.button238);
                    final TextView bill239 = (TextView) findViewById(R.id.button239);
                    final TextView bill240 = (TextView) findViewById(R.id.button240);
                    final TextView bill241 = (TextView) findViewById(R.id.button241);
                    final TextView bill242 = (TextView) findViewById(R.id.button242);

                    final TextView bill243 = (TextView) findViewById(R.id.button243);
                    final TextView bill244 = (TextView) findViewById(R.id.button244);
                    final TextView bill245 = (TextView) findViewById(R.id.button245);
                    final TextView bill246 = (TextView) findViewById(R.id.button246);
                    final TextView bill247 = (TextView) findViewById(R.id.button247);
                    final TextView bill248 = (TextView) findViewById(R.id.button248);


                    final TextView bill197 = (TextView) findViewById(R.id.button197);
                    final TextView bill277 = (TextView) findViewById(R.id.button277);
                    final TextView bill257 = (TextView) findViewById(R.id.button257);


                    final TextView bill301 = (TextView) findViewById(R.id.textView201);
                    final TextView bill302 = (TextView) findViewById(R.id.textView301);
                    final TextView bill303 = (TextView) findViewById(R.id.textView401);
                    final TextView bill304 = (TextView) findViewById(R.id.textView4);

                    final TextView bill408 = (TextView) findViewById(R.id.textView208);


                    //etText83 = (TextView) findViewById(R.id.textView14);
                    // etText84 = (TextView) findViewById(R.id.textView20);
                    // etText85 = (TextView) findViewById(R.id.textView43);
                    // etText86 = (TextView) findViewById(R.id.textView24);

                    etText301 = (TextView) findViewById(R.id.textView201);
                    etText302 = (TextView) findViewById(R.id.textView301);
                    etText303 = (TextView) findViewById(R.id.textView401);
                    etText304 = (TextView) findViewById(R.id.textView4);




                                            //a
                                            bill1.setText(0 + "");
                                            bill2.setText(2 + "");
                                            bill3.setText(5 + "");
                                            bill4.setText(10 + "");
                                            bill5.setText(20 + "");
                                            bill6.setText(30 + "");
                                            bill7.setText(50 + "");
                                            bill8.setText(100 + "");
                                            bill9.setText(150 + "");
                                            bill10.setText(200 + "");
                                            bill11.setText(300 + "");

                                            bill12.setText(0.0 + "");
                                            bill13.setText(0.0 + "");


                                            //b
                                            bill23.setText(0 + "");
                                            bill24.setText(10 + "");
                                            bill25.setText(20 + "");
                                            bill26.setText(50 + "");
                                            bill27.setText(80 + "");
                                            bill28.setText(100 + "");
                                            bill29.setText(150 + "");
                                            bill30.setText(200 + "");
                                            bill31.setText(250 + "");
                                            bill32.setText(300 + "");
                                            bill33.setText(350 + "");



                                            bill40.setText(0 + "");
                                            bill41.setText(3 + "");
                                            bill42.setText(5 + "");
                                            bill43.setText(10 + "");
                                            bill44.setText(15 + "");
                                            bill45.setText(20 + "");

                                            bill46.setText(0 + "");
                                            bill47.setText(2.1 + "");
                                            bill48.setText(2.2 + "");
                                            bill49.setText(2.4 + "");
                                            bill50.setText(2.8 + "");
                                            bill51.setText(3.1 + "");


                                            bill52.setText(9 + "");
                                            bill53.setText(10 + "");
                                            bill54.setText(11 + "");
                                            bill55.setText(12 + "");
                                            bill73.setText(15 + "");
                                            bill74.setText(18 + "");



                                    /*bill60.setText(295 + "");
                                    bill61.setText(296 + "");
                                    bill62.setText(298 + "");
                                    bill63.setText(300 + "");
                                    bill64.setText(310 + "");
                                    bill65.setText(320 + "");*/

                                            bill66.setText(50 + "");
                                            bill67.setText(80 + "");
                                            bill68.setText(100 + "");

                                            //bill69.setText(1 + "");
                                            // bill72.setText(2 + "");
                                            // bill70.setText(3 + "");






                                            bill79.setText(18 + "");
                                            bill80.setText(21 + "");
                                            bill81.setText(25 + "");
                                            bill82.setText(30 + "");

//                                    bill83.setText(00.00 + "");
                                            //bill84.setText(00.00 + "");
                                            //bill85.setText(00.00 + "");
                                            // bill86.setText(00.00 + "");

                                            bill201.setText(0 + "");
                                            bill202.setText(20 + "");
                                            bill203.setText(50 + "");
                                            bill204.setText(100 + "");
                                            bill205.setText(200 + "");
                                            bill206.setText(500 + "");
                                            bill207.setText(700 + "");
                                            bill208.setText(800 + "");
                                            bill209.setText(1000 + "");
                                            bill210.setText(1500 + "");
                                            bill211.setText(2000 + "");

                                            bill212.setText(40 + "");
                                            bill213.setText(80 + "");
                                            bill214.setText(90 + "");
                                            bill215.setText(100 + "");
                                            bill216.setText(110 + "");
                                            bill217.setText(120 + "");

                                            bill218.setText(19 + "");
                                            bill219.setText(20 + "");
                                            bill220.setText(21+ "");
                                            bill221.setText(22 + "");

                                            bill222.setText(9 + "");
                                            bill223.setText(10 + "");
                                            bill224.setText(11 + "");
                                            bill225.setText(15 + "");

                                            //bill226.setText(1.5 + "");
                                            //bill227.setText(2.0 + "");
                                            //  bill228.setText(4.0 + "");
                                            //  bill229.setText(5.0 + "");

                                            bill230.setText(15 + "");
                                            bill231.setText(30 + "");
                                            bill232.setText(60 + "");
                                            bill233.setText(80 + "");

                                            bill234.setText(100 + "");
                                            bill235.setText(110 + "");
                                            bill236.setText(150 + "");

                    bill237.setText(0 + "");
                    bill238.setText(10 + "");
                    bill239.setText(20 + "");
                    bill240.setText(25 + "");
                    bill241.setText(30 + "");
                    bill242.setText(35 + "");

                                            bill243.setText(50 + "");
                                            bill244.setText(80 + "");
                                            bill245.setText(90 + "");
                                            bill246.setText(150 + "");
                                            bill247.setText(200 + "");
                                            bill248.setText(250 + "");

                                            bill301.setText(0.0 + "");
                                            bill302.setText(0.0 + "");
                                            bill303.setText(0.0 + "");
                                            bill304.setText(0.0 + "");

                                            bill197.setText(4 + "");
                                            bill277.setText(5 + "");
                                            bill257.setText(10 + "");

                                            bill408.setText(00.00 + "");



                }else
                {

                switch (v.getId()) {


                    //region секция 1.1 (case R.id.button10:)
                    case R.id.button10:
                        TextView textView001 = (TextView) findViewById(R.id.textViewWir);
                        aetText1 = (Button) findViewById(R.id.button10);
                        float num001 = Float.parseFloat(aetText1.getText().toString());
                        float w = (float) num001;
                        textView001.setText(String.format(Locale.US, "%.0f", w) + "");

                        Animation anim1 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button1 = (Button) findViewById(R.id.button10);
                        button1.startAnimation(anim1);


                        break;

                    case R.id.button2:
                        TextView textView002 = (TextView) findViewById(R.id.textViewWir);
                        aetText2 = (Button) findViewById(R.id.button2);
                        float num002 = Float.parseFloat(aetText2.getText().toString());
                        float w2 = (float) num002;
                        textView002.setText(String.format(Locale.US, "%.0f", w2) + "");
                        Animation anim2 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button2 = (Button) findViewById(R.id.button2);
                        button2.startAnimation(anim2);

                        break;

                    case R.id.button:
                        TextView textView003 = (TextView) findViewById(R.id.textViewWir);
                        aetText3 = (Button) findViewById(R.id.button);
                        float num003 = Float.parseFloat(aetText3.getText().toString());
                        float w3 = (float) num003;
                        textView003.setText(String.format(Locale.US, "%.0f", w3) + "");
                        Animation anim3 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button3 = (Button) findViewById(R.id.button);
                        button3.startAnimation(anim3);


                        break;


                    case R.id.button3:
                        TextView textView004 = (TextView) findViewById(R.id.textViewWir);
                        aetText4 = (Button) findViewById(R.id.button3);
                        float num004 = Float.parseFloat(aetText4.getText().toString());
                        float w4 = (float) num004;
                        textView004.setText(String.format(Locale.US, "%.0f", w4) + "");
                        Animation anim4 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button4 = (Button) findViewById(R.id.button3);
                        button4.startAnimation(anim4);

                        break;


                    case R.id.button5:
                        TextView textView005 = (TextView) findViewById(R.id.textViewWir);
                        aetText5 = (Button) findViewById(R.id.button5);
                        float num005 = Float.parseFloat(aetText5.getText().toString());
                        float w5 = (float) num005;
                        textView005.setText(String.format(Locale.US, "%.0f", w5) + "");

                        Animation anim5 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button5 = (Button) findViewById(R.id.button5);
                        button5.startAnimation(anim5);

                        break;


                    case R.id.button6:
                        TextView textView006 = (TextView) findViewById(R.id.textViewWir);
                        aetText6 = (Button) findViewById(R.id.button6);
                        float num006 = Float.parseFloat(aetText6.getText().toString());
                        float w6 = (float) num006;
                        textView006.setText(String.format(Locale.US, "%.0f", w6) + "");
                        Animation anim6 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button6 = (Button) findViewById(R.id.button6);
                        button6.startAnimation(anim6);
                        break;


                    case R.id.button7:
                        TextView textView007 = (TextView) findViewById(R.id.textViewWir);
                        aetText7 = (Button) findViewById(R.id.button7);
                        float num007 = Float.parseFloat(aetText7.getText().toString());
                        float w7 = (float) num007;
                        textView007.setText(String.format(Locale.US, "%.0f", w7) + "");
                        Animation anim7 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button7 = (Button) findViewById(R.id.button7);
                        button7.startAnimation(anim7);
                        break;


                    case R.id.button38:
                        TextView textView008 = (TextView) findViewById(R.id.textViewWir);
                        aetText8 = (Button) findViewById(R.id.button38);
                        float num008 = Float.parseFloat(aetText8.getText().toString());
                        float w8 = (float) num008;
                        textView008.setText(String.format(Locale.US, "%.0f", w8) + "");
                        Animation anim8 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button8 = (Button) findViewById(R.id.button38);
                        button8.startAnimation(anim8);
                        break;


                    case R.id.button40:
                        TextView textView009 = (TextView) findViewById(R.id.textViewWir);
                        aetText9 = (Button) findViewById(R.id.button40);
                        float num009 = Float.parseFloat(aetText9.getText().toString());
                        float w9 = (float) num009;
                        textView009.setText(String.format(Locale.US, "%.0f", w9) + "");
                        Animation anim9 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button9 = (Button) findViewById(R.id.button40);
                        button9.startAnimation(anim9);
                        break;


                    case R.id.button39:
                        TextView textView010 = (TextView) findViewById(R.id.textViewWir);
                        aetText10 = (Button) findViewById(R.id.button39);
                        float num010 = Float.parseFloat(aetText10.getText().toString());
                        float w10 = (float) num010;
                        textView010.setText(String.format(Locale.US, "%.0f", w10) + "");
                        Animation anim10 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button10 = (Button) findViewById(R.id.button39);
                        button10.startAnimation(anim10);
                        break;

                    case R.id.button8:
                        TextView textView011 = (TextView) findViewById(R.id.textViewWir);
                        aetText11 = (Button) findViewById(R.id.button8);
                        float num011 = Float.parseFloat(aetText11.getText().toString());
                        float w11 = (float) num011;
                        textView011.setText(String.format(Locale.US, "%.0f", w11) + "");
                        Animation anim11 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button11 = (Button) findViewById(R.id.button8);
                        button11.startAnimation(anim11);
                        break;

                    //endregion



                    //region секция 3.1
                    case R.id.button97:
                        TextView textView023 = (TextView) findViewById(R.id.textViewWir2);
                        aetText23 = (Button) findViewById(R.id.button97);
                        float num023 = Float.parseFloat(aetText23.getText().toString());
                        float w23 = (float) num023;
                        textView023.setText(String.format(Locale.US, "%.2f", w23) + "");
                        Animation anim12 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button12 = (Button) findViewById(R.id.button97);
                        button12.startAnimation(anim12);
                        break;

                    case R.id.button98:
                        TextView textView024 = (TextView) findViewById(R.id.textViewWir2);
                        aetText24 = (Button) findViewById(R.id.button98);
                        float num024 = Float.parseFloat(aetText24.getText().toString());
                        float w24 = (float) num024;
                        textView024.setText(String.format(Locale.US, "%.2f", w24) + "");
                        Animation anim13 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button13 = (Button) findViewById(R.id.button98);
                        button13.startAnimation(anim13);
                        break;

                    case R.id.button99:
                        TextView textView025 = (TextView) findViewById(R.id.textViewWir2);
                        aetText25 = (Button) findViewById(R.id.button99);
                        float num025 = Float.parseFloat(aetText25.getText().toString());
                        float w25 = (float) num025;
                        textView025.setText(String.format(Locale.US, "%.2f", w25) + "");
                        Animation anim14 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button14 = (Button) findViewById(R.id.button99);
                        button14.startAnimation(anim14);
                        break;


                    case R.id.button100:
                        TextView textView026 = (TextView) findViewById(R.id.textViewWir2);
                        aetText26 = (Button) findViewById(R.id.button100);
                        float num026 = Float.parseFloat(aetText26.getText().toString());
                        float w26 = (float) num026;
                        textView026.setText(String.format(Locale.US, "%.2f", w26) + "");

                        Animation anim15 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button15 = (Button) findViewById(R.id.button100);
                        button15.startAnimation(anim15);
                        break;


                    case R.id.button101:
                        TextView textView027 = (TextView) findViewById(R.id.textViewWir2);
                        aetText27 = (Button) findViewById(R.id.button101);
                        float num027 = Float.parseFloat(aetText27.getText().toString());
                        float w27 = (float) num027;
                        textView027.setText(String.format(Locale.US, "%.2f", w27) + "");

                        Animation anim16 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button16 = (Button) findViewById(R.id.button101);
                        button16.startAnimation(anim16);
                        break;


                    case R.id.button102:
                        TextView textView028 = (TextView) findViewById(R.id.textViewWir2);
                        aetText28 = (Button) findViewById(R.id.button102);
                        float num028 = Float.parseFloat(aetText28.getText().toString());
                        float w28 = (float) num028;
                        textView028.setText(String.format(Locale.US, "%.2f", w28) + "");

                        Animation anim17 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button17 = (Button) findViewById(R.id.button102);
                        button17.startAnimation(anim17);
                        break;


                    case R.id.button103:
                        TextView textView029 = (TextView) findViewById(R.id.textViewWir2);
                        aetText29 = (Button) findViewById(R.id.button103);
                        float num029 = Float.parseFloat(aetText29.getText().toString());
                        float w29 = (float) num029;
                        textView029.setText(String.format(Locale.US, "%.2f", w29) + "");

                        Animation anim18 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button18 = (Button) findViewById(R.id.button103);
                        button18.startAnimation(anim18);
                        break;


                    case R.id.button104:
                        TextView textView030 = (TextView) findViewById(R.id.textViewWir2);
                        aetText30 = (Button) findViewById(R.id.button104);
                        float num030 = Float.parseFloat(aetText30.getText().toString());
                        float w30 = (float) num030;
                        textView030.setText(String.format(Locale.US, "%.2f", w30) + "");
                        Animation anim19 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button19 = (Button) findViewById(R.id.button104);
                        button19.startAnimation(anim19);
                        break;


                    case R.id.button105:
                        TextView textView031 = (TextView) findViewById(R.id.textViewWir2);
                        aetText31 = (Button) findViewById(R.id.button105);
                        float num031 = Float.parseFloat(aetText31.getText().toString());
                        float w31 = (float) num031;
                        textView031.setText(String.format(Locale.US, "%.2f", w31) + "");
                        Animation anim20 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button20 = (Button) findViewById(R.id.button105);
                        button20.startAnimation(anim20);
                        break;


                    case R.id.button11:
                        TextView textView032 = (TextView) findViewById(R.id.textViewWir2);
                        aetText32 = (Button) findViewById(R.id.button11);
                        float num032 = Float.parseFloat(aetText32.getText().toString());
                        float w32 = (float) num032;
                        textView032.setText(String.format(Locale.US, "%.2f", w32) + "");

                        Animation anim21 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button21 = (Button) findViewById(R.id.button11);
                        button21.startAnimation(anim21);
                        break;

                    case R.id.button12:
                        TextView textView033 = (TextView) findViewById(R.id.textViewWir2);
                        aetText33 = (Button) findViewById(R.id.button12);
                        float num033 = Float.parseFloat(aetText33.getText().toString());
                        float w33 = (float) num033;
                        textView033.setText(String.format(Locale.US, "%.2f", w33) + "");

                        Animation anim22 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button22 = (Button) findViewById(R.id.button12);
                        button22.startAnimation(anim22);
                        break;

                    //endregion


                    //region секция 4.1

                   /* case R.id.button52:
                        TextView textView034 = (TextView) findViewById(R.id.textViewWir4);
                        aetText34 = (Button) findViewById(R.id.button52);
                        float num034 = Float.parseFloat(aetText34.getText().toString());
                        float w34 = (float) num034;
                        textView034.setText(String.format(Locale.US, "%.2f", w34) + "");
                        break;

                    case R.id.button53:
                        TextView textView035 = (TextView) findViewById(R.id.textViewWir4);
                        aetText35 = (Button) findViewById(R.id.button53);
                        float num035 = Float.parseFloat(aetText35.getText().toString());
                        float w35 = (float) num035;
                        textView035.setText(String.format(Locale.US, "%.2f", w35) + "");
                        break;

                    case R.id.button54:
                        TextView textView036 = (TextView) findViewById(R.id.textViewWir4);
                        aetText36 = (Button) findViewById(R.id.button54);
                        float num036 = Float.parseFloat(aetText36.getText().toString());
                        float w36 = (float) num036;
                        textView036.setText(String.format(Locale.US, "%.2f", w36) + "");
                        break;


                    case R.id.button55:
                        TextView textView037 = (TextView) findViewById(R.id.textViewWir4);
                        aetText37 = (Button) findViewById(R.id.button55);
                        float num037 = Float.parseFloat(aetText37.getText().toString());
                        float w37 = (float) num037;
                        textView037.setText(String.format(Locale.US, "%.2f", w37) + "");
                        break;


                    case R.id.button59:
                        TextView textView038 = (TextView) findViewById(R.id.textViewWir4);
                        aetText38 = (Button) findViewById(R.id.button59);
                        float num038 = Float.parseFloat(aetText38.getText().toString());
                        float w38 = (float) num038;
                        textView038.setText(String.format(Locale.US, "%.2f", w38) + "");
                        break;


                    case R.id.button60:
                        TextView textView039 = (TextView) findViewById(R.id.textViewWir4);
                        aetText39 = (Button) findViewById(R.id.button60);
                        float num039 = Float.parseFloat(aetText39.getText().toString());
                        float w39 = (float) num039;
                        textView039.setText(String.format(Locale.US, "%.2f", w39) + "");
                        break;
                        */




                    //endregion

                    //region секция 5.1
                    case R.id.button61:
                        TextView textView040 = (TextView) findViewById(R.id.textViewWir5);
                        aetText40 = (Button) findViewById(R.id.button61);
                        float num040 = Float.parseFloat(aetText40.getText().toString());
                        float w40 = (float) num040;
                        textView040.setText(String.format(Locale.US, "%.0f", w40) + "");

                        Animation anim23 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button23 = (Button) findViewById(R.id.button61);
                        button23.startAnimation(anim23);
                        break;

                    case R.id.button62:
                        TextView textView041 = (TextView) findViewById(R.id.textViewWir5);
                        aetText41 = (Button) findViewById(R.id.button62);
                        float num041 = Float.parseFloat(aetText41.getText().toString());
                        float w41 = (float) num041;
                        textView041.setText(String.format(Locale.US, "%.0f", w41) + "");

                        Animation anim24 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button24 = (Button) findViewById(R.id.button62);
                        button24.startAnimation(anim24);
                        break;

                    case R.id.button63:
                        TextView textView042 = (TextView) findViewById(R.id.textViewWir5);
                        aetText42 = (Button) findViewById(R.id.button63);
                        float num042 = Float.parseFloat(aetText42.getText().toString());
                        float w42 = (float) num042;
                        textView042.setText(String.format(Locale.US, "%.0f", w42) + "");

                        Animation anim25 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button25 = (Button) findViewById(R.id.button63);
                        button25.startAnimation(anim25);
                        break;


                    case R.id.button64:
                        TextView textView043 = (TextView) findViewById(R.id.textViewWir5);
                        aetText43 = (Button) findViewById(R.id.button64);
                        float num043 = Float.parseFloat(aetText43.getText().toString());
                        float w43 = (float) num043;
                        textView043.setText(String.format(Locale.US, "%.0f", w43) + "");

                        Animation anim26 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button26 = (Button) findViewById(R.id.button64);
                        button26.startAnimation(anim26);
                        break;


                    case R.id.button65:
                        TextView textView044 = (TextView) findViewById(R.id.textViewWir5);
                        aetText44 = (Button) findViewById(R.id.button65);
                        float num044 = Float.parseFloat(aetText44.getText().toString());
                        float w44 = (float) num044;
                        textView044.setText(String.format(Locale.US, "%.0f", w44) + "");

                        Animation anim27 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button27 = (Button) findViewById(R.id.button65);
                        button27.startAnimation(anim27);
                        break;


                    case R.id.button66:
                        TextView textView045 = (TextView) findViewById(R.id.textViewWir5);
                        aetText45 = (Button) findViewById(R.id.button66);
                        float num045 = Float.parseFloat(aetText45.getText().toString());
                        float w45 = (float) num045;
                        textView045.setText(String.format(Locale.US, "%.0f", w45) + "");

                        Animation anim28 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button28 = (Button) findViewById(R.id.button66);
                        button28.startAnimation(anim28);
                        break;

                    //endregion

                    //region секция 6.1
                    case R.id.button70:
                        TextView textView046 = (TextView) findViewById(R.id.textViewWir15);
                        aetText46 = (Button) findViewById(R.id.button70);
                        float num046 = Float.parseFloat(aetText46.getText().toString());
                        float w46 = (float) num046;
                        textView046.setText(String.format(Locale.US, "%.2f", w46) + "");

                        Animation anim29 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button29 = (Button) findViewById(R.id.button70);
                        button29.startAnimation(anim29);
                        break;

                    case R.id.button71:
                        TextView textView047 = (TextView) findViewById(R.id.textViewWir15);
                        aetText47 = (Button) findViewById(R.id.button71);
                        float num047 = Float.parseFloat(aetText47.getText().toString());
                        float w47 = (float) num047;
                        textView047.setText(String.format(Locale.US, "%.2f", w47) + "");

                        Animation anim30 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button30 = (Button) findViewById(R.id.button71);
                        button30.startAnimation(anim30);
                        break;

                    case R.id.button72:
                        TextView textView048 = (TextView) findViewById(R.id.textViewWir15);
                        aetText48 = (Button) findViewById(R.id.button72);
                        float num048 = Float.parseFloat(aetText48.getText().toString());
                        float w48 = (float) num048;
                        textView048.setText(String.format(Locale.US, "%.2f", w48) + "");

                        Animation anim31 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button31 = (Button) findViewById(R.id.button72);
                        button31.startAnimation(anim31);
                        break;


                    case R.id.button73:
                        TextView textView049 = (TextView) findViewById(R.id.textViewWir15);
                        aetText49 = (Button) findViewById(R.id.button73);
                        float num049 = Float.parseFloat(aetText49.getText().toString());
                        float w49 = (float) num049;
                        textView049.setText(String.format(Locale.US, "%.2f", w49) + "");

                        Animation anim32 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button32 = (Button) findViewById(R.id.button73);
                        button32.startAnimation(anim32);
                        break;


                    case R.id.button74:
                        TextView textView050 = (TextView) findViewById(R.id.textViewWir15);
                        aetText50 = (Button) findViewById(R.id.button74);
                        float num050 = Float.parseFloat(aetText50.getText().toString());
                        float w50 = (float) num050;
                        textView050.setText(String.format(Locale.US, "%.2f", w50) + "");

                        Animation anim33 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button33 = (Button) findViewById(R.id.button74);
                        button33.startAnimation(anim33);
                        break;


                    case R.id.button75:
                        TextView textView051 = (TextView) findViewById(R.id.textViewWir15);
                        aetText51 = (Button) findViewById(R.id.button75);
                        float num051 = Float.parseFloat(aetText51.getText().toString());
                        float w51 = (float) num051;
                        textView051.setText(String.format(Locale.US, "%.2f", w51) + "");

                        Animation anim34 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button34 = (Button) findViewById(R.id.button75);
                        button34.startAnimation(anim34);
                        break;

                    //endregion

                    //region секция 7.1
                    case R.id.button15:
                        TextView textView052 = (TextView) findViewById(R.id.textViewWir11);
                        aetText52 = (Button) findViewById(R.id.button15);
                        float num052 = Float.parseFloat(aetText52.getText().toString());
                        float w52 = (float) num052;
                        textView052.setText(String.format(Locale.US, "%.2f", w52) + "");

                        Animation anim35 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button35 = (Button) findViewById(R.id.button15);
                        button35.startAnimation(anim35);
                        break;

                    case R.id.button16:
                        TextView textView053 = (TextView) findViewById(R.id.textViewWir11);
                        aetText53 = (Button) findViewById(R.id.button16);
                        float num053 = Float.parseFloat(aetText53.getText().toString());
                        float w53 = (float) num053;
                        textView053.setText(String.format(Locale.US, "%.2f", w53) + "");

                        Animation anim36 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button36 = (Button) findViewById(R.id.button16);
                        button36.startAnimation(anim36);
                        break;

                    case R.id.button17:
                        TextView textView054 = (TextView) findViewById(R.id.textViewWir11);
                        aetText54 = (Button) findViewById(R.id.button17);
                        float num054 = Float.parseFloat(aetText54.getText().toString());
                        float w54 = (float) num054;
                        textView054.setText(String.format(Locale.US, "%.2f", w54) + "");

                        Animation anim37 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button37 = (Button) findViewById(R.id.button17);
                        button37.startAnimation(anim37);
                        break;


                    case R.id.button18:
                        TextView textView055 = (TextView) findViewById(R.id.textViewWir11);
                        aetText55 = (Button) findViewById(R.id.button18);
                        float num055 = Float.parseFloat(aetText55.getText().toString());
                        float w55 = (float) num055;
                        textView055.setText(String.format(Locale.US, "%.2f", w55) + "");

                        Animation anim38 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button38 = (Button) findViewById(R.id.button18);
                        button38.startAnimation(anim38);
                        break;

                    case R.id.button45:
                        TextView textView1073 = (TextView) findViewById(R.id.textViewWir11);
                        Button aetText156 = (Button) findViewById(R.id.button45);
                        float num1073 = Float.parseFloat(aetText156.getText().toString());
                        float w173 = (float) num1073;
                        textView1073.setText(String.format(Locale.US, "%.2f", w173) + "");

                        Animation anim73 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button73 = (Button) findViewById(R.id.button45);
                        button73.startAnimation(anim73);
                        break;

                    case R.id.button46:
                        TextView textView1074 = (TextView) findViewById(R.id.textViewWir11);
                        Button aetText157 = (Button) findViewById(R.id.button45);
                        aetText157 = (Button) findViewById(R.id.button46);
                        float num1074 = Float.parseFloat(aetText157.getText().toString());
                        float w174 = (float) num1074;
                        textView1074.setText(String.format(Locale.US, "%.2f", w174) + "");

                        Animation anim74 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button74 = (Button) findViewById(R.id.button46);
                        button74.startAnimation(anim74);
                        break;


                    //endregion

                    //region секция 8.1
                   /*
                    case R.id.button21:
                        TextView textView056 = (TextView) findViewById(R.id.textViewWir8);
                        aetText56 = (Button) findViewById(R.id.button21);
                        float num056 = Float.parseFloat(aetText56.getText().toString());
                        float w56 = (float) num056;
                        textView056.setText(String.format(Locale.US, "%.0f", w56) + "");
                        break;

                    case R.id.button22:
                        TextView textView057 = (TextView) findViewById(R.id.textViewWir8);
                        aetText57 = (Button) findViewById(R.id.button22);
                        float num057 = Float.parseFloat(aetText57.getText().toString());
                        float w57 = (float) num057;
                        textView057.setText(String.format(Locale.US, "%.0f", w57) + "");
                        break;

                    case R.id.button23:
                        TextView textView058 = (TextView) findViewById(R.id.textViewWir8);
                        aetText58 = (Button) findViewById(R.id.button23);
                        float num058 = Float.parseFloat(aetText58.getText().toString());
                        float w58 = (float) num058;
                        textView058.setText(String.format(Locale.US, "%.0f", w58) + "");
                        break;


                    case R.id.button24:
                        TextView textView059 = (TextView) findViewById(R.id.textViewWir8);
                        aetText59 = (Button) findViewById(R.id.button24);
                        float num059 = Float.parseFloat(aetText59.getText().toString());
                        float w59 = (float) num059;
                        textView059.setText(String.format(Locale.US, "%.0f", w59) + "");
                        break;
                        */


                    //endregion

                    //region секция 9.1




                    //endregion

                    //region секция 10.1
                    case R.id.button19:
                        TextView textView066 = (TextView) findViewById(R.id.textViewWir13);
                        aetText66 = (Button) findViewById(R.id.button19);
                        float num066 = Float.parseFloat(aetText66.getText().toString());
                        float w66 = (float) num066;
                        textView066.setText(String.format(Locale.US, "%.2f", w66) + "");

                        Animation anim45 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button45 = (Button) findViewById(R.id.button19);
                        button45.startAnimation(anim45);
                        break;

                    case R.id.button20:
                        TextView textView067 = (TextView) findViewById(R.id.textViewWir13);
                        aetText67 = (Button) findViewById(R.id.button20);
                        float num067 = Float.parseFloat(aetText67.getText().toString());
                        float w67 = (float) num067;
                        textView067.setText(String.format(Locale.US, "%.2f", w67) + "");

                        Animation anim46 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button46 = (Button) findViewById(R.id.button20);
                        button46.startAnimation(anim46);
                        break;

                    case R.id.button25:
                        TextView textView068 = (TextView) findViewById(R.id.textViewWir13);
                        aetText68 = (Button) findViewById(R.id.button25);
                        float num068 = Float.parseFloat(aetText68.getText().toString());
                        float w68 = (float) num068;
                        textView068.setText(String.format(Locale.US, "%.2f", w68) + "");

                        Animation anim47 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button47 = (Button) findViewById(R.id.button25);
                        button47.startAnimation(anim47);
                        break;



                    //endregion

                    //region секция 11.1

                    /*case R.id.button36:
                        TextView textView077 = (TextView) findViewById(R.id.textViewWir11);
                        aetText77 = (Button) findViewById(R.id.button36);
                        float num077 = Float.parseFloat(aetText77.getText().toString());
                        float w77 = (float) num077;
                        textView077.setText(String.format(Locale.US, "%.0f", w77) + "");
                        imageView.setImageResource(R.drawable.rad3);
                        break;

                    case R.id.button37:
                        TextView textView078 = (TextView) findViewById(R.id.textViewWir11);
                        aetText78 = (Button) findViewById(R.id.button37);
                        float num078 = Float.parseFloat(aetText78.getText().toString());
                        float w78 = (float) num078;
                        textView078.setText(String.format(Locale.US, "%.0f", w78) + "");
                        imageView.setImageResource(R.drawable.rad10);
                        break;*/



                    //endregion

                    //region секция button 12.1 - 26. 33. 34. 35.
                    case R.id.button26:
                        TextView textView079 = (TextView) findViewById(R.id.textViewWir8);
                        aetText79 = (Button) findViewById(R.id.button26);
                        float num079 = Float.parseFloat(aetText79.getText().toString());
                        float w79 = (float) num079;
                        textView079.setText(String.format(Locale.US, "%.0f", w79) + "");

                        Animation anim55 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button55 = (Button) findViewById(R.id.button26);
                        button55.startAnimation(anim55);

                        TextView num_start114;
                        TextView num_rost114;
                        TextView num_finish114;
                        num_start114 = findViewById(R.id.textViewWir6);
                        num_rost114 = findViewById(R.id.textViewWir8);
                        num_finish114 = findViewById(R.id.textViewWir18);
                        float num_start0014 = Float.parseFloat(num_start114.getText().toString());
                        float num_rost0024 = Float.parseFloat(num_rost114.getText().toString());
                        float num_finish0034 = Float.parseFloat(num_finish114.getText().toString());
                        float Ves_Tushki0044 = (float) ((num_start0014+num_rost0024+num_finish0034)*0.07);

                        TextView textView20824 = (TextView) findViewById(R.id.textViewWir15);
                        textView20824.setText(String.format(Locale.US, "%.2f", Ves_Tushki0044) + "");
                        break;



                    case R.id.button33:
                        TextView textView080 = (TextView) findViewById(R.id.textViewWir8);
                        aetText80 = (Button) findViewById(R.id.button33);
                        float num080 = Float.parseFloat(aetText80.getText().toString());
                        float w80 = (float) num080;
                        textView080.setText(String.format(Locale.US, "%.0f", w80) + "");

                        Animation anim56 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button56 = (Button) findViewById(R.id.button33);
                        button56.startAnimation(anim56);

                        TextView num_start115;
                        TextView num_rost115;
                        TextView num_finish115;
                        num_start115 = findViewById(R.id.textViewWir6);
                        num_rost115 = findViewById(R.id.textViewWir8);
                        num_finish115 = findViewById(R.id.textViewWir18);
                        float num_start0015 = Float.parseFloat(num_start115.getText().toString());
                        float num_rost0025 = Float.parseFloat(num_rost115.getText().toString());
                        float num_finish0035 = Float.parseFloat(num_finish115.getText().toString());
                        float Ves_Tushki0045 = (float) ((num_start0015+num_rost0025+num_finish0035)*0.07);

                        TextView textView20825 = (TextView) findViewById(R.id.textViewWir15);
                        textView20825.setText(String.format(Locale.US, "%.2f", Ves_Tushki0045) + "");
                        break;



                    case R.id.button34:
                        TextView textView081 = (TextView) findViewById(R.id.textViewWir8);
                        aetText81 = (Button) findViewById(R.id.button34);
                        float num081 = Float.parseFloat(aetText81.getText().toString());
                        float w81 = (float) num081;
                        textView081.setText(String.format(Locale.US, "%.0f", w81) + "");

                        Animation anim57 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button57 = (Button) findViewById(R.id.button34);
                        button57.startAnimation(anim57);

                        TextView num_start1100;
                        TextView num_rost1100;
                        TextView num_finish1100;
                        num_start1100 = findViewById(R.id.textViewWir6);
                        num_rost1100 = findViewById(R.id.textViewWir8);
                        num_finish1100 = findViewById(R.id.textViewWir18);
                        float num_start00100 = Float.parseFloat(num_start1100.getText().toString());
                        float num_rost00200 = Float.parseFloat(num_rost1100.getText().toString());
                        float num_finish00300 = Float.parseFloat(num_finish1100.getText().toString());
                        float Ves_Tushki00400 = (float) ((num_start00100+num_rost00200+num_finish00300)*0.07);

                        TextView textView208200 = (TextView) findViewById(R.id.textViewWir15);
                        textView208200.setText(String.format(Locale.US, "%.2f", Ves_Tushki00400) + "");
                        break;



                    case R.id.button35:
                        TextView textView082 = (TextView) findViewById(R.id.textViewWir8);
                        aetText82 = (Button) findViewById(R.id.button35);
                        float num082 = Float.parseFloat(aetText82.getText().toString());
                        float w82 = (float) num082;
                        textView082.setText(String.format(Locale.US, "%.0f", w82) + "");
                        //imageView.setImageResource(R.drawable.rad8);

                        Animation anim58 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button58 = (Button) findViewById(R.id.button35);
                        button58.startAnimation(anim58);

                        TextView num_start116;
                        TextView num_rost116;
                        TextView num_finish116;
                        num_start116 = findViewById(R.id.textViewWir6);
                        num_rost116 = findViewById(R.id.textViewWir8);
                        num_finish116 = findViewById(R.id.textViewWir18);
                        float num_start0016 = Float.parseFloat(num_start116.getText().toString());
                        float num_rost0026 = Float.parseFloat(num_rost116.getText().toString());
                        float num_finish0036 = Float.parseFloat(num_finish116.getText().toString());
                        float Ves_Tushki0046 = (float) ((num_start0016+num_rost0026+num_finish0036)*0.07);

                        TextView textView20826 = (TextView) findViewById(R.id.textViewWir15);
                        textView20826.setText(String.format(Locale.US, "%.2f", Ves_Tushki0046) + "");
                        break;




                    case R.id.button201:
                        TextView textView201 = (TextView) findViewById(R.id.textViewWir3);
                        aetText201 = (Button) findViewById(R.id.button201);
                        float num201 = Float.parseFloat(aetText201.getText().toString());
                        float w201 = (float) num201;
                        textView201.setText(String.format(Locale.US, "%.0f", w201) + "");
                        Animation anim201 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button201 = (Button) findViewById(R.id.button201);
                        button201.startAnimation(anim201);
                        break;

                    case R.id.button202:
                        TextView textView202 = (TextView) findViewById(R.id.textViewWir3);
                        aetText202 = (Button) findViewById(R.id.button202);
                        float num202 = Float.parseFloat(aetText202.getText().toString());
                        float w202 = (float) num202;
                        textView202.setText(String.format(Locale.US, "%.0f", w202) + "");
                        Animation anim202 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button202 = (Button) findViewById(R.id.button202);
                        button202.startAnimation(anim202);
                        break;

                    case R.id.button203:
                        TextView textView203 = (TextView) findViewById(R.id.textViewWir3);
                        aetText203 = (Button) findViewById(R.id.button203);
                        float num203 = Float.parseFloat(aetText203.getText().toString());
                        float w203 = (float) num203;
                        textView203.setText(String.format(Locale.US, "%.0f", w203) + "");
                        Animation anim203 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button203 = (Button) findViewById(R.id.button203);
                        button203.startAnimation(anim203);
                        break;

                    case R.id.button204:
                        TextView textView204 = (TextView) findViewById(R.id.textViewWir3);
                        aetText204 = (Button) findViewById(R.id.button204);
                        float num204 = Float.parseFloat(aetText204.getText().toString());
                        float w204 = (float) num204;
                        textView204.setText(String.format(Locale.US, "%.0f", w204) + "");
                        Animation anim204 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button204 = (Button) findViewById(R.id.button204);
                        button204.startAnimation(anim204);
                        break;

                    case R.id.button205:
                        TextView textView205 = (TextView) findViewById(R.id.textViewWir3);
                        aetText205 = (Button) findViewById(R.id.button205);
                        float num205 = Float.parseFloat(aetText205.getText().toString());
                        float w205 = (float) num205;
                        textView205.setText(String.format(Locale.US, "%.0f", w205) + "");
                        Animation anim205 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button205 = (Button) findViewById(R.id.button205);
                        button205.startAnimation(anim205);
                        break;

                    case R.id.button206:
                        TextView textView206 = (TextView) findViewById(R.id.textViewWir3);
                        aetText206 = (Button) findViewById(R.id.button206);
                        float num206 = Float.parseFloat(aetText206.getText().toString());
                        float w206 = (float) num206;
                        textView206.setText(String.format(Locale.US, "%.0f", w206) + "");
                        Animation anim206 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button206 = (Button) findViewById(R.id.button206);
                        button206.startAnimation(anim206);
                        break;

                    case R.id.button207:
                        TextView textView207 = (TextView) findViewById(R.id.textViewWir3);
                        aetText207 = (Button) findViewById(R.id.button207);
                        float num207 = Float.parseFloat(aetText207.getText().toString());
                        float w207 = (float) num207;
                        textView207.setText(String.format(Locale.US, "%.0f", w207) + "");
                        Animation anim207 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button207 = (Button) findViewById(R.id.button207);
                        button207.startAnimation(anim207);
                        break;

                    case R.id.button208:
                        TextView textView208 = (TextView) findViewById(R.id.textViewWir3);
                        aetText208 = (Button) findViewById(R.id.button208);
                        float num208 = Float.parseFloat(aetText208.getText().toString());
                        float w208 = (float) num208;
                        textView208.setText(String.format(Locale.US, "%.0f", w208) + "");
                        Animation anim208 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button208 = (Button) findViewById(R.id.button208);
                        button208.startAnimation(anim208);
                        break;

                    case R.id.button209:
                        TextView textView209 = (TextView) findViewById(R.id.textViewWir3);
                        aetText209 = (Button) findViewById(R.id.button209);
                        float num209 = Float.parseFloat(aetText209.getText().toString());
                        float w209 = (float) num209;
                        textView209.setText(String.format(Locale.US, "%.0f", w209) + "");
                        Animation anim209 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button209 = (Button) findViewById(R.id.button209);
                        button209.startAnimation(anim209);
                        break;

                    case R.id.button210:
                        TextView textView210 = (TextView) findViewById(R.id.textViewWir3);
                        aetText210 = (Button) findViewById(R.id.button210);
                        float num210 = Float.parseFloat(aetText210.getText().toString());
                        float w210 = (float) num210;
                        textView210.setText(String.format(Locale.US, "%.0f", w210) + "");
                        Animation anim210 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button210 = (Button) findViewById(R.id.button210);
                        button210.startAnimation(anim210);
                        break;

                    case R.id.button211:
                        TextView textView211 = (TextView) findViewById(R.id.textViewWir3);
                        aetText211 = (Button) findViewById(R.id.button211);
                        float num211 = Float.parseFloat(aetText211.getText().toString());
                        float w211 = (float) num211;
                        textView211.setText(String.format(Locale.US, "%.0f", w211) + "");
                        Animation anim211 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button211 = (Button) findViewById(R.id.button211);
                        button211.startAnimation(anim211);
                        break;


                    case R.id.button212:
                        TextView textView212 = (TextView) findViewById(R.id.textViewWir4);
                        aetText212 = (Button) findViewById(R.id.button212);
                        float num212 = Float.parseFloat(aetText212.getText().toString());
                        float w212 = (float) num212;
                        textView212.setText(String.format(Locale.US, "%.2f", w212) + "");
                        Animation anim212 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button212 = (Button) findViewById(R.id.button212);
                        button212.startAnimation(anim212);
                        break;

                    case R.id.button213:
                        TextView textView213 = (TextView) findViewById(R.id.textViewWir4);
                        aetText213 = (Button) findViewById(R.id.button213);
                        float num213 = Float.parseFloat(aetText213.getText().toString());
                        float w213 = (float) num213;
                        textView213.setText(String.format(Locale.US, "%.2f", w213) + "");
                        Animation anim213 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button213 = (Button) findViewById(R.id.button213);
                        button213.startAnimation(anim213);
                        break;

                    case R.id.button214:
                        TextView textView214 = (TextView) findViewById(R.id.textViewWir4);
                        aetText214 = (Button) findViewById(R.id.button214);
                        float num214 = Float.parseFloat(aetText214.getText().toString());
                        float w214 = (float) num214;
                        textView214.setText(String.format(Locale.US, "%.2f", w214) + "");
                        Animation anim214 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button214 = (Button) findViewById(R.id.button214);
                        button214.startAnimation(anim214);
                        break;

                    case R.id.button215:
                        TextView textView215 = (TextView) findViewById(R.id.textViewWir4);
                        aetText215 = (Button) findViewById(R.id.button215);
                        float num215 = Float.parseFloat(aetText215.getText().toString());
                        float w215 = (float) num215;
                        textView215.setText(String.format(Locale.US, "%.2f", w215) + "");
                        Animation anim215 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button215 = (Button) findViewById(R.id.button215);
                        button215.startAnimation(anim215);
                        break;

                    case R.id.button216:
                        TextView textView216 = (TextView) findViewById(R.id.textViewWir4);
                        aetText216 = (Button) findViewById(R.id.button216);
                        float num216 = Float.parseFloat(aetText216.getText().toString());
                        float w216 = (float) num216;
                        textView216.setText(String.format(Locale.US, "%.2f", w216) + "");
                        Animation anim216 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button216 = (Button) findViewById(R.id.button216);
                        button216.startAnimation(anim216);
                        break;

                    case R.id.button217:
                        TextView textView217 = (TextView) findViewById(R.id.textViewWir4);
                        aetText217 = (Button) findViewById(R.id.button217);
                        float num217 = Float.parseFloat(aetText217.getText().toString());
                        float w217 = (float) num217;
                        textView217.setText(String.format(Locale.US, "%.2f", w217) + "");
                        Animation anim217 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button217 = (Button) findViewById(R.id.button217);
                        button217.startAnimation(anim217);
                        break;


                    case R.id.button218:
                        TextView textView218 = (TextView) findViewById(R.id.textViewWir6);
                        aetText218 = (Button) findViewById(R.id.button218);
                        float num218 = Float.parseFloat(aetText218.getText().toString());
                        float w218 = (float) num218;
                        textView218.setText(String.format(Locale.US, "%.0f", w218) + "");


                        TextView num_start1;
                        TextView num_rost1;
                        TextView num_finish1;
                        num_start1 = findViewById(R.id.textViewWir6);
                        num_rost1 = findViewById(R.id.textViewWir8);
                        num_finish1 = findViewById(R.id.textViewWir18);
                        float num_start = Float.parseFloat(num_start1.getText().toString());
                        float num_rost = Float.parseFloat(num_rost1.getText().toString());
                        float num_finish = Float.parseFloat(num_finish1.getText().toString());
                        float Ves_Tushki = (float) ((num_start+num_rost+num_finish)*0.07);

                        TextView textView2081 = (TextView) findViewById(R.id.textViewWir15);
                        textView2081.setText(String.format(Locale.US, "%.2f", Ves_Tushki) + "");

                        Animation anim218 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button218 = (Button) findViewById(R.id.button218);
                        button218.startAnimation(anim218);
                        break;


                    case R.id.button219:
                        TextView textView219 = (TextView) findViewById(R.id.textViewWir6);
                        aetText219 = (Button) findViewById(R.id.button219);
                        float num219 = Float.parseFloat(aetText219.getText().toString());
                        float w219 = (float) num219;
                        textView219.setText(String.format(Locale.US, "%.0f", w219) + "");
                        Animation anim219 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button219 = (Button) findViewById(R.id.button219);
                        button219.startAnimation(anim219);


                        TextView num_start11;
                        TextView num_rost11;
                        TextView num_finish11;
                        num_start11 = findViewById(R.id.textViewWir6);
                        num_rost11 = findViewById(R.id.textViewWir8);
                        num_finish11 = findViewById(R.id.textViewWir18);
                        float num_start001 = Float.parseFloat(num_start11.getText().toString());
                        float num_rost002 = Float.parseFloat(num_rost11.getText().toString());
                        float num_finish003 = Float.parseFloat(num_finish11.getText().toString());
                        float Ves_Tushki004 = (float) ((num_start001+num_rost002+num_finish003)*0.07);

                        TextView textView2082 = (TextView) findViewById(R.id.textViewWir15);
                        textView2082.setText(String.format(Locale.US, "%.2f", Ves_Tushki004) + "");
                        break;


                    case R.id.button220:
                        TextView textView220 = (TextView) findViewById(R.id.textViewWir6);
                        aetText220 = (Button) findViewById(R.id.button220);
                        float num220 = Float.parseFloat(aetText220.getText().toString());
                        float w220 = (float) num220;
                        textView220.setText(String.format(Locale.US, "%.0f", w220) + "");
                        Animation anim220 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button220 = (Button) findViewById(R.id.button220);
                        button220.startAnimation(anim220);

                        TextView num_start112;
                        TextView num_rost112;
                        TextView num_finish112;
                        num_start112 = findViewById(R.id.textViewWir6);
                        num_rost112 = findViewById(R.id.textViewWir8);
                        num_finish112 = findViewById(R.id.textViewWir18);
                        float num_start0012 = Float.parseFloat(num_start112.getText().toString());
                        float num_rost0022 = Float.parseFloat(num_rost112.getText().toString());
                        float num_finish0032 = Float.parseFloat(num_finish112.getText().toString());
                        float Ves_Tushki0042 = (float) ((num_start0012+num_rost0022+num_finish0032)*0.07);

                        TextView textView20822 = (TextView) findViewById(R.id.textViewWir15);
                        textView20822.setText(String.format(Locale.US, "%.2f", Ves_Tushki0042) + "");
                        break;




                    case R.id.button221:
                        TextView textView221 = (TextView) findViewById(R.id.textViewWir6);
                        aetText221 = (Button) findViewById(R.id.button221);
                        float num221 = Float.parseFloat(aetText221.getText().toString());
                        float w221 = (float) num221;
                        textView221.setText(String.format(Locale.US, "%.0f", w221) + "");
                        Animation anim221 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button221 = (Button) findViewById(R.id.button221);
                        button221.startAnimation(anim221);

                        TextView num_start113;
                        TextView num_rost113;
                        TextView num_finish113;
                        num_start113 = findViewById(R.id.textViewWir6);
                        num_rost113 = findViewById(R.id.textViewWir8);
                        num_finish113 = findViewById(R.id.textViewWir18);
                        float num_start0013 = Float.parseFloat(num_start113.getText().toString());
                        float num_rost0023 = Float.parseFloat(num_rost113.getText().toString());
                        float num_finish0033 = Float.parseFloat(num_finish113.getText().toString());
                        float Ves_Tushki0043 = (float) ((num_start0013+num_rost0023+num_finish0033)*0.07);

                        TextView textView20823 = (TextView) findViewById(R.id.textViewWir15);
                        textView20823.setText(String.format(Locale.US, "%.2f", Ves_Tushki0043) + "");
                        break;




                    case R.id.button222:
                        TextView textView222 = (TextView) findViewById(R.id.textViewWir7);
                        aetText222 = (Button) findViewById(R.id.button222);
                        float num222 = Float.parseFloat(aetText222.getText().toString());
                        float w222 = (float) num222;
                        textView222.setText(String.format(Locale.US, "%.2f", w222) + "");
                        Animation anim222 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button222 = (Button) findViewById(R.id.button222);
                        button222.startAnimation(anim222);
                        break;


                    case R.id.button223:
                        TextView textView223 = (TextView) findViewById(R.id.textViewWir7);
                        aetText223 = (Button) findViewById(R.id.button223);
                        float num223 = Float.parseFloat(aetText223.getText().toString());
                        float w223 = (float) num223;
                        textView223.setText(String.format(Locale.US, "%.2f", w223) + "");
                        Animation anim223 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button223 = (Button) findViewById(R.id.button223);
                        button223.startAnimation(anim223);
                        break;


                    case R.id.button224:
                        TextView textView224 = (TextView) findViewById(R.id.textViewWir7);
                        aetText224 = (Button) findViewById(R.id.button224);
                        float num224 = Float.parseFloat(aetText224.getText().toString());
                        float w224 = (float) num224;
                        textView224.setText(String.format(Locale.US, "%.2f", w224) + "");
                        Animation anim224 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button224 = (Button) findViewById(R.id.button224);
                        button224.startAnimation(anim224);
                        break;


                    case R.id.button225:
                        TextView textView225 = (TextView) findViewById(R.id.textViewWir7);
                        aetText225 = (Button) findViewById(R.id.button225);
                        float num225 = Float.parseFloat(aetText225.getText().toString());
                        float w225 = (float) num225;
                        textView225.setText(String.format(Locale.US, "%.2f", w225) + "");
                        Animation anim225 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button225 = (Button) findViewById(R.id.button225);
                        button225.startAnimation(anim225);
                        break;


                    /*case R.id.button226:
                        TextView textView226 = (TextView) findViewById(R.id.textViewWir9);
                        aetText226 = (Button) findViewById(R.id.button226);
                        float num226 = Float.parseFloat(aetText226.getText().toString());
                        float w226 = (float) num226;
                        textView226.setText(String.format(Locale.US, "%.0f", w226) + "");
                        Animation anim226 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button226 = (Button) findViewById(R.id.button226);
                        button226.startAnimation(anim226);
                        break;


                    case R.id.button227:
                        TextView textView227 = (TextView) findViewById(R.id.textViewWir9);
                        aetText227 = (Button) findViewById(R.id.button227);
                        float num227 = Float.parseFloat(aetText227.getText().toString());
                        float w227 = (float) num227;
                        textView227.setText(String.format(Locale.US, "%.0f", w227) + "");
                        Animation anim227 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button227 = (Button) findViewById(R.id.button227);
                        button227.startAnimation(anim227);
                        break;


                    case R.id.button228:
                        TextView textView228 = (TextView) findViewById(R.id.textViewWir9);
                        aetText228 = (Button) findViewById(R.id.button228);
                        float num228 = Float.parseFloat(aetText228.getText().toString());
                        float w228 = (float) num228;
                        textView228.setText(String.format(Locale.US, "%.0f", w228) + "");
                        Animation anim228 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button228 = (Button) findViewById(R.id.button228);
                        button228.startAnimation(anim228);
                        break;


                    case R.id.button229:
                        TextView textView229 = (TextView) findViewById(R.id.textViewWir9);
                        aetText229 = (Button) findViewById(R.id.button229);
                        float num229 = Float.parseFloat(aetText229.getText().toString());
                        float w229 = (float) num229;
                        textView229.setText(String.format(Locale.US, "%.0f", w229) + "");
                        Animation anim229 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button229 = (Button) findViewById(R.id.button229);
                        button229.startAnimation(anim229);
                        break;
                        */


                    case R.id.button230:
                        TextView textView230 = (TextView) findViewById(R.id.textViewWir10);
                        aetText230 = (Button) findViewById(R.id.button230);
                        float num230 = Float.parseFloat(aetText230.getText().toString());
                        float w230 = (float) num230;
                        textView230.setText(String.format(Locale.US, "%.2f", w230) + "");
                        Animation anim230 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button230 = (Button) findViewById(R.id.button230);
                        button230.startAnimation(anim230);
                        break;

                    case R.id.button231:
                        TextView textView231 = (TextView) findViewById(R.id.textViewWir10);
                        aetText231 = (Button) findViewById(R.id.button231);
                        float num231 = Float.parseFloat(aetText231.getText().toString());
                        float w231 = (float) num231;
                        textView231.setText(String.format(Locale.US, "%.2f", w231) + "");
                        Animation anim231 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button231 = (Button) findViewById(R.id.button231);
                        button231.startAnimation(anim231);
                        break;



                    case R.id.button232:
                        TextView textView232 = (TextView) findViewById(R.id.textViewWir10);
                        aetText232 = (Button) findViewById(R.id.button232);
                        float num232 = Float.parseFloat(aetText232.getText().toString());
                        float w232 = (float) num232;
                        textView232.setText(String.format(Locale.US, "%.2f", w232) + "");
                        Animation anim232 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button232 = (Button) findViewById(R.id.button232);
                        button232.startAnimation(anim232);
                        break;


                    case R.id.button233:
                        TextView textView233 = (TextView) findViewById(R.id.textViewWir10);
                        aetText233 = (Button) findViewById(R.id.button233);
                        float num233 = Float.parseFloat(aetText233.getText().toString());
                        float w233 = (float) num233;
                        textView233.setText(String.format(Locale.US, "%.2f", w233) + "");
                        Animation anim233 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button233 = (Button) findViewById(R.id.button233);
                        button233.startAnimation(anim233);
                        break;


                    case R.id.button234:
                        TextView textView234 = (TextView) findViewById(R.id.textViewWir14);
                        aetText234 = (Button) findViewById(R.id.button234);
                        float num234 = Float.parseFloat(aetText234.getText().toString());
                        float w234 = (float) num234;
                        textView234.setText(String.format(Locale.US, "%.0f", w234) + "");
                        Animation anim234 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button234 = (Button) findViewById(R.id.button234);
                        button234.startAnimation(anim234);
                        break;


                    case R.id.button235:
                        TextView textView235 = (TextView) findViewById(R.id.textViewWir14);
                        aetText235 = (Button) findViewById(R.id.button235);
                        float num235 = Float.parseFloat(aetText235.getText().toString());
                        float w235 = (float) num235;
                        textView235.setText(String.format(Locale.US, "%.0f", w235) + "");
                        Animation anim235 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button235 = (Button) findViewById(R.id.button235);
                        button235.startAnimation(anim235);
                        break;


                    case R.id.button236:
                        TextView textView236 = (TextView) findViewById(R.id.textViewWir14);
                        aetText236 = (Button) findViewById(R.id.button236);
                        float num236 = Float.parseFloat(aetText236.getText().toString());
                        float w236 = (float) num236;
                        textView236.setText(String.format(Locale.US, "%.0f", w236) + "");
                        Animation anim236 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button236 = (Button) findViewById(R.id.button236);
                        button236.startAnimation(anim236);
                        break;


                    case R.id.button237:
                        TextView textView237 = (TextView) findViewById(R.id.textViewWir16);
                        aetText237 = (Button) findViewById(R.id.button237);
                        float num237 = Float.parseFloat(aetText237.getText().toString());
                        float w237 = (float) num237;
                        textView237.setText(String.format(Locale.US, "%.0f", w237) + "");
                        Animation anim237 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button237 = (Button) findViewById(R.id.button237);
                        button237.startAnimation(anim237);
                        break;


                    case R.id.button238:
                        TextView textView238 = (TextView) findViewById(R.id.textViewWir16);
                        aetText238 = (Button) findViewById(R.id.button238);
                        float num238 = Float.parseFloat(aetText238.getText().toString());
                        float w238 = (float) num238;
                        textView238.setText(String.format(Locale.US, "%.0f", w238) + "");
                        Animation anim238 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button238 = (Button) findViewById(R.id.button238);
                        button238.startAnimation(anim238);
                        break;


                    case R.id.button239:
                        TextView textView239 = (TextView) findViewById(R.id.textViewWir16);
                        aetText239 = (Button) findViewById(R.id.button239);
                        float num239 = Float.parseFloat(aetText239.getText().toString());
                        float w239 = (float) num239;
                        textView239.setText(String.format(Locale.US, "%.0f", w239) + "");
                        Animation anim239 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button239 = (Button) findViewById(R.id.button239);
                        button239.startAnimation(anim239);
                        break;


                    case R.id.button240:
                        TextView textView240 = (TextView) findViewById(R.id.textViewWir16);
                        aetText240 = (Button) findViewById(R.id.button240);
                        float num240 = Float.parseFloat(aetText240.getText().toString());
                        float w240 = (float) num240;
                        textView240.setText(String.format(Locale.US, "%.0f", w240) + "");
                        Animation anim240 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button240 = (Button) findViewById(R.id.button240);
                        button240.startAnimation(anim240);
                        break;

                    case R.id.button241:
                        TextView textView241 = (TextView) findViewById(R.id.textViewWir16);
                        aetText241 = (Button) findViewById(R.id.button241);
                        float num241 = Float.parseFloat(aetText241.getText().toString());
                        float w241 = (float) num241;
                        textView241.setText(String.format(Locale.US, "%.0f", w241) + "");
                        Animation anim241 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button241 = (Button) findViewById(R.id.button241);
                        button241.startAnimation(anim241);
                        break;

                    case R.id.button242:
                        TextView textView242 = (TextView) findViewById(R.id.textViewWir16);
                        aetText242 = (Button) findViewById(R.id.button242);
                        float num242 = Float.parseFloat(aetText242.getText().toString());
                        float w242 = (float) num242;
                        textView242.setText(String.format(Locale.US, "%.0f", w242) + "");
                        Animation anim242 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button242 = (Button) findViewById(R.id.button242);
                        button242.startAnimation(anim242);
                        break;

                    case R.id.button243:
                        TextView textView243 = (TextView) findViewById(R.id.textViewWir17);
                        aetText243 = (Button) findViewById(R.id.button243);
                        float num243 = Float.parseFloat(aetText243.getText().toString());
                        float w243 = (float) num243;
                        textView243.setText(String.format(Locale.US, "%.2f", w243) + "");
                        Animation anim243 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button243 = (Button) findViewById(R.id.button243);
                        button243.startAnimation(anim243);
                        break;

                    case R.id.button244:
                        TextView textView244 = (TextView) findViewById(R.id.textViewWir17);
                        aetText244 = (Button) findViewById(R.id.button244);
                        float num244 = Float.parseFloat(aetText244.getText().toString());
                        float w244 = (float) num244;
                        textView244.setText(String.format(Locale.US, "%.2f", w244) + "");
                        Animation anim244 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button244 = (Button) findViewById(R.id.button244);
                        button244.startAnimation(anim244);
                        break;

                    case R.id.button245:
                        TextView textView245 = (TextView) findViewById(R.id.textViewWir17);
                        aetText245 = (Button) findViewById(R.id.button245);
                        float num245 = Float.parseFloat(aetText245.getText().toString());
                        float w245 = (float) num245;
                        textView245.setText(String.format(Locale.US, "%.2f", w245) + "");
                        Animation anim245 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button245 = (Button) findViewById(R.id.button245);
                        button245.startAnimation(anim245);
                        break;

                    case R.id.button246:
                        TextView textView246 = (TextView) findViewById(R.id.textViewWir17);
                        aetText246 = (Button) findViewById(R.id.button246);
                        float num246 = Float.parseFloat(aetText246.getText().toString());
                        float w246 = (float) num246;
                        textView246.setText(String.format(Locale.US, "%.2f", w246) + "");
                        Animation anim246 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button246 = (Button) findViewById(R.id.button246);
                        button246.startAnimation(anim246);
                        break;

                    case R.id.button247:
                        TextView textView247 = (TextView) findViewById(R.id.textViewWir17);
                        aetText247 = (Button) findViewById(R.id.button247);
                        float num247 = Float.parseFloat(aetText247.getText().toString());
                        float w247 = (float) num247;
                        textView247.setText(String.format(Locale.US, "%.2f", w247) + "");
                        Animation anim247 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button247 = (Button) findViewById(R.id.button247);
                        button247.startAnimation(anim247);
                        break;

                    case R.id.button248:
                        TextView textView248 = (TextView) findViewById(R.id.textViewWir17);
                        aetText248 = (Button) findViewById(R.id.button240);
                        float num248 = Float.parseFloat(aetText248.getText().toString());
                        float w248 = (float) num248;
                        textView248.setText(String.format(Locale.US, "%.2f", w248) + "");
                        Animation anim248 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button248 = (Button) findViewById(R.id.button248);
                        button248.startAnimation(anim248);
                        break;

                    case R.id.button257:
                        TextView textView257 = (TextView) findViewById(R.id.textViewWir18);
                        aetText257 = (Button) findViewById(R.id.button257);
                        float num257 = Float.parseFloat(aetText257.getText().toString());
                        float w257 = (float) num257;
                        textView257.setText(String.format(Locale.US, "%.0f", w257) + "");
                        Animation anim257 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button257 = (Button) findViewById(R.id.button257);
                        button257.startAnimation(anim257);
                        TextView num_start119;
                        TextView num_rost119;
                        TextView num_finish119;
                        num_start11 = findViewById(R.id.textViewWir6);
                        num_rost11 = findViewById(R.id.textViewWir8);
                        num_finish11 = findViewById(R.id.textViewWir18);
                        float num_start0019 = Float.parseFloat(num_start11.getText().toString());
                        float num_rost0029 = Float.parseFloat(num_rost11.getText().toString());
                        float num_finish0039 = Float.parseFloat(num_finish11.getText().toString());
                        float Ves_Tushki0049 = (float) ((num_start0019+num_rost0029+num_finish0039)*0.07);

                        TextView textView20829 = (TextView) findViewById(R.id.textViewWir15);
                        textView20829.setText(String.format(Locale.US, "%.2f", Ves_Tushki0049) + "");
                        break;


                    case R.id.button277:
                        TextView textView277 = (TextView) findViewById(R.id.textViewWir18);
                        aetText277 = (Button) findViewById(R.id.button277);
                        float num277 = Float.parseFloat(aetText277.getText().toString());
                        float w277 = (float) num277;
                        textView277.setText(String.format(Locale.US, "%.0f", w277) + "");
                        Animation anim277 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button277 = (Button) findViewById(R.id.button277);
                        button277.startAnimation(anim277);


                        TextView num_start118;
                        TextView num_rost118;
                        TextView num_finish118;
                        num_start11 = findViewById(R.id.textViewWir6);
                        num_rost11 = findViewById(R.id.textViewWir8);
                        num_finish11 = findViewById(R.id.textViewWir18);
                        float num_start0018 = Float.parseFloat(num_start11.getText().toString());
                        float num_rost0028 = Float.parseFloat(num_rost11.getText().toString());
                        float num_finish0038 = Float.parseFloat(num_finish11.getText().toString());
                        float Ves_Tushki0048 = (float) ((num_start0018+num_rost0028+num_finish0038)*0.07);

                        TextView textView20828 = (TextView) findViewById(R.id.textViewWir15);
                        textView20828.setText(String.format(Locale.US, "%.2f", Ves_Tushki0048) + "");
                        break;



                    case R.id.button197:
                        TextView textView197 = (TextView) findViewById(R.id.textViewWir18);
                        aetText197 = (Button) findViewById(R.id.button197);
                        float num197 = Float.parseFloat(aetText197.getText().toString());
                        float w197 = (float) num197;
                        textView197.setText(String.format(Locale.US, "%.0f", w197) + "");
                        Animation anim197 = AnimationUtils.loadAnimation(
                                getApplicationContext(), R.anim.sms_anim);
                        final Button button197 = (Button) findViewById(R.id.button197);
                        button197.startAnimation(anim197);

                        TextView num_start117;
                        TextView num_rost117;
                        TextView num_finish117;
                        num_start117 = findViewById(R.id.textViewWir6);
                        num_rost117 = findViewById(R.id.textViewWir8);
                        num_finish117 = findViewById(R.id.textViewWir18);
                        float num_start0017 = Float.parseFloat(num_start117.getText().toString());
                        float num_rost0027 = Float.parseFloat(num_rost117.getText().toString());
                        float num_finish0037 = Float.parseFloat(num_finish117.getText().toString());
                        float Ves_Tushki0047 = (float) ((num_start0017+num_rost0027+num_finish0037)*0.07);

                        TextView textView20827 = (TextView) findViewById(R.id.textViewWir15);
                        textView20827.setText(String.format(Locale.US, "%.2f", Ves_Tushki0047) + "");
                        break;






                    //endregion



                    //&&&&&&

                    default:
                }
            }}
        };

        //region секция (btn1.setOnClickListener(btnClk);)
        btn1.setOnClickListener(btnClk);
        btn2.setOnClickListener(btnClk);
        btn3.setOnClickListener(btnClk);
        btn4.setOnClickListener(btnClk);
        btn5.setOnClickListener(btnClk);
        btn6.setOnClickListener(btnClk);
        btn7.setOnClickListener(btnClk);
        btn8.setOnClickListener(btnClk);
        btn9.setOnClickListener(btnClk);
        btn10.setOnClickListener(btnClk);
        btn11.setOnClickListener(btnClk);



        btn23.setOnClickListener(btnClk);
        btn24.setOnClickListener(btnClk);
        btn25.setOnClickListener(btnClk);
        btn26.setOnClickListener(btnClk);
        btn27.setOnClickListener(btnClk);
        btn28.setOnClickListener(btnClk);
        btn29.setOnClickListener(btnClk);
        btn30.setOnClickListener(btnClk);
        btn31.setOnClickListener(btnClk);
        btn32.setOnClickListener(btnClk);
        btn33.setOnClickListener(btnClk);



        btn40.setOnClickListener(btnClk);
        btn41.setOnClickListener(btnClk);
        btn42.setOnClickListener(btnClk);
        btn43.setOnClickListener(btnClk);
        btn44.setOnClickListener(btnClk);
        btn45.setOnClickListener(btnClk);

        btn46.setOnClickListener(btnClk);
        btn47.setOnClickListener(btnClk);
        btn48.setOnClickListener(btnClk);
        btn49.setOnClickListener(btnClk);
        btn50.setOnClickListener(btnClk);
        btn51.setOnClickListener(btnClk);


        btn52.setOnClickListener(btnClk);
        btn53.setOnClickListener(btnClk);
        btn54.setOnClickListener(btnClk);
        btn55.setOnClickListener(btnClk);



/*        btn60.setOnClickListener(btnClk);
        btn61.setOnClickListener(btnClk);
        btn62.setOnClickListener(btnClk);
        btn63.setOnClickListener(btnClk);
        btn64.setOnClickListener(btnClk);
        btn65.setOnClickListener(btnClk);*/

        btn66.setOnClickListener(btnClk);
        btn67.setOnClickListener(btnClk);
        btn68.setOnClickListener(btnClk);

//        btn69.setOnClickListener(btnClk);
//        btn70.setOnClickListener(btnClk);
//        btn71.setOnClickListener(btnClk);

//        btn72.setOnClickListener(btnClk);


//        btn73.setOnClickListener(btnClk);
//        btn74.setOnClickListener(btnClk);

//        btn75.setOnClickListener(btnClk);
        // btn76.setOnClickListener(btnClk);




        btn79.setOnClickListener(btnClk);
        btn80.setOnClickListener(btnClk);
        btn81.setOnClickListener(btnClk);
        btn82.setOnClickListener(btnClk);


        btn83.setOnClickListener(btnClk);
        btn84.setOnClickListener(btnClk);

        btn201.setOnClickListener(btnClk);
        btn202.setOnClickListener(btnClk);
        btn203.setOnClickListener(btnClk);
        btn204.setOnClickListener(btnClk);
        btn205.setOnClickListener(btnClk);
        btn206.setOnClickListener(btnClk);
        btn207.setOnClickListener(btnClk);
        btn208.setOnClickListener(btnClk);
        btn209.setOnClickListener(btnClk);
        btn210.setOnClickListener(btnClk);
        btn211.setOnClickListener(btnClk);
        btn212.setOnClickListener(btnClk);
        btn213.setOnClickListener(btnClk);
        btn214.setOnClickListener(btnClk);
        btn215.setOnClickListener(btnClk);
        btn216.setOnClickListener(btnClk);
        btn217.setOnClickListener(btnClk);
        btn218.setOnClickListener(btnClk);
        btn219.setOnClickListener(btnClk);
        btn220.setOnClickListener(btnClk);
        btn221.setOnClickListener(btnClk);
        btn222.setOnClickListener(btnClk);
        btn223.setOnClickListener(btnClk);
        btn224.setOnClickListener(btnClk);
        btn225.setOnClickListener(btnClk);
//        btn226.setOnClickListener(btnClk);
     //   btn227.setOnClickListener(btnClk);
     //   btn228.setOnClickListener(btnClk);
    //    btn229.setOnClickListener(btnClk);
        btn230.setOnClickListener(btnClk);
        btn231.setOnClickListener(btnClk);
        btn232.setOnClickListener(btnClk);
        btn233.setOnClickListener(btnClk);
        btn234.setOnClickListener(btnClk);
        btn235.setOnClickListener(btnClk);
        btn236.setOnClickListener(btnClk);
        btn237.setOnClickListener(btnClk);
        btn238.setOnClickListener(btnClk);
        btn239.setOnClickListener(btnClk);
        btn240.setOnClickListener(btnClk);
        btn241.setOnClickListener(btnClk);
        btn242.setOnClickListener(btnClk);
        btn243.setOnClickListener(btnClk);
        btn244.setOnClickListener(btnClk);
        btn245.setOnClickListener(btnClk);
        btn246.setOnClickListener(btnClk);
        btn247.setOnClickListener(btnClk);
        btn248.setOnClickListener(btnClk);

        btn197.setOnClickListener(btnClk);
        btn277.setOnClickListener(btnClk);
        btn257.setOnClickListener(btnClk);



        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // setSupportActionBar(toolbar);





        FloatingActionButton fab2 = (FloatingActionButton) findViewById(R.id.fab);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Animation anim1 = AnimationUtils.loadAnimation(
                        getApplicationContext(), R.anim.sms_anim2);
                final FloatingActionButton button1111 = (FloatingActionButton) findViewById(R.id.fab);
                button1111.startAnimation(anim1);

                TextView aetText1;
                TextView aetText2;
                TextView aetText3;
                TextView aetText4;
                TextView aetText5;
                TextView aetText6;

                TextView aetText7;
                TextView aetText8;
                TextView aetText9;
                TextView aetText10;
                TextView aetText11;
                TextView aetText12;
                TextView aetText13;
                TextView aetText14;
                TextView aetText15;
                TextView aetText16;
                TextView aetText17;




                // Стороны:

                // A
                aetText1 = (TextView) findViewById(R.id.textViewWir);
                aetText2 = (TextView) findViewById(R.id.textViewWir2);

                // B
                aetText3 = (TextView) findViewById(R.id.textViewWir3);
                aetText4 = (TextView) findViewById(R.id.textViewWir4);

                // площадь оконных или дверных проемов
                aetText5 = (TextView) findViewById(R.id.textViewWir5);

                // цена кирпича
                aetText6 = (TextView) findViewById(R.id.textViewWir6);

                // диаметр арматуры
                aetText7 = (TextView) findViewById(R.id.textViewWir7);
                aetText8 = (TextView) findViewById(R.id.textViewWir8);

                // шаг укладки арматуры
               // aetText9 = (TextView) findViewById(R.id.textViewWir9);

                // стоимость арматуры
                aetText10 = (TextView) findViewById(R.id.textViewWir10);

                // тип кладки
                aetText11 = (TextView) findViewById(R.id.textViewWir11);

                // толщина слоя раствора
              //  aetText12 = (TextView) findViewById(R.id.textViewWir12);

                aetText13 = (TextView) findViewById(R.id.textViewWir13);
                aetText14 = (TextView) findViewById(R.id.textViewWir14);
                aetText15 = (TextView) findViewById(R.id.textViewWir15);
                aetText16 = (TextView) findViewById(R.id.textViewWir16);
                aetText17 = (TextView) findViewById(R.id.textViewWir17);
                aetText18 = (TextView) findViewById(R.id.textViewWir18);

                float num001 = Float.parseFloat(aetText1.getText().toString());
                float num002 = Float.parseFloat(aetText2.getText().toString());
                float num003 = Float.parseFloat(aetText3.getText().toString());
                float num004 = Float.parseFloat(aetText4.getText().toString());
                float num005 = Float.parseFloat(aetText5.getText().toString());
                float num006 = Float.parseFloat(aetText6.getText().toString());
                float num007 = Float.parseFloat(aetText7.getText().toString());
                float num008 = Float.parseFloat(aetText8.getText().toString());
//                float num009 = Float.parseFloat(aetText9.getText().toString());
                float num010 = Float.parseFloat(aetText10.getText().toString());
                float num011 = Float.parseFloat(aetText11.getText().toString());
//                float num012 = Float.parseFloat(aetText12.getText().toString());
                float num013 = Float.parseFloat(aetText13.getText().toString());
                float num014 = Float.parseFloat(aetText14.getText().toString());
                float num015 = Float.parseFloat(aetText15.getText().toString());
                float num016 = Float.parseFloat(aetText16.getText().toString());
                float num017 = Float.parseFloat(aetText17.getText().toString());
                float num018 = Float.parseFloat(aetText18.getText().toString());


                //количество необходимого кирпича


                float Kolishestvo_padega = (num001*num005)/100;
                float Kolishestvo_wtuk = (num001-Kolishestvo_padega);


                //float Koeficient_rasxoda_na_opred_den = (float) (num006*0.00441);
                //4.41 - коэфициент (подобран расчотом)
                float Start_na_odnogo_br = (float) (num006*0.0477);
                // num006 - 19,20,21,22
                float Start_na_vsex = (float) (Start_na_odnogo_br*Kolishestvo_wtuk);
                float Stoimost_starta = (Start_na_vsex*num011);


                float Rost_na_odnogo_br = (float) ((num008)*0.133);
                // num008 - 34,35,36,37
                float Rost_na_vsex = (float) (Rost_na_odnogo_br*Kolishestvo_wtuk);
                float Stoimost_rosta = (Rost_na_vsex*num007);


                float Finish_na_odnogo_br = (float) ((num018)*0.207);
                // num008 - 40,41,42,43
                float Finish_na_vsex = (float) (Finish_na_odnogo_br*Kolishestvo_wtuk);
                float Stoimost_finiwa = (Finish_na_vsex*num010);


                                float Stoimost_korma = (Stoimost_starta+Stoimost_rosta+Stoimost_finiwa);
                                float Drugie_Rasxodi = ((num002*num001)+num003+num004+num013+num014);
                                float Otxodi_potroxa = ((Kolishestvo_wtuk*num015)*num016)/100;
                                float Pribil_brutto = (((Kolishestvo_wtuk*num015)-Otxodi_potroxa)*num017);

                                //num017 - цена
                                //num015 - вес
                                float Myasa = (((Kolishestvo_wtuk*num015)-Otxodi_potroxa));
                                float Myasa_wtuka = Myasa/Kolishestvo_wtuk;
                                float Pribil_netto = (Pribil_brutto -(Stoimost_korma+Drugie_Rasxodi));
                                float Pribil_s_odnogo_br = (Pribil_netto/Kolishestvo_wtuk);


                                float Vsego_korma_kg_na_od_br = (Start_na_odnogo_br+Rost_na_odnogo_br+Finish_na_odnogo_br);
                                float Vsego_korma_kg_na_vsex = (Vsego_korma_kg_na_od_br*Kolishestvo_wtuk);

                                float Rasxod_korma_na_od_br = (Vsego_korma_kg_na_vsex)/Kolishestvo_wtuk;
                                float Vsego_dney = num006+num008+num018;

                                float Doxod_za_den = Pribil_netto/Vsego_dney;


                                TextView textView142 = (TextView) findViewById(R.id.textView142);
                                TextView textView1420 = (TextView) findViewById(R.id.textView301);
                                TextView textView1421 = (TextView) findViewById(R.id.textView201);
                                TextView textView14212 = (TextView) findViewById(R.id.textView401);
                                TextView textView14213 = (TextView) findViewById(R.id.textView4);
                              //  TextView textView14214 = (TextView) findViewById(R.id.textView20);
                                TextView textView14215 = (TextView) findViewById(R.id.textView242);
                              //  TextView textView14216 = (TextView) findViewById(R.id.textView24);
                                //TextView textView2017 = (TextView) findViewById(R.id.textView201);
                                TextView textView208 = (TextView) findViewById(R.id.textView208);
                                TextView textView6000 = (TextView) findViewById(R.id.textView6000);
                                TextView textView2011 = (TextView) findViewById(R.id.textView2011);
                                TextView textView2022 = (TextView) findViewById(R.id.textView2022);

                                textView142.setText(String.format(Locale.US, "%.0f", Pribil_netto) + "");
                                textView1420.setText(String.format(Locale.US, "%.0f", Kolishestvo_wtuk) + "");
                                textView1421.setText(String.format(Locale.US, "%.0f", Pribil_s_odnogo_br) + "");
                                textView14212.setText(String.format(Locale.US, "%.0f", Vsego_dney) + "");
                                textView14213.setText(String.format(Locale.US, "%.0f", Stoimost_korma) + "");
                                //textView14214.setText(String.format(Locale.US, "%.2f", Bez_korobki) + "");
                                textView14215.setText(String.format(Locale.US, "%.0f", Drugie_Rasxodi) + "");
                               // textView14216.setText(String.format(Locale.US, "%.2f", Gofra) + "");
                               // textView2017.setText(String.format(Locale.US, "%.2f", rabota) + "");
                                textView208.setText(String.format(Locale.US, "%.0f", Rasxod_korma_na_od_br) + "");
                                textView6000.setText(String.format(Locale.US, "%.0f", Doxod_za_den) + "");
                                textView2011.setText(String.format(Locale.US, "%.0f", Myasa) + "");
                                textView2022.setText(String.format(Locale.US, "%.2f", Myasa_wtuka) + "");


                                //Snackbar.make(view, "Подсчитано", Snackbar.LENGTH_SHORT)
                                //Snackbar.make(view, "Подсчитано", Snackbar.LENGTH_SHORT)
                                // .setAction("Action", null).show();
                            }
                        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                final TextView bill83 = (TextView) findViewById(R.id.textView142);
                final TextView bill84 = (TextView) findViewById(R.id.textView201);
                final TextView bill85 = (TextView) findViewById(R.id.textView242);
                //final TextView bill86 = (TextView) findViewById(R.id.textView20);
              //  final TextView bill87 = (TextView) findViewById(R.id.textView24);
                final TextView bill88 = (TextView) findViewById(R.id.textView301);
                final TextView bill89 = (TextView) findViewById(R.id.textView401);
                final TextView bill90 = (TextView) findViewById(R.id.textView4);
                final TextView bill208 = (TextView) findViewById(R.id.textView208);


                bill83.setText(00.00 + "");
                bill84.setText(00.00 + "");
                bill85.setText(00.00 + "");
                //bill86.setText(00.00 + "");
               // bill87.setText(00.00 + "");
                bill88.setText(00.00 + "");
                bill89.setText(00.00 + "");
                bill90.setText(00.00 + "");
                bill208.setText(00.00 + "");

               Toast toast = Toast.makeText(getApplicationContext(),
                        "Сброс", Toast.LENGTH_SHORT);

                toast.show();

                return true;
            }


            //Snackbar.make(view, "Подсчитано", Snackbar.LENGTH_SHORT)
            //Snackbar.make(view, "Подсчитано", Snackbar.LENGTH_SHORT)
            // .setAction("Action", null).show();

        });

    }



/*

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {



            //Do something
            return true;
        } else if (id == R.id.action_settings2) {

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("market://details?id=com.betonirlite.nikolay.betonir"));
            startActivity(intent);

            //Do something
            return true;
        } else if (id == R.id.action_settings3) {

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.youtube.com/channel/UCevOw6a0SiaFm-TGHcogQEg"));
            startActivity(intent);

            //Do something
            return true;
        } else if (id == R.id.action_settings2) {


            //Do something
        }

        return super.onOptionsItemSelected(item);
    }
*/


    //region сохранение данных
    void saveText() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT, etText.getText().toString());
        ed.commit();
        //Toast.makeText(this, "Text saved", Toast.LENGTH_SHORT).show();
    }

    void loadText() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT, "");
        etText.setText(savedText);
        //  Toast.makeText(this, "Text loaded", Toast.LENGTH_SHORT).show();
    }

    void saveText2() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT2, etText2.getText().toString());
        ed.commit();
    }
    void loadText2() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT2, "");
        etText2.setText(savedText);
    }
    void saveText3() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT3, etText3.getText().toString());
        ed.commit();
    }
    void loadText3() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT3, "");
        etText3.setText(savedText);
    }
    void saveText4() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT4, etText4.getText().toString());
        ed.commit();
    }
    void loadText4() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT4, "");
        etText4.setText(savedText);
    }
    void saveText5() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT5, etText5.getText().toString());
        ed.commit();
    }
    void loadText5() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT5, "");
        etText5.setText(savedText);
    }
    void saveText6() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT6, etText6.getText().toString());
        ed.commit();
    }
    void loadText6() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT6, "");
        etText6.setText(savedText);
    }
    void saveText7() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT7, etText7.getText().toString());
        ed.commit();
    }
    void loadText7() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT7, "");
        etText7.setText(savedText);
    }
    void saveText8() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT8, etText8.getText().toString());
        ed.commit();
    }
    void loadText8() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT8, "");
        etText8.setText(savedText);
    }
    void saveText9() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT9, etText9.getText().toString());
        ed.commit();
    }
    void loadText9() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT9, "");
        etText9.setText(savedText);
    }
    void saveText10() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT10, etText10.getText().toString());
        ed.commit();
    }
    void loadText10() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT10, "");
        etText10.setText(savedText);
    }
    void saveText11() {
        sPref2 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref2.edit();
        ed.putString(SAVED_TEXT11, etText11.getText().toString());
        ed.commit();
    }
    void loadText11() {
        sPref2 = getPreferences(MODE_PRIVATE);
        String savedText = sPref2.getString(SAVED_TEXT11, "");
        etText11.setText(savedText);
    }


    void saveText12() {
        sPref2 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref2.edit();
        ed.putString(SAVED_TEXT12, etText12.getText().toString());
        ed.commit();
    }
    void loadText12() {
        sPref2 = getPreferences(MODE_PRIVATE);
        String savedText = sPref2.getString(SAVED_TEXT12, "");
        etText12.setText(savedText);
    }
    void saveText13() {
        sPref2 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref2.edit();
        ed.putString(SAVED_TEXT13, etText13.getText().toString());
        ed.commit();
    }
    void loadText13() {
        sPref2 = getPreferences(MODE_PRIVATE);
        String savedText = sPref2.getString(SAVED_TEXT13, "");
        etText13.setText(savedText);
    }


    void saveText23() {
        sPref3 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref3.edit();
        ed.putString(SAVED_TEXT23, etText23.getText().toString());
        ed.commit();
        // Toast.makeText(this, "Text saved", Toast.LENGTH_SHORT).show();
    }

    void loadText23() {
        sPref3 = getPreferences(MODE_PRIVATE);
        String savedText = sPref3.getString(SAVED_TEXT23, "");
        etText23.setText(savedText);
        // Toast.makeText(this, "Text loaded", Toast.LENGTH_SHORT).show();
    }

    void saveText24() {
        sPref2 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref2.edit();
        ed.putString(SAVED_TEXT24, etText24.getText().toString());
        ed.commit();
        // Toast.makeText(this, "Text saved", Toast.LENGTH_SHORT).show();
    }

    void loadText24() {
        sPref2 = getPreferences(MODE_PRIVATE);
        String savedText = sPref2.getString(SAVED_TEXT24, "");
        etText24.setText(savedText);
        // Toast.makeText(this, "Text loaded", Toast.LENGTH_SHORT).show();
    }

    void saveText25() {
        sPref3 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref3.edit();
        ed.putString(SAVED_TEXT25, etText25.getText().toString());
        ed.commit();
    }
    void loadText25() {
        sPref3 = getPreferences(MODE_PRIVATE);
        String savedText = sPref3.getString(SAVED_TEXT25, "");
        etText25.setText(savedText);
    }
    void saveText26() {
        sPref3 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref3.edit();
        ed.putString(SAVED_TEXT26, etText26.getText().toString());
        ed.commit();
    }
    void loadText26() {
        sPref3 = getPreferences(MODE_PRIVATE);
        String savedText = sPref3.getString(SAVED_TEXT26, "");
        etText26.setText(savedText);
    }
    void saveText27() {
        sPref3 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref3.edit();
        ed.putString(SAVED_TEXT27, etText27.getText().toString());
        ed.commit();
    }
    void loadText27() {
        sPref3 = getPreferences(MODE_PRIVATE);
        String savedText = sPref3.getString(SAVED_TEXT27, "");
        etText27.setText(savedText);
    }
    void saveText28() {
        sPref3 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref3.edit();
        ed.putString(SAVED_TEXT28, etText28.getText().toString());
        ed.commit();
    }
    void loadText28() {
        sPref3 = getPreferences(MODE_PRIVATE);
        String savedText = sPref3.getString(SAVED_TEXT28, "");
        etText28.setText(savedText);
    }
    void saveText29() {
        sPref3 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref3.edit();
        ed.putString(SAVED_TEXT29, etText29.getText().toString());
        ed.commit();
    }
    void loadText29() {
        sPref3 = getPreferences(MODE_PRIVATE);
        String savedText = sPref3.getString(SAVED_TEXT29, "");
        etText29.setText(savedText);
    }
    void saveText30() {
        sPref3 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref3.edit();
        ed.putString(SAVED_TEXT30, etText30.getText().toString());
        ed.commit();
    }
    void loadText30() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT30, "");
        etText30.setText(savedText);
    }
    void saveText31() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT31, etText31.getText().toString());
        ed.commit();
    }
    void loadText31() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT31, "");
        etText31.setText(savedText);
    }
    void saveText32() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT32, etText32.getText().toString());
        ed.commit();
    }
    void loadText32() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT32, "");
        etText32.setText(savedText);
    }
    void saveText33() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT33, etText33.getText().toString());
        ed.commit();
    }
    void loadText33() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT33, "");
        etText33.setText(savedText);
    }

    void saveText40() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT40, etText40.getText().toString());
        ed.commit();
    }
    void loadText40() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT40, "");
        etText40.setText(savedText);
    }
    void saveText41() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT41, etText41.getText().toString());
        ed.commit();
    }
    void loadText41() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT41, "");
        etText41.setText(savedText);
    }
    void saveText42() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT42, etText42.getText().toString());
        ed.commit();
    }
    void loadText42() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT42, "");
        etText42.setText(savedText);
    }
    void saveText43() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT43, etText43.getText().toString());
        ed.commit();
    }
    void loadText43() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT43, "");
        etText43.setText(savedText);
    }
    void saveText44() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT44, etText44.getText().toString());
        ed.commit();
    }
    void loadText44() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT44, "");
        etText44.setText(savedText);
    }
    void saveText45() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT45, etText45.getText().toString());
        ed.commit();
    }
    void loadText45() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT45, "");
        etText45.setText(savedText);
    }
    void saveText46() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT46, etText46.getText().toString());
        ed.commit();
    }
    void loadText46() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT46, "");
        etText46.setText(savedText);
    }
    void saveText47() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT47, etText47.getText().toString());
        ed.commit();
    }
    void loadText47() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT47, "");
        etText47.setText(savedText);
    }
    void saveText48() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT48, etText48.getText().toString());
        ed.commit();
    }
    void loadText48() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT48, "");
        etText48.setText(savedText);
    }
    void saveText49() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT49, etText49.getText().toString());
        ed.commit();
    }
    void loadText49() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT49, "");
        etText49.setText(savedText);
    }
    void saveText50() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT50, etText50.getText().toString());
        ed.commit();
    }
    void loadText50() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT50, "");
        etText50.setText(savedText);
    }
    void saveText51() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT51, etText51.getText().toString());
        ed.commit();
    }
    void loadText51() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT51, "");
        etText51.setText(savedText);
    }

    //endregion

    void saveText52() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT52, etText52.getText().toString());
        ed.commit();
    }
    void loadText52() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT52, "");
        etText52.setText(savedText);
    }
    void saveText53() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT53, etText53.getText().toString());
        ed.commit();
    }
    void loadText53() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT53, "");
        etText53.setText(savedText);
    }
    void saveText54() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT54, etText54.getText().toString());
        ed.commit();
    }
    void loadText54() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT54, "");
        etText54.setText(savedText);
    }
    void saveText55() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT55, etText55.getText().toString());
        ed.commit();
    }
    void loadText55() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT55, "");
        etText55.setText(savedText);
    }


    /*void saveText60() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT60, etText60.getText().toString());
        ed.commit();
    }
    void loadText60() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT60, "");
        etText60.setText(savedText);
    }
    void saveText61() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT61, etText61.getText().toString());
        ed.commit();
    }
    void loadText61() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT61, "");
        etText61.setText(savedText);
    }

    void saveText62() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT62, etText62.getText().toString());
        ed.commit();
    }
    void loadText62() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT62, "");
        etText62.setText(savedText);
    }
    void saveText63() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT63, etText63.getText().toString());
        ed.commit();
    }
    void loadText63() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT63, "");
        etText63.setText(savedText);
    }
    void saveText64() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT64, etText64.getText().toString());
        ed.commit();
    }
    void loadText64() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT64, "");
        etText64.setText(savedText);
    }
    void saveText65() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT65, etText65.getText().toString());
        ed.commit();
    }
    void loadText65() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT65, "");
        etText65.setText(savedText);
    }*/
    void saveText66() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT66, etText66.getText().toString());
        ed.commit();
    }
    void loadText66() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT66, "");
        etText66.setText(savedText);
    }
    void saveText67() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT67, etText67.getText().toString());
        ed.commit();
    }
    void loadText67() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT67, "");
        etText67.setText(savedText);
    }
    void saveText68() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT68, etText68.getText().toString());
        ed.commit();
    }
    void loadText68() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT68, "");
        etText68.setText(savedText);
    }


    void saveText69() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT69, etText69.getText().toString());
        ed.commit();
    }




    void saveText73() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT73, etText73.getText().toString());
        ed.commit();
    }
    void loadText73() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT73, "");
        etText73.setText(savedText);
    }
    void saveText74() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT74, etText74.getText().toString());
        ed.commit();
    }
    void loadText74() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT74, "");
        etText74.setText(savedText);
    }


    void saveText79() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT79, etText79.getText().toString());
        ed.commit();
    }
    void loadText79() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT79, "");
        etText79.setText(savedText);
    }
    void saveText80() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT80, etText80.getText().toString());
        ed.commit();
    }
    void loadText80() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT80, "");
        etText80.setText(savedText);
    }
    void saveText81() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT81, etText81.getText().toString());
        ed.commit();
    }
    void loadText81() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT81, "");
        etText81.setText(savedText);
    }
    void saveText82() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT82, etText82.getText().toString());
        ed.commit();
    }
    void loadText82() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT82, "");
        etText82.setText(savedText);
    }

    // сохранение данных
   /* void saveText83() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT83, etText83.getText().toString());
        ed.commit();
    }
    void loadText83() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT83, "");
        etText83.setText(savedText);
    }
    void saveText84() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT84, etText84.getText().toString());
        ed.commit();
    }
    void loadText84() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT84, "");
        etText84.setText(savedText);
    }

    void saveText86() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT86, etText86.getText().toString());
        ed.commit();
    }
    void loadText86() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT86, "");
        etText86.setText(savedText);
    }*/


    void saveText201() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT201, etText201.getText().toString());
        ed.commit();
    }
    void loadText201() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT201, "");
        etText201.setText(savedText);
    }

    void saveText202() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT202, etText202.getText().toString());
        ed.commit();
    }
    void loadText202() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT202, "");
        etText202.setText(savedText);
    }

    void saveText203() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT203, etText203.getText().toString());
        ed.commit();
    }
    void loadText203() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT203, "");
        etText203.setText(savedText);
    }

    void saveText204() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT204, etText204.getText().toString());
        ed.commit();
    }
    void loadText204() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT204, "");
        etText204.setText(savedText);
    }

    void saveText205() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT205, etText205.getText().toString());
        ed.commit();
    }
    void loadText205() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT205, "");
        etText205.setText(savedText);
    }

    void saveText206() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT206, etText206.getText().toString());
        ed.commit();
    }
    void loadText206() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT206, "");
        etText206.setText(savedText);
    }

    void saveText207() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT207, etText207.getText().toString());
        ed.commit();
    }
    void loadText207() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT207, "");
        etText207.setText(savedText);
    }

    void saveText208() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT208, etText208.getText().toString());
        ed.commit();
    }
    void loadText208() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT208, "");
        etText208.setText(savedText);
    }

    void saveText209() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT209, etText209.getText().toString());
        ed.commit();
    }
    void loadText209() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT209, "");
        etText209.setText(savedText);
    }

    void saveText210() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT210, etText210.getText().toString());
        ed.commit();
    }
    void loadText210() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT210, "");
        etText210.setText(savedText);
    }
    void saveText211() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT211, etText211.getText().toString());
        ed.commit();
    }
    void loadText211() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT211, "");
        etText211.setText(savedText);
    }

    void saveText212() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT212, etText212.getText().toString());
        ed.commit();
    }
    void loadText212() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT212, "");
        etText212.setText(savedText);
    }
    void saveText213() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT213, etText213.getText().toString());
        ed.commit();
    }
    void loadText213() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT213, "");
        etText213.setText(savedText);
    }

    void saveText214() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT214, etText214.getText().toString());
        ed.commit();
    }
    void loadText214() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT214, "");
        etText214.setText(savedText);
    }

    void saveText215() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT215, etText215.getText().toString());
        ed.commit();
    }
    void loadText215() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT215, "");
        etText215.setText(savedText);
    }

    void saveText216() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT216, etText216.getText().toString());
        ed.commit();
    }
    void loadText216() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT216, "");
        etText216.setText(savedText);
    }

    void saveText217() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT217, etText217.getText().toString());
        ed.commit();
    }
    void loadText217() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT217, "");
        etText217.setText(savedText);
    }

    void saveText218() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT218, etText218.getText().toString());
        ed.commit();
    }
    void loadText218() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT218, "");
        etText218.setText(savedText);
    }

    void saveText219() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT219, etText219.getText().toString());
        ed.commit();
    }
    void loadText219() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT219, "");
        etText219.setText(savedText);
    }

    void saveText220() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT220, etText220.getText().toString());
        ed.commit();
    }
    void loadText220() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT220, "");
        etText220.setText(savedText);
    }
    void saveText221() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT221, etText221.getText().toString());
        ed.commit();
    }
    void loadText221() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT221, "");
        etText221.setText(savedText);
    }
    void saveText222() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT222, etText222.getText().toString());
        ed.commit();
    }
    void loadText222() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT222, "");
        etText222.setText(savedText);
    }
    void saveText223() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT223, etText223.getText().toString());
        ed.commit();
    }
    void loadText223() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT223, "");
        etText223.setText(savedText);
    }
    void saveText224() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT224, etText224.getText().toString());
        ed.commit();
    }
    void loadText224() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT224, "");
        etText224.setText(savedText);
    }
    void saveText225() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT225, etText225.getText().toString());
        ed.commit();
    }
    void loadText225() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT225, "");
        etText225.setText(savedText);
    }
    /*void saveText226() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT226, etText226.getText().toString());
        ed.commit();
    }
    void loadText226() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT226, "");
        etText226.setText(savedText);
    }
    void saveText227() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT227, etText227.getText().toString());
        ed.commit();
    }
    void loadText227() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT227, "");
        etText227.setText(savedText);
    }
    void saveText228() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT228, etText228.getText().toString());
        ed.commit();
    }
    void loadText228() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT228, "");
        etText228.setText(savedText);
    }
    void saveText229() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT229, etText229.getText().toString());
        ed.commit();
    }
    void loadText229() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT229, "");
        etText229.setText(savedText);
    }*/
    void saveText230() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT230, etText230.getText().toString());
        ed.commit();
    }
    void loadText230() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT230, "");
        etText230.setText(savedText);
    }

    void saveText231() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT231, etText231.getText().toString());
        ed.commit();
    }
    void loadText231() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT231, "");
        etText231.setText(savedText);
    }
    void saveText232() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT232, etText232.getText().toString());
        ed.commit();
    }
    void loadText232() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT232, "");
        etText232.setText(savedText);
    }
    void saveText233() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT233, etText233.getText().toString());
        ed.commit();
    }
    void loadText233() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT233, "");
        etText233.setText(savedText);
    }
    void saveText234() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT234, etText234.getText().toString());
        ed.commit();
    }
    void loadText234() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT234, "");
        etText234.setText(savedText);
    }
    void saveText235() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT235, etText235.getText().toString());
        ed.commit();
    }
    void loadText235() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT235, "");
        etText235.setText(savedText);
    }
    void saveText236() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT236, etText236.getText().toString());
        ed.commit();
    }
    void loadText236() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT236, "");
        etText236.setText(savedText);
    }
    void saveText237() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT237, etText237.getText().toString());
        ed.commit();
    }
    void loadText237() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT237, "");
        etText237.setText(savedText);
    }
    void saveText238() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT238, etText238.getText().toString());
        ed.commit();
    }
    void loadText238() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT238, "");
        etText238.setText(savedText);
    }
    void saveText239() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT239, etText239.getText().toString());
        ed.commit();
    }
    void loadText239() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT239, "");
        etText239.setText(savedText);
    }
    void saveText240() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT240, etText240.getText().toString());
        ed.commit();
    }
    void loadText240() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT240, "");
        etText240.setText(savedText);
    }
    void saveText241() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT241, etText241.getText().toString());
        ed.commit();
    }
    void loadText241() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT241, "");
        etText241.setText(savedText);
    }
    void saveText242() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT242, etText242.getText().toString());
        ed.commit();
    }
    void loadText242() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT242, "");
        etText242.setText(savedText);
    }
    void saveText243() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT243, etText243.getText().toString());
        ed.commit();
    }
    void loadText243() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT243, "");
        etText243.setText(savedText);
    }
    void saveText244() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT244, etText244.getText().toString());
        ed.commit();
    }
    void loadText244() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT244, "");
        etText244.setText(savedText);
    }
    void saveText245() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT245, etText245.getText().toString());
        ed.commit();
    }
    void loadText245() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT245, "");
        etText245.setText(savedText);
    }
    void saveText246() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT246, etText246.getText().toString());
        ed.commit();
    }
    void loadText246() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT246, "");
        etText246.setText(savedText);
    }
    void saveText247() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT247, etText247.getText().toString());
        ed.commit();
    }
    void loadText247() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT247, "");
        etText247.setText(savedText);
    }
    void saveText248() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT248, etText248.getText().toString());
        ed.commit();
    }
    void loadText248() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT248, "");
        etText248.setText(savedText);
    }


    void saveText301() {
        sPref3 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref3.edit();
        ed.putString(SAVED_TEXT301, etText301.getText().toString());
        ed.commit();
    }
    void loadText301() {
        sPref3 = getPreferences(MODE_PRIVATE);
        String savedText = sPref3.getString(SAVED_TEXT301, "");
        etText301.setText(savedText);
    }
    void saveText302() {
        sPref3 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref3.edit();
        ed.putString(SAVED_TEXT302, etText302.getText().toString());
        ed.commit();
    }
    void loadText302() {
        sPref3 = getPreferences(MODE_PRIVATE);
        String savedText = sPref3.getString(SAVED_TEXT302, "");
        etText302.setText(savedText);
    }

    void saveText303() {
        sPref3 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref3.edit();
        ed.putString(SAVED_TEXT303, etText303.getText().toString());
        ed.commit();
    }
    void loadText303() {
        sPref3 = getPreferences(MODE_PRIVATE);
        String savedText = sPref3.getString(SAVED_TEXT303, "");
        etText303.setText(savedText);
    }



    void saveText304() {
        sPref3 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref3.edit();
        ed.putString(SAVED_TEXT304, etText304.getText().toString());
        ed.commit();
    }
    void loadText304() {
        sPref3 = getPreferences(MODE_PRIVATE);
        String savedText = sPref3.getString(SAVED_TEXT304, "");
        etText304.setText(savedText);
    }

    void saveText197() {
        sPref3 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref3.edit();
        ed.putString(SAVED_TEXT197, etText197.getText().toString());
        ed.commit();
    }
    void loadText197() {
        sPref3 = getPreferences(MODE_PRIVATE);
        String savedText = sPref3.getString(SAVED_TEXT197, "");
        etText197.setText(savedText);
    }
    void saveText277() {
        sPref3 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref3.edit();
        ed.putString(SAVED_TEXT277, etText277.getText().toString());
        ed.commit();
    }
    void loadText277() {
        sPref3 = getPreferences(MODE_PRIVATE);
        String savedText = sPref3.getString(SAVED_TEXT277, "");
        etText277.setText(savedText);
    }
    void saveText257() {
        sPref3 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref3.edit();
        ed.putString(SAVED_TEXT257, etText257.getText().toString());
        ed.commit();
    }
    void loadText257() {
        sPref3 = getPreferences(MODE_PRIVATE);
        String savedText = sPref3.getString(SAVED_TEXT257, "");
        etText257.setText(savedText);
    }

    void saveText408() {
        sPref3 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref3.edit();
        ed.putString(SAVED_TEXT408, etText408.getText().toString());
        ed.commit();
    }
    void loadText408() {
        sPref3 = getPreferences(MODE_PRIVATE);
        String savedText = sPref3.getString(SAVED_TEXT408, "");
        etText408.setText(savedText);
    }















    @Override
    protected void onDestroy() {
        super.onDestroy();
        saveText();
        saveText2();
        saveText3();
        saveText4();
        saveText5();
        saveText6();
        saveText7();
        saveText8();
        saveText9();
        saveText10();
        saveText11();
        saveText12();
        saveText13();
        //saveText14();
        //saveText15();
        //saveText16();
        //saveText17();
        // saveText18();
        //  saveText19();
        //  saveText20();
        //  saveText21();
        //  saveText22();

        saveText23();
        saveText24();
        saveText25();
        saveText26();
        saveText27();
        saveText28();
        saveText29();
        saveText30();
        saveText31();
        saveText32();
        saveText33();

        saveText40();
        saveText41();
        saveText42();
        saveText43();
        saveText44();
        saveText45();
        saveText46();
        saveText47();
        saveText48();
        saveText49();
        saveText50();
        saveText51();

        saveText52();
        saveText53();
        saveText54();
        saveText55();



       // saveText60();
       // saveText61();

        //saveText62();
      //  saveText63();
      //  saveText64();
      //  saveText65();

        saveText66();
        saveText67();
        saveText68();





        saveText73();
        saveText74();

        saveText79();
        saveText80();
        saveText81();
        saveText82();

        //saveText83();
        //saveText84();
        //saveText85();
        //saveText86();

        //saveText89();

        saveText201();
        saveText202();
        saveText203();
        saveText204();
        saveText205();
        saveText206();
        saveText207();
        saveText208();
        saveText209();
        saveText210();
        saveText211();
        saveText212();
        saveText213();
        saveText214();
        saveText215();
        saveText216();
        saveText217();
        saveText218();
        saveText219();
        saveText220();
        saveText221();
        saveText222();
        saveText223();
        saveText224();
        saveText225();
       // saveText226();
        //saveText227();
      //  saveText228();
      //  saveText229();
        saveText230();
        saveText231();
        saveText232();
        saveText233();
        saveText234();
        saveText235();
        saveText236();
        saveText237();
        saveText238();
        saveText239();
        saveText240();
        saveText241();
        saveText242();
        saveText243();
        saveText244();
        saveText245();
        saveText246();
        saveText247();
        saveText248();

        saveText301();
        saveText302();
        saveText303();
        saveText304();

        saveText197();
        saveText277();
        saveText257();

        saveText408();

    }



    @Override
    public void onBackPressed() {

        t.cancel();
        Intent a = new Intent(this, StartActivity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
    }
    //do something on back.







    }















