/*
 * Copyright (C) 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.sample.cast.refplayer.utils;

import com.google.sample.cast.refplayer.R;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import android.widget.Toast;

/**
 * A collection of utility methods, all static.
 */
public class Utils {

    private static final String TAG = "Utils";

    public static String json = "{    \"name\": \"⚽️\uD83C\uDFC0 \uD83C\uDFBE\uD83D\uDEB4️  Deportes Wise  \",    \"author\": \"Anonimo \",    \"url\": \"http:\\/\\/w3ubin.com\\/B17ZGb8Cx.w3u\",    \"contact\": \"\",    \"info\": \"Actualizado 18\\/02\\/2018\",    \"groups\": [        {            \"name\": \"Deportes\",            \"image\": \"http:\\/\\/www.cuv3.com\\/wp-content\\/uploads\\/deportes.jpg\",            \"stations\": [                {                    \"name\": \"#0\",                    \"image\": \"http:\\/\\/vignette2.wikia.nocookie.net\\/logopedia\\/images\\/d\\/d9\\/Cero3.png\\/revision\\/latest?cb=20160313142148\",                    \"url\": \"http:\\/\\/livesports.pw\\/embedna.php?file=movistarcero&width=650&height=397\",                    \"isHost\": true                },                {                    \"name\": \"La Liga Tv\",                    \"image\": \"http:\\/\\/files.laliga.es\\/seccion_logos\\/laliga-v-600x600.png\",                    \"url\": \"http:\\/\\/livesports.pw\\/embed.php?file=barliga&width=650&height=397\",                    \"isHost\": true                },                {                    \"name\": \"M Futbol\",                    \"image\": \"http:\\/\\/www1.movistarplus.es\\/recorte\\/m-NEO\\/canal\\/CPFUT\",                    \"url\": \"http:\\/\\/livesports.pw\\/embed.php?file=mfutboles&width=650&height=397\",                    \"isHost\": true                },                {                    \"name\": \"M Partidazo\",                    \"image\": \"http:\\/\\/www1.movistarplus.es\\/recorte\\/m-NEO\\/canal\\/CPPART\",                    \"url\": \"http:\\/\\/livesports.pw\\/embed.php?file=partidazo&width=650&height=397\",                    \"isHost\": true                },                {                    \"name\": \"Bein Sport La Liga\",                    \"image\": \"http:\\/\\/www1.movistarplus.es\\/recorte\\/m-NEO\\/canal\\/BELIGA\",                    \"url\": \"http:\\/\\/livesports.pw\\/embed.php?file=beinlaliga&width=650&height=397\",                    \"isHost\": true                },                {                    \"name\": \"Bein Sport\",                    \"image\": \"http:\\/\\/www1.movistarplus.es\\/recorte\\/m-NEO\\/canal\\/CHUEFA\",                    \"url\": \"http:\\/\\/livesports.pw\\/embed.php?file=beinsport&width=650&height=397\",                    \"isHost\": true                },                {                    \"name\": \"Bein Sport Ñ\",                    \"image\": \"https:\\/\\/fubotv-v3-dev-custom-assets.imgix.net\\/station_logos\\/bein_sports_spanish_c.png\",                    \"url\": \"http:\\/\\/livesports.pw\\/embedna.php?file=beinsportn&width=650&height=397\",                    \"isHost\": true                },                {                    \"name\": \"Liga 123\",                    \"image\": \"http:\\/\\/cinestrenostv.tv\\/img\\/liga2.png\",                    \"url\": \"http:\\/\\/livesports.pw\\/embed.php?file=ligaunodostres&width=650&height=397\",                    \"isHost\": true                },                {                    \"name\": \"Real Madrid Tv\",                    \"image\": \"http:\\/\\/www1.movistarplus.es\\/recorte\\/m-NEO\\/canal\\/REALM\",                    \"url\": \"http:\\/\\/rmtvlive-lh.akamaihd.net\\/i\\/rmtv_1@154306\\/index_1000_av-p.m3u8?sd=10&rebase=on\"                },                {                    \"name\": \"Barça Tv\",                    \"image\": \"http:\\/\\/www1.movistarplus.es\\/recorte\\/m-NEO\\/canal\\/BARNA\",                    \"url\": \"http:\\/\\/livesports.pw\\/embed.php?file=barca&width=650&height=397\",                    \"isHost\": true                },                {                    \"name\": \"M Deportes 1\",                    \"image\": \"http:\\/\\/www1.movistarplus.es\\/recorte\\/m-NEO\\/canal\\/CPDEP\",                    \"url\": \"http:\\/\\/livesports.pw\\/embed.php?file=deporteone&width=650&height=397\",                    \"isHost\": true                },                {                    \"name\": \"M Deportes 2\",                    \"image\": \"http:\\/\\/www1.movistarplus.es\\/recorte\\/m-NEO\\/canal\\/CPD2\",                    \"url\": \"http:\\/\\/livesports.pw\\/embed.php?file=deportedosm&width=650&height=397\",                    \"isHost\": true                },                {                    \"name\": \"M Formula 1\",                    \"image\": \"http:\\/\\/www1.movistarplus.es\\/recorte\\/m-NEO\\/canal\\/MVF1\",                    \"url\": \"http:\\/\\/livesports.pw\\/embed.php?file=funoesp&width=650&height=397\",                    \"isHost\": true                },                {                    \"name\": \"M Moto Gp\",                    \"image\": \"http:\\/\\/www1.movistarplus.es\\/recorte\\/m-NEO\\/canal\\/MVMTGP\",                    \"url\": \"http:\\/\\/livesports.pw\\/embed.php?file=motogpm&width=650&height=397\",                    \"isHost\": true                },                {                    \"name\": \"M Golf\",                    \"image\": \"http:\\/\\/www1.movistarplus.es\\/recorte\\/m-NEO\\/canal\\/GOLF%2B\",                    \"url\": \"http:\\/\\/livesports.pw\\/embed.php?file=golfesp&width=650&height=397\",                    \"isHost\": true                },                {                    \"name\": \"Gol\",                    \"image\": \"http:\\/\\/www1.movistarplus.es\\/recorte\\/m-NEO\\/canal\\/GOL\",                    \"url\": \"http:\\/\\/livesports.pw\\/embed.php?file=golesp&width=650&height=397\",                    \"isHost\": true                },                {                    \"name\": \"Teledeporte\",                    \"image\": \"http:\\/\\/www1.movistarplus.es\\/recorte\\/m-NEO\\/canal\\/TDEP\",                    \"url\": \"http:\\/\\/livesports.pw\\/embed.php?file=teledeporteesp&width=650&height=400\",                    \"isHost\": true                },                {                    \"name\": \"Eurosport 1\",                    \"image\": \"http:\\/\\/www1.movistarplus.es\\/recorte\\/m-NEO\\/canal\\/ESP\",                    \"url\": \"http:\\/\\/livesports.pw\\/embed.php?file=eurosportsesp&width=650&height=397\",                    \"isHost\": true                },                {                    \"name\": \"Eurosport 2\",                    \"image\": \"http:\\/\\/www1.movistarplus.es\\/recorte\\/m-NEO\\/canal\\/ESP2\",                    \"url\": \"http:\\/\\/livesports.pw\\/embed.php?file=eurosportsdosesp&width=650&height=397\",                    \"isHost\": true                },                {                    \"name\": \"Caza y Pesca\",                    \"image\": \"http:\\/\\/www1.movistarplus.es\\/recorte\\/m-NEO\\/canal\\/CAZPES.png\",                    \"url\": \"http:\\/\\/livesports.pw\\/embedna.php?file=cazaypesca&width=650&height=397\",                    \"isHost\": true                },                {                    \"name\": \"Iberalia\",                    \"image\": \"http:\\/\\/www.mundoplus.tv\\/img\\/17731be322986efacc33a5ada475fb2a\",                    \"url\": \"http:\\/\\/playlist.onlybest.tv\\/ru\\/channel\\/262f9cb9e35b2e64d0571c3e9c1cd4fa\\/603\\/index.m3u8\",                    \"userAgent\": \"VLPLAYER\\/8.5 LIBVLC\\/3.0.0 LibVLC\\/3.0.0-git\"                },                {                    \"name\": \"Toros\",                    \"image\": \"http:\\/\\/www1.movistarplus.es\\/recorte\\/m-NEO\\/canal\\/CFERIA\",                    \"url\": \"http:\\/\\/livesports.pw\\/embed.php?file=torotv&width=650&height=397\",                    \"isHost\": true                }            ]        },        {            \"name\": \"Deportes opción 2\",            \"image\": \"http:\\/\\/www.cuv3.com\\/wp-content\\/uploads\\/deportes.jpg\",            \"stations\": [                {                    \"name\": \"#0\",                    \"image\": \"http:\\/\\/vignette2.wikia.nocookie.net\\/logopedia\\/images\\/d\\/d9\\/Cero3.png\\/revision\\/latest?cb=20160313142148\",                    \"url\": \"http:\\/\\/www.vercanalestv.com\\/tv\\/nacionales\\/canal-plus-1.html\",                    \"isHost\": true                },                {                    \"name\": \"La Liga Tv\",                    \"image\": \"http:\\/\\/files.laliga.es\\/seccion_logos\\/laliga-v-600x600.png\",                    \"url\": \"http:\\/\\/livesports.pw\\/embed.php?file=barliga&width=650&height=397\",                    \"isHost\": true                },                {                    \"name\": \"M Futbol\",                    \"image\": \"http:\\/\\/www1.movistarplus.es\\/recorte\\/m-NEO\\/canal\\/CPFUT\",                    \"url\": \"http:\\/\\/vercanalestv.com\\/tv\\/deportes\\/canal-plus-futbol.html\",                    \"isHost\": true                },                {                    \"name\": \"M Partidazo\",                    \"image\": \"http:\\/\\/www1.movistarplus.es\\/recorte\\/m-NEO\\/canal\\/CPPART\",                    \"url\": \"http:\\/\\/www.vercanalestv.com\\/tv\\/deportes\\/canal-plus-partidazo.html\",                    \"isHost\": true                },                {                    \"name\": \"Bein Sport La Liga\",                    \"image\": \"http:\\/\\/www1.movistarplus.es\\/recorte\\/m-NEO\\/canal\\/BELIGA\",                    \"url\": \"http:\\/\\/www.vercanalestv.com\\/tv\\/deportes\\/bein-sports-liga.html\",                    \"isHost\": true                },                {                    \"name\": \"Bein Sport\",                    \"image\": \"http:\\/\\/www1.movistarplus.es\\/recorte\\/m-NEO\\/canal\\/CHUEFA\",                    \"url\": \"http:\\/\\/vercanalestv.com\\/tv\\/deportes\\/bein-sport.html\",                    \"isHost\": true                },                {                    \"name\": \"Bein Sport Ñ\",                    \"image\": \"https:\\/\\/fubotv-v3-dev-custom-assets.imgix.net\\/station_logos\\/bein_sports_spanish_c.png\",                    \"url\": \"http:\\/\\/vercanalestv.com\\/tv\\/deportes\\/bein-sport-n.html\",                    \"isHost\": true                },                {                    \"name\": \"Liga 123\",                    \"image\": \"http:\\/\\/cinestrenostv.tv\\/img\\/liga2.png\",                    \"url\": \"http:\\/\\/livesports.pw\\/embed.php?file=ligaunodostres&width=650&height=397\",                    \"isHost\": true                },                {                    \"name\": \"Real Madrid Tv\",                    \"image\": \"http:\\/\\/www1.movistarplus.es\\/recorte\\/m-NEO\\/canal\\/REALM\",                    \"url\": \"http:\\/\\/rmtvlive-lh.akamaihd.net\\/i\\/rmtv_1@154306\\/index_1000_av-p.m3u8?sd=10&rebase=on\"                },                {                    \"name\": \"Barça Tv\",                    \"image\": \"http:\\/\\/www1.movistarplus.es\\/recorte\\/m-NEO\\/canal\\/BARNA\",                    \"url\": \"http:\\/\\/vercanalestv.com\\/tv\\/deportes\\/barca-tv.html\",                    \"isHost\": true                },                {                    \"name\": \"M Deportes 1\",                    \"image\": \"http:\\/\\/www1.movistarplus.es\\/recorte\\/m-NEO\\/canal\\/CPDEP\",                    \"url\": \"http:\\/\\/www.vercanalestv.com\\/tv\\/deportes\\/canal-plus-deportes.html\",                    \"isHost\": true                },                {                    \"name\": \"M Deportes 2\",                    \"image\": \"http:\\/\\/www1.movistarplus.es\\/recorte\\/m-NEO\\/canal\\/CPD2\",                    \"url\": \"http:\\/\\/vercanalestv.com\\/tv\\/deportes\\/canal-plus-deportes-2.html\",                    \"isHost\": true                },                {                    \"name\": \"M Formula 1\",                    \"image\": \"http:\\/\\/www1.movistarplus.es\\/recorte\\/m-NEO\\/canal\\/MVF1\",                    \"url\": \"http:\\/\\/vergol.com\\/live3\\/formula1.php\",                    \"referer\": \"http:\\/\\/vercanalestv.com\\/\",                    \"isHost\": true                },                {                    \"name\": \"M Moto Gp\",                    \"image\": \"http:\\/\\/www1.movistarplus.es\\/recorte\\/m-NEO\\/canal\\/MVMTGP\",                    \"url\": \"http:\\/\\/vergol.com\\/live3\\/motogp.php\",                    \"referer\": \"http:\\/\\/vercanalestv.com\\/\",                    \"isHost\": true                },                {                    \"name\": \"M Golf\",                    \"image\": \"http:\\/\\/www1.movistarplus.es\\/recorte\\/m-NEO\\/canal\\/GOLF%2B\",                    \"url\": \"http:\\/\\/vercanalestv.com\\/tv\\/deportes\\/canal-plus-golf.html\",                    \"isHost\": true                },                {                    \"name\": \"Gol\",                    \"image\": \"http:\\/\\/www1.movistarplus.es\\/recorte\\/m-NEO\\/canal\\/GOL\",                    \"url\": \"http:\\/\\/vercanalestv.com\\/tv\\/deportes\\/goltv.html\",                    \"isHost\": true                },                {                    \"name\": \"Teledeporte\",                    \"image\": \"http:\\/\\/www1.movistarplus.es\\/recorte\\/m-NEO\\/canal\\/TDEP\",                    \"url\": \"http:\\/\\/vercanalestv.com\\/tv\\/deportes\\/teledeporte.html\",                    \"isHost\": true                },                {                    \"name\": \"Eurosport 1\",                    \"image\": \"http:\\/\\/www1.movistarplus.es\\/recorte\\/m-NEO\\/canal\\/ESP\",                    \"url\": \"http:\\/\\/vercanalestv.com\\/tv\\/deportes\\/eurosport.html\",                    \"isHost\": true                },                {                    \"name\": \"Eurosport 2\",                    \"image\": \"http:\\/\\/www1.movistarplus.es\\/recorte\\/m-NEO\\/canal\\/ESP2\",                    \"url\": \"http:\\/\\/vercanalestv.com\\/tv\\/deportes\\/eurosport-2.html\",                    \"isHost\": true                },                {                    \"name\": \"Caza y Pesca\",                    \"image\": \"http:\\/\\/www1.movistarplus.es\\/recorte\\/m-NEO\\/canal\\/CAZPES.png\",                    \"url\": \"http:\\/\\/vercanalestv.com\\/tv\\/documentales\\/caza-y-pesca.html\",                    \"isHost\": true                },                {                    \"name\": \"Toros\",                    \"image\": \"http:\\/\\/www1.movistarplus.es\\/recorte\\/m-NEO\\/canal\\/CFERIA\",                    \"url\": \"http:\\/\\/vergol.com\\/live1\\/toros.php\",                    \"referer\": \"http:\\/\\/vercanalestv.com\\/\",                    \"isHost\": true                }            ]        },        {            \"name\": \"Extranjeros\",            \"image\": \"https:\\/\\/previews.123rf.com\\/images\\/alhovik\\/alhovik1209\\/alhovik120900001\\/15017439-Banderas-del-mundo-Europa-Foto-de-archivo.jpg\",            \"stations\": [                {                    \"name\": \"SPORT TV 1 HD\",                    \"image\": \"http:\\/\\/i63.tinypic.com\\/2vt63q9.jpg\",                    \"url\": \"http:\\/\\/telefivegb.com\\/canales\\/portugal\\/sporttv\\/\",                    \"isHost\": true                },                {                    \"name\": \"SPORT TV 2 HD\",                    \"image\": \"http:\\/\\/i65.tinypic.com\\/28lge1g.jpp\",                    \"url\": \"http:\\/\\/telefivegb.com\\/canales\\/portugal\\/sporttv2\",                    \"isHost\": true                },                {                    \"name\": \"SPORT TV 3 HD\",                    \"image\": \"http:\\/\\/i67.tinypic.com\\/2qjfur9.jpg\",                    \"url\": \"http:\\/\\/telefivegb.com\\/canales\\/portugal\\/sporttv3\",                    \"isHost\": true                },                {                    \"name\": \"SPORT TV 4 HD\",                    \"image\": \"http:\\/\\/i67.tinypic.com\\/2uh01f8.jpg\",                    \"url\": \"http:\\/\\/telefivegb.com\\/canales\\/portugal\\/sporttv4\",                    \"isHost\": true                },                {                    \"name\": \"SPORT TV 5 HD\",                    \"image\": \"http:\\/\\/i63.tinypic.com\\/k3ngxx.jpg\",                    \"url\": \"http:\\/\\/telefivegb.com\\/canales\\/portugal\\/sporttv5\",                    \"isHost\": true                },                {                    \"name\": \"Bein Sport 1 Fr\",                    \"image\": \"http:\\/\\/sabonner.beinsports.com\\/wp-content\\/uploads\\/2015\\/06\\/beINSPORTSHD1.png\",                    \"url\": \"http:\\/\\/www.dinostream.pw\\/channel.php?file=122&width=650&height=400&autostart=true\",                    \"referer\": \"http:\\/\\/cinestrenostv.tv\\/canales\\/deportes\\/beinfrance1.php\",                    \"embed\": true                },                {                    \"name\": \"Bein Sport 2 Fr\",                    \"image\": \"http:\\/\\/sabonner.beinsports.com\\/wp-content\\/uploads\\/2015\\/06\\/beINSPORTSHD2.png\",                    \"url\": \"http:\\/\\/www.dinostream.pw\\/channel.php?file=123&width=650&height=400&autostart=true\",                    \"referer\": \"http:\\/\\/cinestrenostv.tv\\/canales\\/deportes\\/beinfrance2.php\",                    \"embed\": true                },                {                    \"name\": \"Bein Sport 3 Fr\",                    \"image\": \"http:\\/\\/sabonner.beinsports.com\\/wp-content\\/uploads\\/2015\\/06\\/beINSPORTSHD3.png\",                    \"url\": \"http:\\/\\/www.dinostream.pw\\/channel.php?file=124&width=650&height=400&autostart=true\",                    \"referer\": \"http:\\/\\/cinestrenostv.tv\\/canales\\/deportes\\/beinfrance3.php\",                    \"embed\": true                },                {                    \"name\": \"Canal+Sport\",                    \"image\": \"http:\\/\\/www.dvbxtreme.com\\/wp-content\\/uploads\\/2016\\/08\\/canal-sport.png\",                    \"url\": \"http:\\/\\/www.dinostream.pw\\/channel.php?file=125&width=650&height=400&autostart=true\",                    \"referer\": \"http:\\/\\/cinestrenostv.tv\\/canales\\/deportes\\/sport1.php\",                    \"embed\": true                },                {                    \"name\": \"Bt Sport 1\",                    \"image\": \"https:\\/\\/2.bp.blogspot.com\\/-PpncnPlsQbc\\/WOKRxAzCPOI\\/AAAAAAAACnE\\/UZPoASuOW58wTM9PFhgc8-VxZm2Z2a2SwCLcB\\/s320\\/BT%2BSPORT%2B1%2BHD.png\",                    \"url\": \"http:\\/\\/www.dinostream.pw\\/channel.php?file=136&width=650&height=400&autostart=true\",                    \"referer\": \"http:\\/\\/cinestrenostv.tv\\/canales\\/deportes\\/btsport1.php\",                    \"embed\": true                },                {                    \"name\": \"Bt Sport 2\",                    \"image\": \"http:\\/\\/thefreetvkingston.info\\/.ZMedia\\/wiz\\/btsports2.png\",                    \"url\": \"http:\\/\\/www.dinostream.pw\\/channel.php?file=137&width=650&height=400&autostart=true\",                    \"referer\": \"http:\\/\\/cinestrenostv.tv\\/canales\\/deportes\\/btsport2.php\",                    \"embed\": true                },                {                    \"name\": \"Nfl\",                    \"image\": \"http:\\/\\/vertutele.com\\/img\\/nfl.png\",                    \"url\": \"http:\\/\\/www.dinostream.pw\\/channel.php?file=141&width=650&height=400&autostart=true\",                    \"referer\": \"http:\\/\\/cinestrenostv.tv\\/canales\\/deportes\\/nfl\\/canal1.html\",                    \"embed\": true                },                {                    \"name\": \"Nfl 2\",                    \"image\": \"http:\\/\\/vertutele.com\\/img\\/nfl.png\",                    \"url\": \"http:\\/\\/www.dinostream.pw\\/channel.php?file=142&width=650&height=400&autostart=true\",                    \"referer\": \"http:\\/\\/cinestrenostv.tv\\/canales\\/deportes\\/nfl\\/canal2.html\",                    \"embed\": true                },                {                    \"name\": \"Nfl 3\",                    \"image\": \"http:\\/\\/vertutele.com\\/img\\/nfl.png\",                    \"url\": \"http:\\/\\/www.dinostream.pw\\/channel.php?file=143&width=650&height=400&autostart=true\",                    \"referer\": \"http:\\/\\/cinestrenostv.tv\\/canales\\/deportes\\/nfl\\/canal3.html\",                    \"embed\": true                },                {                    \"name\": \"Nfl 4\",                    \"image\": \"http:\\/\\/vertutele.com\\/img\\/nfl.png\",                    \"url\": \"http:\\/\\/www.dinostream.pw\\/channel.php?file=144&width=650&height=400&autostart=true\",                    \"referer\": \"http:\\/\\/cinestrenostv.tv\\/canales\\/deportes\\/nfl\\/canal4.html\",                    \"embed\": true                },                {                    \"name\": \"Nfl 5\",                    \"image\": \"http:\\/\\/vertutele.com\\/img\\/nfl.png\",                    \"url\": \"http:\\/\\/www.dinostream.pw\\/channel.php?file=145&width=650&height=400&autostart=true\",                    \"referer\": \"http:\\/\\/cinestrenostv.tv\\/canales\\/deportes\\/nfl\\/canal5.html\",                    \"embed\": true                },                {                    \"name\": \"Nfl 6\",                    \"image\": \"http:\\/\\/vertutele.com\\/img\\/nfl.png\",                    \"url\": \"http:\\/\\/www.dinostream.pw\\/channel.php?file=146&width=650&height=400&autostart=true\",                    \"referer\": \"http:\\/\\/cinestrenostv.tv\\/canales\\/deportes\\/nfl\\/canal6.html\",                    \"embed\": true                },                {                    \"name\": \"Nfl 7\",                    \"image\": \"http:\\/\\/vertutele.com\\/img\\/nfl.png\",                    \"url\": \"http:\\/\\/www.dinostream.pw\\/channel.php?file=147&width=650&height=400&autostart=true\",                    \"referer\": \"http:\\/\\/cinestrenostv.tv\\/canales\\/deportes\\/nfl\\/canal7.html\",                    \"embed\": true                }            ]        },        {            \"name\": \"Eventos\",            \"image\": \"http:\\/\\/verliga.net\\/imagenes\\/verliga.png\",            \"stations\": [                {                    \"name\": \"Ver Liga 1\",                    \"image\": \"http:\\/\\/verliga.net\\/imagenes\\/verliga.png\",                    \"url\": \"http:\\/\\/verliga.net\\/live\\/verliga1.php\",                    \"referer\": \"http:\\/\\/www.verliga.net\",                    \"embed\": true                },                {                    \"name\": \"Ver Liga 2\",                    \"image\": \"http:\\/\\/verliga.net\\/imagenes\\/verliga.png\",                    \"url\": \"http:\\/\\/vergol.com\\/live3\\/beinliga.php\",                    \"referer\": \"http:\\/\\/www.verliga.net\",                    \"embed\": true                },                {                    \"name\": \"Ver Liga 3\",                    \"image\": \"http:\\/\\/verliga.net\\/imagenes\\/verliga.png\",                    \"url\": \"http:\\/\\/verliga.net\\/live\\/verliga3.php\",                    \"referer\": \"http:\\/\\/www.verliga.net\",                    \"embed\": true                },                {                    \"name\": \"Ver Liga 4\",                    \"image\": \"http:\\/\\/verliga.net\\/imagenes\\/verliga.png\",                    \"url\": \"http:\\/\\/verliga.net\\/live\\/verliga4.php\",                    \"referer\": \"http:\\/\\/www.verliga.net\",                    \"embed\": true                },                {                    \"name\": \"Ver Liga 5\",                    \"image\": \"http:\\/\\/verliga.net\\/imagenes\\/verliga.png\",                    \"url\": \"http:\\/\\/verliga.net\\/live\\/verliga5.php\",                    \"referer\": \"http:\\/\\/www.verliga.net\",                    \"embed\": true                }            ]        },        {            \"name\": \"Actualizado 18\\/02\\/2018\",            \"image\": \"http:\\/\\/jaestic.com\\/wp-content\\/uploads\\/2014\\/07\\/info4.png\"        }    ]}";
    /*
     * Making sure public utility methods remain static
     */
    private Utils() {
    }

