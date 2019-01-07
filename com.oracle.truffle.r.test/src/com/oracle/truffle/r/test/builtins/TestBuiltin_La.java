/*
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation; either version 2 of the License, or (at your option)
 * any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 51
 * Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 *
 * Copyright (c) 2014, Purdue University
 * Copyright (c) 2014, 2018, Oracle and/or its affiliates
 *
 * All rights reserved.
 */
package com.oracle.truffle.r.test.builtins;

import org.junit.Test;

import com.oracle.truffle.r.test.TestBase;

// Checkstyle: stop line length check
public class TestBuiltin_La extends TestBase {

    @Test
    public void testLa1() {
        // FIXME numerical results are almost all different
        // and FastR output misses "(Intercept) Rail2 Rail3 ..." heading
        assertEval(Ignored.ImplementationError,
                        "argv <- list(structure(c(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0), .Dim = c(18L, 7L), .Dimnames = list(c('1', '2', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12', '13', '14', '15', '16', '17', '18'), c('(Intercept)', 'Rail2', 'Rail5', 'Rail1', 'Rail6', 'Rail3', 'Rail4')))); .Internal(La_qr(argv[[1]]))");
    }

    @Test
    public void testLa2() {
        assertEval("argv <- list(structure(c(-4.47213595499958, 0, -6.70820393249937, 2.23606797749979), .Dim = c(2L, 2L), .Dimnames = list(NULL, c('Intercept', 'X'))), structure(c(1, 0, 0, 1), .Dim = c(2L, 2L)), 2.22044604925031e-16); .Internal(La_solve(argv[[1]], argv[[2]], argv[[3]]))");
    }

    @Test
    public void testLa3a() {
        assertEval("argv <- list(structure(c(-21.2222451396881, 306.936914624821, 0, 0, 0, -101.353437863947, -21.2222451396881, 0, 0, 0, 45.8768670002026, 63.2672432400162, -11.7486843755171, 0, 0, 65.1621918666428, 125.787781278037, -111.869521123473, 61.0965873274467, -54.389932439947, -26.0785375270079, -209.347244886481, 112.817924425406, 108.385517228532, 61.0965873274467), .Dim = c(5L, 5L), .Dimnames = list(NULL, NULL)), FALSE); .Internal(La_rg(argv[[1]], argv[[2]]))");
    }

    @Test
    public void testLa3b() {
        assertEval("argv <- list(structure(c(-21.2222451396881, 306.936914624821, 0, 0, 0, -101.353437863947, -21.2222451396881, 0, 0, 0, 45.8768670002026, 63.2672432400162, -11.7486843755171, 0, 0, 65.1621918666428, 125.787781278037, -111.869521123473, 61.0965873274467, -54.389932439947, -26.0785375270079, -209.347244886481, 112.817924425406, 108.385517228532, 61.0965873274467), .Dim = c(5L, 5L), .Dimnames = list(NULL, NULL)), TRUE); .Internal(La_rg(argv[[1]], argv[[2]]))");
    }

    @Test
    public void testLa4() {
        assertEval("argv <- list('S', structure(c(1, 0, 0, 0, 0, 1.4142135623731, 0, 0, 0, 0, 1.73205080756888, 0, 0, 0, 0, 2), .Dim = c(4L, 4L), Dimnames = list(character(0), character(0))), c(2, 1.73205080756888, 1.4142135623731, 1), structure(c(0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0), .Dim = c(4L, 4L)), structure(c(0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0), .Dim = c(4L, 4L))); .Internal(La_svd(argv[[1]], argv[[2]], argv[[3]], argv[[4]], argv[[5]]))");
    }

    @Test
    public void testLa5() {
        assertEval("argv <- list(structure(c(0.842723988615538, 1, 0, 1, 0.636010690700881, 1, 0, 1, 0.842723988615537), .Dim = c(3L, 3L)), FALSE); .Internal(La_rs(argv[[1]], argv[[2]]))");
    }