    @SuppressWarnings("deprecation")
    /**
     * Returns the screen/display size
     *
     */
    public static Point getDisplaySize(Context context) {
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        int width = display.getWidth();
        int height = display.getHeight();
        return new Point(width, height);
    }

    /**
     * Returns {@code true} if and only if the screen orientation is portrait.
     */
    public static boolean isOrientationPortrait(Context context) {
        return context.getResources().getConfiguration().orientation
                == Configuration.ORIENTATION_PORTRAIT;
    }

    /**
     * Shows an error dialog with a given text message.
     */
    public static void showErrorDialog(Context context, String errorString) {
        new AlertDialog.Builder(context).setTitle(R.string.error)
                .setMessage(errorString)
                .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                })
                .create()
                .show();
    }

    /**
     * Shows an "Oops" error dialog with a text provided by a resource ID
     */
    public static void showOopsDialog(Context context, int resourceId) {
        new AlertDialog.Builder(context).setTitle(R.string.oops)
                .setMessage(context.getString(resourceId))
                .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                })
                .setIcon(R.drawable.ic_action_alerts_and_states_warning)
                .create()
                .show();
    }

    /**
     * Gets the version of app.
     */
    public static String getAppVersionName(Context context) {
        String versionString = null;
        try {
            PackageInfo info = context.getPackageManager().getPackageInfo(context.getPackageName(),
                    0 /* basic info */);
            versionString = info.versionName;
        } catch (Exception e) {
            // do nothing
        }
        return versionString;
    }

    /**
     * Shows a (long) toast.
     */
    public static void showToast(Context context, int resourceId) {
        Toast.makeText(context, context.getString(resourceId), Toast.LENGTH_LONG).show();
    }

    /**
     * Formats time from milliseconds to hh:mm:ss string format.
     */
    public static String formatMillis(int millisec) {
        int seconds = (int) (millisec / 1000);
        int hours = seconds / (60 * 60);
        seconds %= (60 * 60);
        int minutes = seconds / 60;
        seconds %= 60;

        String time;
        if (hours > 0) {
            time = String.format("%d:%02d:%02d", hours, minutes, seconds);
        } else {
            time = String.format("%d:%02d", minutes, seconds);
        }
        return time;
    }
}