    @Test
    public void testLa6() {
        assertEval("jobu <-'S'\n" +
                        "x <- structure(c(FALSE, TRUE, FALSE, TRUE, TRUE, FALSE, TRUE, TRUE, TRUE, FALSE, TRUE, FALSE, TRUE, TRUE, FALSE, TRUE, FALSE, FALSE, FALSE, TRUE, TRUE, TRUE, TRUE, TRUE, TRUE), .Dim = c(5L, 5L), .Dimnames = list(c('x1', 'x2', 'x3', 'x4', 'x5'), c('y1', 'y2', 'y3', 'y4', 'y5')))\n" +
                        "s <- c(3.37916576339493, 1.53572230863579, 1.41421356237309, 0.472012430194285, 3.04287016253022e-18)\n" +
                        "u <- structure(c(-0.38209344041777, -0.441911867608196, -0.441911867608196, -0.563415484445979, -0.38209344041777, -0.594200765232569, 0.307687929858406, 0.307687929858405, 0.32327569786942, -0.594200765232566, 0.499999999999999, -0.5, 0.500000000000001, 7.42461647718073e-16, -0.500000000000001, 0.0304967766615352, 0.45830343560406, 0.458303435604061, -0.760299819185526, 0.0304967766615352, -0.5, -0.5, 0.5, -1.11022302462516e-16, 0.5), .Dim = c(5L, 5L),.Dimnames =list(c('ux1', 'ux2', 'ux3', 'ux4', 'ux5'), c('uy1', 'uy2', 'uy3', 'uy4', 'uy5')))\n" +
                        "vt <- structure(c(-0.41058086214689, 0.0239384830763564, -0.707106781186547, -0.575195883735897, 0, -0.428282990831553, 0.611211774620929, 9.15933995315754e-16, 0.331150287627506, 0.577350269189626, -0.41058086214689, 0.0239384830763538, 0.707106781186548, -0.575195883735897, 5.55111512312578e-17, -0.226146609649533, -0.773838814336698, -1.55431223447522e-15, 0.129220226886747, 0.577350269189625, -0.654429600481086, -0.162627039715767, -5.27355936696949e-16, 0.460370514514253, -0.577350269189626), .Dim = c(5L, 5L), .Dimnames =list(c('vtx1', 'vtx2', 'vtx3', 'vtx4', 'vtx5'), c('vty1', 'vty2', 'vty3', 'vty4', 'vty5')))\n" +
                        ".Internal(La_svd(jobu, x, s, u, vt))");
    }

    @Test
    public void testLa7() {
        // FIXME RInternalError: not implemented: .Internal La_dgecon
        assertEval(Ignored.Unimplemented, "argv <- list(structure(c(1, 1, 3, 3), .Dim = c(2L, 2L)), 'O'); .Internal(La_dgecon(argv[[1]], argv[[2]]))");
    }

    @Test
    public void testLa8() {
        assertEval("argv <- list('N', structure(c(-4, 0, 0, 0, 0, 0, 0, -406.725, 41.7955066364795, 0, 0, 0, 0, 0, -1550.79375, 381.717151319926, 49.8228991342168, 0, 0, 0, 0, -1277.325, 224.617432123818, -31.1858918860748, -282.060212912726, 0, 0, 0, -1042.675, 125.261805546114, -29.9849484767744, 164.425554254677, -170.353263600129, 0, 0, -469.696, 26.3795103523805, 4.19691803785862, -3.18974110831568, 0.0462484557378925, 1.46320172717486, 0, -7818, 18.2758880432689, 1.77525956575195, -1.45298766739792, -0.449176219307484, -0.281900648530911, -0.669305080560524), .Dim = c(7L, 7L), .Dimnames = list(c('1947', '1948', '1949', '1950', '1951', '1952', '1953'), c('(Intercept)', 'GNP.deflator', 'GNP', 'Unemployed', 'Armed.Forces', 'Population', 'Year'))), c(8164.12940108939, 457.24498274114, 324.584423503013, 134.312174464868, 4.95553195929945, 1.41954832076337, 0.000342370904183799), structure(0, .Dim = c(1L, 1L)), structure(0, .Dim = c(1L, 1L))); .Internal(La_svd(argv[[1]], argv[[2]], argv[[3]], argv[[4]], argv[[5]]))");
    }

    @Test
    public void testLa9() {
        assertEval("argv <- list(structure(c(-9.64365076099295, 0.103695169473043, 0.103695169473043, 0.103695169473043, 0.103695169473043, 0.103695169473043, 0.103695169473043, 0.103695169473043, 0.103695169473043, 0.103695169473043, 0.103695169473043, 0.103695169473043, 0.103695169473043, 0.103695169473043, 0.103695169473043, -29634.0055320061, -5658.08855789941, 0.0595010632288954, 0.0648032071760975, 0.106336668095848, -0.0279843118999398, 0.0762911857283688, 0.188519899277481, 0.0807096390177039, 0.102801905464379, 0.158474416910002, -0.0969121832135675, -0.0447744343994132, 0.0356414154664858, 0.0276881995456826, -5.08106330417909, 3.14280306547868, 3.64768208463163, 0.0962151262827947, -0.216651778533863, -0.0914289830351174, 0.0855052819309283, -0.0191216590449975, 0.0813861110263642, 0.0607902565035442, 0.00888870310603775, -0.027169916923919, -0.0757761335977742, 0.123401654252917, -0.143330536432624, -0.207390338946085, -0.18719988871654, -0.127596387499216, 1.38045811630541, 0.0118370110620473, 0.00504893180870276, 0.0281684584122627, 0.0338400772620966, 0.0283917504929648, 0.0295082108964754, 0.0323216911133222, 0.00156557534974961, 0.00420042190203468, 0.0261141712698031, 0.00786241202554953, -3.21455025366432, -2.66432733346907, -2.18217405946767, -1.0459324747522, 2.77707906967759, -0.000588115022584812, -0.0784367740030637, -0.0437014732535189, -0.0770692424774911, 0.28985899050302, 0.307089887725235, -0.0219216068215179, -0.00578473481976082, -0.0910180640383319, 0.0166427821996303, -0.725866186311298, -0.943724610301472, -0.197997366006898, -0.255325765345392, -1.99736582726463, 1.22009740929232, -0.000660179745382102, 0.118090770461339, 0.00401505451472504, -0.265276591063721, -0.206368639386371, -0.0413572976755921, 0.0138104665936721, -0.0436723349383677, 0.0904843084594291, -0.103695169473043, 0.0314422837299137, -0.171533212490836, -0.0271695331685966, -0.234884785308008, -0.455412006973628, -0.833981960018826, -0.0497205266764892, -0.00169048456815939, 0.0359873442560765, 0.0111849454624309, 0.0174129325629219, -0.00581471075176227, 0.0183876477886015, -0.0380971980704758, -1.14064686420347, -1.21031412747477, -0.546078284372325, -0.385964209884133, -0.535335872363138, 0.617909299639904, 0.034437791264286, -2.66782912116871, -0.0707120154460491, 0.170259689757997, -0.200116024334743, -0.0120487035676503, -0.00787104751465206, -0.0743232096613527, -0.00206481367828156, -2.28129372840694, -1.27183039972242, -0.162921372163874, 0.194143545128708, 0.405329624202872, -0.0239884453210967, 0.161826508366356, 1.47283157923894, -3.57122150532158, 0.0184573285734211, 0.0768346205272587, -0.00300367200170235, -0.047539037475449, -0.0955077077363865, 0.170580587807138, -2.17759855893389, 2.82091161681306, -0.529126651121425, 0.00648102843720064, -0.227590137804697, 0.429332016819553, 0.315382802791974, -0.0921680424483324, 0.358484158960907, 2.74734594573339, -0.00180797874108619, 0.211048746835586, 0.146553774483952, 0.0892496085418831, 0.02104367339158, -1.4517323726226, 0.428703993666521, -0.198393471445493, -0.178300389025286, -0.0518091667043893, 0.133208332446864, -1.01393441911662, 0.520772381447608, 0.936102434059857, -1.6420319436063, 2.59716822825227, 0.194828402482676, 0.15057424104202, -0.232155536267878, -0.0298159890277092, -0.933256525257383, -1.20515451427884, 0.0125087156504907, 0.421920000319943, 0.452875082015975, -0.655679104390575, 0.284781968418535, 0.643096539054797, 1.38165893036928, 0.447700892848835, -0.482856979100538, 1.73960015308741, 0.115853953901054, 0.107343556163412, -0.0385322695831968, -25.7267715462619, -8.40853040573162, -1.45105839286435, -1.58984152452525, -1.59606771970776, 2.79428919380473, 0.596892611732863, -1.03839368638655, -0.0376487500979583, -0.507302835476536, 0.184174590388395, -0.70905481454677, -3.32884312972433, 0.134236291836065, -0.0993249017707237, -6.94757635469386, 1.58613921242054, 0.195741168102286, 0.638223445194413, 1.07571321411184, 0.659104584950073, 0.199707908602043, -0.565980943574209, -0.967985377031296, -0.112927393875596, -0.934672543429794, 0.198159847509218, 0.275086401661377, 3.44668029704689, -0.05066048099299, -1.65912271156868, -1.17593571026872, -0.20132598039105, -0.42732880950559, -1.20727437557593, 0.102943259109259, -0.697974199306205, 0.103630431164098, -0.0620963660266192, -0.16978912837867, 0.739571733406047, -0.872308493604205, -0.757980967070979, -2.00985526447536, -1.92891236077264), .Dim = c(15L, 15L), .Dimnames = list(c('1', '2', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12', '13', '14', '15'), c('(Intercept)', 'Weight', 'Cylinders4', 'Cylinders5', 'Cylinders6', 'Cylinders8', 'Cylindersrotary', 'TypeLarge', 'TypeMidsize', 'TypeSmall', 'TypeSporty', 'TypeVan', 'EngineSize', 'DriveTrainFront', 'DriveTrainRear'))), 15L); .Internal(La_chol2inv(argv[[1]], argv[[2]]))");
    }

    @Test
    public void testMisc() {
        assertEval("{ x<-matrix(1:4, ncol=2); solve(x) }");
        assertEval("{ .Internal(La_solve(structure(numeric(0), .Dim = c(0,0)), structure(c(1, 0, 0, 1), .Dim = c(2L, 2L)), 2.22044604925031e-16)) }");
        assertEval("{ .Internal(La_solve(structure(c(2,1), .Dim = c(2,1)), structure(c(1, 0, 0, 1), .Dim = c(2L, 2L)), 2.22044604925031e-16)) }");
        assertEval("{ .Internal(La_solve(structure(c(2,1)), structure(c(1, 0, 0, 1), .Dim = c(2L, 2L)), 2.22044604925031e-16)) }");
    }
}
