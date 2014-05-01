// DO NOT EDIT, update using 'mx rignoredtests'
// This contains a copy of the @Ignore tests one micro-test per method
package com.oracle.truffle.r.test.failing;

import org.junit.Ignore;

import com.oracle.truffle.r.test.*;

//Checkstyle: stop
public class FailingTests extends TestBase {
    @Ignore
    public void TestSimpleArithmetic_testIntegerOverflow_e56646664ed3ccebd0b978a474ccae3c() {
        assertEvalWarning("{ x <- 2147483647L ; x + 1L }");
    }

    @Ignore
    public void TestSimpleArithmetic_testIntegerOverflow_9cc3316d11cb57fdb9d71e833e43dcd6() {
        assertEvalWarning("{ x <- 2147483647L ; x * x }");
    }

    @Ignore
    public void TestSimpleArithmetic_testIntegerOverflow_a5d2e40a03d44363ee0bf4afb8a3a70d() {
        assertEvalWarning("{ x <- -2147483647L ; x - 2L }");
    }

    @Ignore
    public void TestSimpleArithmetic_testIntegerOverflow_52bf15e78c97dfea203e3a3a75c0c096() {
        assertEvalWarning("{ x <- -2147483647L ; x - 1L }");
    }

    @Ignore
    public void TestSimpleArithmetic_testIntegerOverflow_4a27f3f0ef1c0e73ea1ae4a599818778() {
        assertEvalWarning("{ 2147483647L + 1:3 }");
    }

    @Ignore
    public void TestSimpleArithmetic_testIntegerOverflow_d17b51eaa8f9d85088d30f7b59888e01() {
        assertEvalWarning("{ 2147483647L + c(1L,2L,3L) }");
    }

    @Ignore
    public void TestSimpleArithmetic_testIntegerOverflow_a208f558c3d55c2d86aa5cfe699b218a() {
        assertEvalWarning("{ 1:3 + 2147483647L }");
    }

    @Ignore
    public void TestSimpleArithmetic_testIntegerOverflow_1444a6f9919138380d32057ddfa36eec() {
        assertEvalWarning("{ c(1L,2L,3L) + 2147483647L }");
    }

    @Ignore
    public void TestSimpleArithmetic_testIntegerOverflow_dd77dbcef3cf523fc2aa46c4c0deaf5c() {
        assertEvalWarning("{ 1:3 + c(2147483647L,2147483647L,2147483647L) }");
    }

    @Ignore
    public void TestSimpleArithmetic_testIntegerOverflow_72a5d4dd67ed5a21396516c0968edf6e() {
        assertEvalWarning("{ c(2147483647L,2147483647L,2147483647L) + 1:3 }");
    }

    @Ignore
    public void TestSimpleArithmetic_testIntegerOverflow_6fd7e6825d4c56f715061fbb7124628a() {
        assertEvalWarning("{ c(1L,2L,3L) + c(2147483647L,2147483647L,2147483647L) }");
    }

    @Ignore
    public void TestSimpleArithmetic_testIntegerOverflow_6b9734a08caf45fad14bde9d7b10a97c() {
        assertEvalWarning("{ c(2147483647L,2147483647L,2147483647L) + c(1L,2L,3L) }");
    }

    @Ignore
    public void TestSimpleArithmetic_testIntegerOverflow_8b60212b3b68acfddf00f22ea65883db() {
        assertEvalWarning("{ 1:4 + c(2147483647L,2147483647L) }");
    }

    @Ignore
    public void TestSimpleArithmetic_testIntegerOverflow_ffe1faa265bec1af2b8c1f1c4d9fc343() {
        assertEvalWarning("{ c(2147483647L,2147483647L) + 1:4 }");
    }

    @Ignore
    public void TestSimpleArithmetic_testIntegerOverflow_8894beb2d0cbaf7303c2efa930d6684b() {
        assertEvalWarning("{ c(1L,2L,3L,4L) + c(2147483647L,2147483647L) }");
    }

    @Ignore
    public void TestSimpleArithmetic_testIntegerOverflow_68d4c3db613629f473aa7128bff2c5a8() {
        assertEvalWarning("{ c(2147483647L,2147483647L) + c(1L,2L,3L,4L) }");
    }

    @Ignore
    public void TestSimpleArithmetic_testMatricesIgnore_6501297c30346fab1b5e3cb8243d733e() {
        assertEval("{ m <- matrix(1:6, nrow=2, ncol=3, byrow=TRUE) ; m+1L }");
    }

    @Ignore
    public void TestSimpleArithmetic_testMatricesIgnore_20ecb09faabed8eebd8838ad5e84bd30() {
        assertEval("{ m <- matrix(1:6, nrow=2, ncol=3, byrow=TRUE) ; m+m }");
    }

    @Ignore
    public void TestSimpleArithmetic_testMatricesOuterProduct_10f665dc31dc8de98c87bb9b2603e3ac() {
        assertEval("{ 1:3 %o% 1:2 }");
    }

    @Ignore
    public void TestSimpleArithmetic_testMatricesOuterProduct_b4ef8ce1b5d0ec522e1700961204a7fe() {
        assertEval("{ 1:3 %*% c(TRUE,FALSE,TRUE) }");
    }

    @Ignore
    public void TestSimpleArithmetic_testMatricesOuterProduct_37728a54ca59a17f41ea4c8e909975fa() {
        assertEvalError("{ 1:4 %*% 1:3 }");
    }

    @Ignore
    public void TestSimpleArithmetic_testMatricesOuterProduct_35e59fddf166a877e6189099ee6fb1fa() {
        assertEvalError("{ 1:3 %*% as.raw(c(1,2,3)) }");
    }

    @Ignore
    public void TestSimpleArithmetic_testMatricesOuterProduct_a09ecf2d4e23f8197f1193edacadb395() {
        assertEvalError("{ as.raw(1:3) %o% 1:3 }");
    }

    @Ignore
    public void TestSimpleArithmetic_testMatricesPrecedence_2ffbf2ffcec6699d78e24fb25ef01c31() {
        assertEval("{ 10 / 1:3 %*% 3:1 }");
    }

    @Ignore
    public void TestSimpleArithmetic_testMatricesPrecedence_535ad26d0ae2d6aebb3f6b8ee7202d6b() {
        assertEval("{ x <- 1:2 ; dim(x) <- c(1,1,2) ; y <- 2:3 ; dim(y) <- c(1,1,2) ; x + y }");
    }

    @Ignore
    public void TestSimpleArithmetic_testMatricesProductIgnore_2d6353b38e2b880f487de091cada51de() {
        assertEval("{ x <- 1:3 %*% 9:11 ; x[1] }");
    }

    @Ignore
    public void TestSimpleArithmetic_testMatricesProductIgnore_24bd08e2ca37ab0518a7581f2f50ddee() {
        assertEval("{ m<-matrix(1:3, nrow=1) ; 1:2 %*% m }");
    }

    @Ignore
    public void TestSimpleArithmetic_testMatricesProductIgnore_5ec0a442914239f245360029a38d268d() {
        assertEval("{ m<-matrix(1:6, nrow=2) ; 1:2 %*% m }");
    }

    @Ignore
    public void TestSimpleArithmetic_testMatricesProductIgnore_d0711a4730cdf02f5a3b8f72241f1e4b() {
        assertEval("{ m<-matrix(1:6, nrow=2) ; m %*% 1:3 }");
    }

    @Ignore
    public void TestSimpleArithmetic_testMatricesProductIgnore_863b40edd577576cae70ebf3e7bfced1() {
        assertEval("{ m<-matrix(1:3, ncol=1) ; m %*% 1:2 }");
    }

    @Ignore
    public void TestSimpleArithmetic_testMatricesProductIgnore_5ff07900e3894985c2c175e2f144e1e5() {
        assertEval("{ a<-matrix(1:6, ncol=2) ; b<-matrix(11:16, nrow=2) ; a %*% b }");
    }

    @Ignore
    public void TestSimpleArithmetic_testMatricesProductIgnore_fcf07ee50d1cec625af66d876a3ade31() {
        assertEval("{ a <- array(1:9, dim=c(3,1,3)) ;  a %*% 1:9 }");
    }

    @Ignore
    public void TestSimpleArithmetic_testMatricesProductIgnore_caeff71e032666868b80c5661b0aedbf() {
        assertEval("{ m <- matrix(c(1,2,3,0/0), nrow=4) ; m %*% 1:4 }");
    }

    @Ignore
    public void TestSimpleArithmetic_testMatricesProductIgnore_70b2522d5c0789b448aaa4e42bcb041d() {
        assertEval("{ m <- matrix(c(NA,1,0/0,2), nrow=2) ; 1:2 %*% m }");
    }

    @Ignore
    public void TestSimpleArithmetic_testMatricesProductIgnore_54299d1df8e5f86b0085b241c557b2db() {
        assertEval("{ m <- double() ; dim(m) <- c(0,0) ; m %*% m }");
    }

    @Ignore
    public void TestSimpleArithmetic_testMatricesProductIgnore_1ec6885e784fa47096ed05a88cc80f60() {
        assertEval("{ m <- matrix(c(NA,1,4,2), nrow=2) ; t(m) %*% m }");
    }

    @Ignore
    public void TestSimpleArithmetic_testMatricesProductIgnore_dcc24f855641426f57aae95814c402ba() {
        assertEval("{ matrix(c(3,1,0/0,2), nrow=2) %*% matrix(1:6,nrow=2) }");
    }

    @Ignore
    public void TestSimpleArithmetic_testMatricesProductIgnore_6b9454263a04c54bc733dd613376e166() {
        assertEvalError("{ matrix(2,nrow=2,ncol=3) %*% matrix(4,nrow=1,ncol=5) }");
    }

    @Ignore
    public void TestSimpleArithmetic_testMatricesProductIgnore_ead68010e962c2d7e87bdca6608f0e53() {
        assertEvalError("{ 1:3 %*% matrix(4,nrow=2,ncol=5) }");
    }

    @Ignore
    public void TestSimpleArithmetic_testMatricesProductIgnore_b920cd3ed3cec15b725979c29716cbaf() {
        assertEvalError("{ matrix(4,nrow=2,ncol=5) %*% 1:4 }");
    }

    @Ignore
    public void TestSimpleArithmetic_testMatricesProductIgnore_bc12ac5a1ffe6af2ea4fd50c117b9c64() {
        assertEvalError("{ as.raw(1:3) %*% 1:3 }");
    }

    @Ignore
    public void TestSimpleArithmetic_testScalarsComplexIgnore_0dc33376658fd492af2c5beb032efdbf() {
        assertEval("{ x <- c(-1-2i,3+10i) ; y <- c(3+1i, -4+5i) ; y+x }");
    }

    @Ignore
    public void TestSimpleArithmetic_testScalarsComplexIgnore_46cb3430474fb02811820b09b2bcd950() {
        assertEval("{ x <- c(-1-2i,3+10i) ; y <- c(3+1i, -4+5i) ; y*x }");
    }

    @Ignore
    public void TestSimpleArithmetic_testScalarsRealIgnore_706f889093f4841d307059b60cb81c13() {
        assertEval("{ 1000000000*100000000000 }");
    }

    @Ignore
    public void TestSimpleArithmetic_testScalarsRealIgnore_85c78d2d490e3d28bc72254fbec91949() {
        assertEval("{ 1000000000L*1000000000 }");
    }

    @Ignore
    public void TestSimpleArithmetic_testScalarsRealIgnore_846b21508ff7d445e01b13f78cc32dba() {
        assertEval("{ 1000000000L*1000000000L }");
    }

    @Ignore
    public void TestSimpleArithmetic_testUnaryMinusAsFunctionComplexIgnore_cd4ef6b3e70982a4c95167396730ad4b() {
        assertEval("{ z <- (1+1i)[0] ; -z }");
    }

    @Ignore
    public void TestSimpleArithmetic_testUnaryMinusAsFunctionComplexIgnore_f8f74002ffea632d51fc3d3665458ddc() {
        assertEval("{ f <- function(z) { -z } ; f(1:3) ; f(c((0+0i)/0,1+1i)) }");
    }

    @Ignore
    public void TestSimpleArithmetic_testUnaryMinusAsFunctionIgnore_4c11e746d97889722bef95b2bdd24346() {
        assertEval("{ f <- function(z) { -z } ; f(1:3) ; f(1L) }");
    }

    @Ignore
    public void TestSimpleArithmetic_testUnaryMinusAsFunctionIgnore_f2913439e4ee1afd564679f72b140a69() {
        assertEval("{ f <- function(z) { -z } ; f(1:3) ; f(TRUE) }");
    }

    @Ignore
    public void TestSimpleArithmetic_testUnaryMinusComplexIgnore_b993a07efd537eb7df29f4eb2477101c() {
        assertEval("{ -c((1+0i)/0,2) }");
    }

    @Ignore
    public void TestSimpleArithmetic_testUnaryMinusErrors_c1f5e118009944a5b67f947745697a4a() {
        assertEvalError("{ z <- \"hello\" ; -z }");
    }

    @Ignore
    public void TestSimpleArithmetic_testUnaryMinusErrors_3ea860899d34a37019008b913240ce41() {
        assertEvalError("{ z <- c(\"hello\",\"hi\") ; -z }");
    }

    @Ignore
    public void TestSimpleArithmetic_testUnaryMinusErrors_3a5d9c20857e8cd1fdf6da7e6ba61ed0() {
        assertEvalError("{ f <- function(z) { -z } ; f(1:3) ; f(\"hello\") }");
    }

    @Ignore
    public void TestSimpleArithmetic_testUnaryNotRawIgnore_38e2346209ed5b661d4d085d731ec2eb() {
        assertEval("{ f <- function(arg) { !arg } ; f(as.raw(10)) ; f(matrix(as.raw(1:4),nrow=2 )) }");
    }

    @Ignore
    public void TestSimpleArithmetic_testVectorsLengthWarning_434cf402275d72887df7f3d5075408bc() {
        assertEvalWarning("{ 1:2+1:3 }");
    }

    @Ignore
    public void TestSimpleArithmetic_testVectorsLengthWarning_fb266e5d477400a227beb2a990776758() {
        assertEvalWarning("{ 1:3*1:2 }");
    }

    @Ignore
    public void TestSimpleArithmetic_testVectorsLengthWarning_61d2c11726af0b5cec1c3b100370b905() {
        assertEvalWarning("{ 1:3+c(1,2+2i) }");
    }

    @Ignore
    public void TestSimpleArithmetic_testVectorsLengthWarning_ea160ab7a388f1aea439e3233d7e21eb() {
        assertEvalWarning("{ c(1,2+2i)+1:3 }");
    }

    @Ignore
    public void TestSimpleArithmetic_testVectorsMatrixDimsDontMatch_4715846ee2436cdade5e4275aac886d9() {
        assertEvalError("{ m <- matrix(nrow=2, ncol=2, 1:4) ; m + 1:16 }");
    }

    @Ignore
    public void TestSimpleArithmetic_testVectorsNonConformable_2b9020c835ed09c8aa45ff026f9859aa() {
        assertEvalError("{ x <- 1:2 ; dim(x) <- 1:2 ; y <- 2:3 ; dim(y) <- 2:1 ; x + y }");
    }

    @Ignore
    public void TestSimpleArithmetic_testVectorsNonConformable_a631557f258a6d6c95c89ddc20e555f2() {
        assertEvalError("{ x <- 1:2 ; dim(x) <- 1:2 ; y <- 2:3 ; dim(y) <- c(1,1,2) ; x + y }");
    }

    @Ignore
    public void TestSimpleArithmetic_testVectorsOperationsComplexIgnore_9b81d167391e44e04a528a367013f806() {
        assertEval("{ z <- c(-1.5-1i,10) ; (z * z)[1] }");
    }

    @Ignore
    public void TestSimpleArithmetic_testVectorsOperationsComplexIgnore_0dae874162cc69c107cdd6f0c5ea334c() {
        assertEval("{ c(1+1i,3+2i) / 2 }");
    }

    @Ignore
    public void TestSimpleArithmetic_testVectorsOperationsComplexIgnore_15a6502f9ece8e54a080a3e20541165c() {
        assertEval("{ c(1,2,3+1i)^3 }");
    }

    @Ignore
    public void TestSimpleArithmetic_testVectorsOperationsIgnore_bc2cc92da6012e61c40e913719b41e8a() {
        assertEval("{ c(1,3) / c(2,4) }");
    }

    @Ignore
    public void TestSimpleAssignment_testAssign_283c9530c525c82a5e49b43433fdced9() {
        assertEvalNoOutput("{ a<-1 }");
    }

    @Ignore
    public void TestSimpleAssignment_testAssign_e7172f616e0946e808cf73fe8c5ba64b() {
        assertEvalNoOutput("{ a<-FALSE ; b<-a }");
    }

    @Ignore
    public void TestSimpleAssignment_testAssign_b21774dbc3b823d809cfaf4ee17527de() {
        assertEvalNoOutput("{ x = if (FALSE) 1 }");
    }

    @Ignore
    public void TestSimpleAssignment_testAssignFunctionLookup1_af5ff7016009f392e234cca594160ea3() {
        assertEval("f <- function(b) { c <- 42; c(1,1); }; f(0); f(1)");
    }

    @Ignore
    public void TestSimpleAssignment_testAssignFunctionLookup1_2346e3897adeba694188ec2ab21c1070() {
        assertEval("f <- function(b) { if (b) c <- 42; c(1,1); }; f(0); f(1)");
    }

    @Ignore
    public void TestSimpleAssignment_testAssignPoly1_66cf51299f299d2cd8bfa5c599824623() {
        assertEval("test <- function(b) { if (b) f <- function() { 42 }; g <- function() { if (!b) f <- function() { 43 }; f() }; g() }; c(test(FALSE), test(TRUE))");
    }

    @Ignore
    public void TestSimpleAssignment_testAssignShadowBuiltin1_f2d5da3c45411e2c079849343ea84875() {
        assertEval("f <- function(b) { c <- function(x,y) 42; c(1,1); }; f(0); f(1)");
    }

    @Ignore
    public void TestSimpleAssignment_testAssignShadowBuiltin1_b9c9722029283827d0a91f19bac45918() {
        assertEval("f <- function(b) { if (b) c <- function(x,y) 42; c(1,1); }; f(0); f(1)");
    }

    @Ignore
    public void TestSimpleAssignment_testDynamic_d66d832275659532e17a035d9554c549() {
        assertEval("{ l <- quote(x <- 1) ; f <- function() { eval(l) } ; x <- 10 ; f() ; x }");
    }

    @Ignore
    public void TestSimpleAssignment_testDynamic_e224a6d79056c025f24a2a9d1a73d019() {
        assertEval("{ l <- quote(x <- 1) ; f <- function() { eval(l) ; x <<- 10 ; get(\"x\") } ; f() }");
    }

    @Ignore
    public void TestSimpleAssignment_testSuperAssignIgnore_aa206594ebb10eb912cbc08e7c82e4e3() {
        assertEval("{ a <- c(1,2,3) ; f <- function() { a[2] <- 4 } ; list(f(),a) }");
    }

    @Ignore
    public void TestSimpleAssignment_testSuperAssignIgnore_cfdf1ec04d27a60bdfe3a1bea92933e6() {
        assertEvalNoOutput("{ x <<- 1 }");
    }

    @Ignore
    public void TestSimpleAssignment_testSuperAssignIgnore_437eb5c1cc18125d4b5896cf3d2b5365() {
        assertEvalNoOutput("{ x <<- 1 ; x }");
    }

    @Ignore
    public void TestSimpleBuiltins_testAbsIgnore_261d7e173c1caffcac87b3030f93a81c() {
        assertEval("{ abs(c(0/0,1i)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testAbsIgnore_c0cc055b696d0196df8961748dac97a4() {
        assertEval("{ exp(-abs((0+1i)/(0+0i))) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testAbsIgnore_0ab2d0f2d7030b273cd0e45daf435b57() {
        assertEval("{ abs(1:3) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testAbsIgnore_eb0e93fa1cbdf12456e6b7c849b0f670() {
        assertEval("{ abs(-1:-3) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testAbsIgnore_f9ca5d8354239b619dbd0b67d729e220() {
        assertEvalError("{ abs(NULL) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testAllIgnore_1cad38b2b58506e86b3faf337282af34() {
        assertEval("{ all(TRUE, TRUE, NA,  na.rm=TRUE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testAllIgnore_2b56cf245fc3518ca8c3daa8c70c7441() {
        assertEval("{ all(1) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testAllIgnore_91a6f9d5d41dc450755861f6e318c869() {
        assertEval("{ all(0) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testAllIgnore_b5c51ccc3f58394e01320c7b59736d24() {
        assertEval("{ all(TRUE,c(TRUE,TRUE),1) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testAllIgnore_e11f439dffd428996b1d680fede13a41() {
        assertEval("{ all(TRUE,c(TRUE,TRUE),1,0) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testAnyIgnore_a5514afb3c27ad5fad71696cb1db96a9() {
        assertEval("{ any(FALSE, NA,  na.rm=TRUE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testAnyIgnore_91043dd22cb7d3aab79a22019a52ea3f() {
        assertEvalWarning("{ any(1) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testAnyIgnore_b0a96f7fb16a6bf50fba85a11a8da034() {
        assertEvalWarning("{ any(0) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testAperm_32f22c3030902475114c0fb4882d3ea0() {
        assertEval("{ a = array(1:4,c(2,2)); b = aperm(a); c(a[1,1] == b[1,1], a[1,2] == b[2,1], a[2,1] == b[1,2], a[2,2] == b[2,2]) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testAperm_b8c345f580afff451e38c41a3a55ff01() {
        assertEval("{ a = array(1:24,c(2,3,4)); b = aperm(a); c(dim(b)[1],dim(b)[2],dim(b)[3]) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testAperm_f7e5d7608001661c62ccda8a927e658a() {
        assertEval("{ a = array(1:24,c(2,3,4)); b = aperm(a, resize=FALSE); c(dim(b)[1],dim(b)[2],dim(b)[3]) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testAperm_18e9d3c9755549c9b400b15ab8950c41() {
        assertEval("{ a = array(1:24,c(2,3,4)); b = aperm(a, c(2,3,1)); a[1,2,3] == b[2,3,1] }");
    }

    @Ignore
    public void TestSimpleBuiltins_testAperm_5c1fb0ab96b21921d05341372ae0aa2c() {
        assertEval("{ a = array(1:24,c(3,3,3)); b = aperm(a, c(2,3,1)); c(a[1,2,3] == b[2,3,1], a[2,3,1] == b[3,1,2], a[3,1,2] == b[1,2,3]) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testAperm_674dc3e594fa65d6d7e91a9911e91f02() {
        assertEval("{ a = array(1:24,c(3,3,3)); b = aperm(a, c(2,3,1), resize = FALSE); c(a[1,2,3] == b[2,3,1], a[2,3,1] == b[3,1,2], a[3,1,2] == b[1,2,3]) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testAperm_f0effd761c52fe6bf1a5d5c76ccc721f() {
        assertEval("{ a = array(1:24,c(2,3,4)); b = aperm(a, c(2,3,1), resize = FALSE); a[1,2,3] == b[2,1,2] }");
    }

    @Ignore
    public void TestSimpleBuiltins_testAperm_fc6d4e2ce3038c9b44e62938ed037b59() {
        assertEval("{ aperm(array(1:27,c(3,3,3)), c(1+1i,3+3i,2+2i))[1,2,3] == array(1:27,c(3,3,3))[1,3,2]; }");
    }

    @Ignore
    public void TestSimpleBuiltins_testAperm_f663b80fd121c4a4b2fe9d966eb3db55() {
        assertEvalError("{ aperm(c(1,2,3)); }");
    }

    @Ignore
    public void TestSimpleBuiltins_testAperm_6a90b304900b2f56fb170f26490d9bca() {
        assertEvalError("{ aperm(array(1,c(3,3,3)), c(1,2)); }");
    }

    @Ignore
    public void TestSimpleBuiltins_testAperm_ad567449416f42ba7d5a044a3ee92935() {
        assertEvalError("{ aperm(array(1,c(3,3,3)), c(1,2,1)); }");
    }

    @Ignore
    public void TestSimpleBuiltins_testAperm_d452fc9657b296292ea89b31c89a766b() {
        assertEvalError("{ aperm(array(1,c(3,3,3)), c(1,2,0)); }");
    }

    @Ignore
    public void TestSimpleBuiltins_testApplyIgnore_797cd316f3f859174c906d613c777e40() {
        assertEval("{ lapply(1:3, function(x) { 2*x }) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testApplyIgnore_5ed0951d3e7363f21bc554e405102229() {
        assertEval("{ lapply(1:3, function(x,y) { x*y }, 2) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testApplyIgnore_aad1bc65130fb0c42e2e3d991f1b3391() {
        assertEval("{ f <- function() { lapply(c(X=\"a\",Y=\"b\"), function(x) { c(a=x) })  } ; f() }");
    }

    @Ignore
    public void TestSimpleBuiltins_testAsCharacterIgnore_c803fc23a52fdc9950e5603f439b132f() {
        assertEval("{ as.character(list(1,2,3)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testAsCharacterIgnore_03efd474c6b2ac63cfa1f6d497c9cf80() {
        assertEval("{ as.character(list(c(\"hello\", \"hi\"))) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testAsCharacterIgnore_2f45a0dc44e788e9eaea83ed3fc488ad() {
        assertEval("{ as.character(list(list(c(\"hello\", \"hi\")))) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testAsCharacterIgnore_f0e99f0b6485990390645c5a6f6b13c3() {
        assertEval("{ as.character(list(c(2L, 3L))) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testAsCharacterIgnore_2ef5afd90d532194c1e0775974b91525() {
        assertEval("{ as.character(list(c(2L, 3L, 5L))) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testAsComplexIgnore_a234b535de865dc1374d86dc2a304cb0() {
        assertEval("{ as.complex(\"1e10+5i\") }");
    }

    @Ignore
    public void TestSimpleBuiltins_testAsComplexIgnore_f959c2432167aba7516572589c2a297b() {
        assertEval("{ as.complex(\"-.1e10+5i\") }");
    }

    @Ignore
    public void TestSimpleBuiltins_testAsComplexIgnore_4fff4d142baeef1724a393317f422bfe() {
        assertEval("{ as.complex(\"1e-2+3i\") }");
    }

    @Ignore
    public void TestSimpleBuiltins_testAsComplexIgnore_ca81945b0033de54e397d1df1719f69a() {
        assertEval("{ as.complex(\"+.1e+2-3i\") }");
    }

    @Ignore
    public void TestSimpleBuiltins_testAttach_000b04e3d397888dde95e4ec96036dd7() {
        assertEval("{ e <- new.env(); assign(\"x\", 1, e); attach(e, name = \"mine\"); x }");
    }

    @Ignore
    public void TestSimpleBuiltins_testAttach_4141d168d111ce4878b9ccd7cc4529f9() {
        assertEval("{ e <- new.env(); assign(\"x\", \"abc\", e); attach(e, 2); x }");
    }

    @Ignore
    public void TestSimpleBuiltins_testBuiltinPropagationIgnore_815238e2a76d61eb69db36c00e322f34() {
        assertEval("{ m <- matrix(1:6, nrow=2) ; attr(m,\"a\") <- 1 ;  aperm(m) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testBuiltinPropagationIgnore_d7181010a1cd39e67a56ceb71922fff9() {
        assertEval("{ x <- c(a=1, b=2) ; attr(x, \"myatt\") <- 1 ; sapply(1:2, function(z) {x}) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testBuiltinPropagationIgnore_d789eedbfc9166e0b7f70ef343f75e96() {
        assertEval("{ x <- c(a=1) ; attr(x, \"myatt\") <- 1 ; lapply(1:2, function(z) {x}) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testBuiltinPropagationIgnore_df9b3724960b222fffd20b6a1ef94ed5() {
        assertEval("{ m <- matrix(c(1,1,1,1), nrow=2) ; attr(m,\"a\") <- 1 ;  r <- eigen(m) ; r$vectors <- round(r$vectors, digits=5) ; r  }");
    }

    @Ignore
    public void TestSimpleBuiltins_testBuiltinPropagationIgnore_34276682124e7b74954e779277f54a3f() {
        assertEval("{ x <- 1 ; attr(x, \"myatt\") <- 1; round(exp(x), digits=5) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testBuiltinPropagationIgnore_dd00df1d23bd40731a3be30ec8fa4cbe() {
        assertEval("{ x <- c(a=TRUE) ; attr(x, \"myatt\") <- 1; rep(x,2) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testBuiltinPropagationIgnore_1c5a0061ff8753565f24001f9747bc4e() {
        assertEval("{ x <- c(a=1, b=2) ; attr(x, \"myatt\") <- 1; seq(x) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testCall_7d3147e26292301cfabf8939c17af430() {
        assertEval("{ f <- function(a, b) { a + b } ; l <- call(\"f\", 2, 3) ; eval(l) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testCall_ac5601b7f27d60cead4d93b849fd38ca() {
        assertEval("{ f <- function(a, b) { a + b } ; x <- 1 ; y <- 2 ; l <- call(\"f\", x, y) ; x <- 10 ; eval(l) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testCastsIgnore_fd41615e647202e9a7f994c633674ca4() {
        assertEval("{ as.matrix(1) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testCastsIgnore_c9e133e0d7fd2ee951acf79fd6d3f133() {
        assertEval("{ as.matrix(1:3) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testCastsIgnore_9887ea3892849f36e6cad0e4fc3793fa() {
        assertEval("{ x <- 1:3; z <- as.matrix(x); x }");
    }

    @Ignore
    public void TestSimpleBuiltins_testCastsIgnore_e446fc18e1ac80f3580fd22c9214d841() {
        assertEval("{ x <- 1:3 ; attr(x,\"my\") <- 10 ; attributes(as.matrix(x)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testCastsIgnore_a695ef4253fbba58b28a3e8cbcfb1987() {
        assertEval("{ as.complex(as.double(c(1+1i,1+1i))) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testCastsIgnore_1785fd6355c91d5f76f56cd5bd8eac86() {
        assertEval("{ as.complex(as.raw(c(1+1i,1+1i))) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testCatIgnore_01ac467ff40598b5a055378fc7882537() {
        assertEvalNoNL("{ cat(\"hi\",NULL,\"hello\",sep=\"-\") }");
    }

    @Ignore
    public void TestSimpleBuiltins_testCatIgnore_4949a7df83738286ea025e86159c9cdc() {
        assertEvalNoNL("{ cat(\"hi\",integer(0),\"hello\",sep=\"-\") }");
    }

    @Ignore
    public void TestSimpleBuiltins_testCbindIgnore_c292a9a2047519d8fd24923adebb0ad2() {
        assertEval("{ cbind(list(1,2), TRUE, \"a\") }");
    }

    @Ignore
    public void TestSimpleBuiltins_testCbindIgnore_849d2f7200b6d113f749abbc67d41a7d() {
        assertEval("{ cbind(1:3,1:2) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testCharUtilsIgnore_864e89c688384c8cc67d1b4676ff314d() {
        assertEval("{ tolower(1E100) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testCharUtilsIgnore_69433b6491feff8204434af6a79f9307() {
        assertEval("{ toupper(1E100) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testCharUtilsIgnore_8f5f00293e9bfb6ac9aab0e3e6c88cf8() {
        assertEval("{ m <- matrix(\"hi\") ; toupper(m) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testCharUtilsIgnore_e5ad5f71aaa8302b8bcddddde53fd68e() {
        assertEval("{ toupper(c(a=\"hi\", \"hello\")) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testCharUtilsIgnore_ec31b79bc63b78f141adde800c2de5ab() {
        assertEval("{ tolower(c(a=\"HI\", \"HELlo\")) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testCharUtilsIgnore_ddbafed30934d43a3a0e4862fb6bd0db() {
        assertEval("{ tolower(NA) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testCharUtilsIgnore_73009820a93846c10cb6c65b68e5b7fa() {
        assertEval("{ toupper(NA) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testChol_0c871276d1ef0a12733f4763eca31305() {
        assertEval("{ chol(1) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testChol_56c7d9d1a9d02d3730de6ef5e4b085b8() {
        assertEval("{ round( chol(10), digits=5) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testChol_7b9b9fe7c5e51dfc97d44dd7ce4cc95a() {
        assertEval("{ m <- matrix(c(5,1,1,3),2) ; round( chol(m), digits=5 ) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testChol_887c0d3033dcb17c875cf7a89313563c() {
        assertEvalError("{ m <- matrix(c(5,-5,-5,3),2,2) ; chol(m) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testColStatsArray_de0f9a9ff80104c9d0ef40a135515034() {
        assertEval("{ a = colSums(array(1:24,c(2,3,4))); d = dim(a); c(d[1],d[2]) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testColStatsArray_a30963b6dca5e14240a90e527026ee60() {
        assertEval("{ a = colSums(array(1:24,c(2,3,4))); length(a) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testColStatsArray_582b93151f22d1875bb3d55b96a98b49() {
        assertEval("{ a = colSums(array(1:24,c(2,3,4))); c(a[1,1],a[2,2],a[3,3],a[3,4]) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testColumnsRowsStatIgnore_8ca9d6c7f776a8e3441d264e1da328a6() {
        assertEval("{ m <- matrix(1:6, nrow=2) ; colMeans(m) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testColumnsRowsStatIgnore_42f4dcf92af03ea106b9ee137d80a60b() {
        assertEval("{ m <- matrix(1:6, nrow=2) ; rowMeans(x = m, na.rm = TRUE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testColumnsRowsStatIgnore_f6e099a48acc0dc03f8df25fddeaa2ac() {
        assertEval("{ m <- matrix(1:6, nrow=2) ; rowSums(x = m) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testColumnsRowsStatIgnore_5a6a0c0306ea58dc330442a0ee35ac57() {
        assertEval("{ m <- matrix(c(1,2,3,4,5,6), nrow=2) ; colMeans(m) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testColumnsRowsStatIgnore_9589a0af44218e0e9ffcf6a4ddb95ee3() {
        assertEval("{ m <- matrix(c(1,2,3,4,5,6), nrow=2) ; rowMeans(m) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testColumnsRowsStatIgnore_27fd0c0df27edacc427f026c6f82c11e() {
        assertEval("{ m <- matrix(c(1,2,3,4,5,6), nrow=2) ; colSums(m) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testColumnsRowsStatIgnore_7a7b23e72604196aca2933d8326855f8() {
        assertEval("{ m <- matrix(c(1,2,3,4,5,6), nrow=2) ; rowSums(m) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testColumnsRowsStatIgnore_6e3237bc98188617dc175a91480d9f8a() {
        assertEval("{ m <- matrix(c(NA,2,3,4,NA,6), nrow=2) ; rowSums(m) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testColumnsRowsStatIgnore_97ed75fc969a4330d9764e77572c5057() {
        assertEval("{ m <- matrix(c(NA,2,3,4,NA,6), nrow=2) ; rowSums(m, na.rm = TRUE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testColumnsRowsStatIgnore_cf3ce4597e64537f5ed0c8e1c5bc2649() {
        assertEval("{ m <- matrix(c(NA,2,3,4,NA,6), nrow=2) ; rowMeans(m, na.rm = TRUE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testColumnsRowsStatIgnore_9f1ea14f9baa5e49245d4f90538c3b1d() {
        assertEval("{ m <- matrix(c(NA,2,3,4,NA,6), nrow=2) ; colSums(m) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testColumnsRowsStatIgnore_cd2c57bffaff581a9e8b2107b3148b58() {
        assertEval("{ m <- matrix(c(NA,2,3,4,NA,6), nrow=2) ; colSums(na.rm = TRUE, m) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testColumnsRowsStatIgnore_2b787e31b5232423c06c52f73e5df1c6() {
        assertEval("{ m <- matrix(c(NA,2,3,4,NA,6), nrow=2) ; colMeans(m) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testColumnsRowsStatIgnore_2f427a36497e0dc01a2611f5aa23ae7b() {
        assertEval("{ m <- matrix(c(NA,2,3,4,NA,6), nrow=2) ; colMeans(m, na.rm = TRUE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testColumnsRowsStatIgnore_245eed182ce6e800317cc04ea2db8076() {
        assertEval("{ colMeans(matrix(as.complex(1:6), nrow=2)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testColumnsRowsStatIgnore_c9f4a9f49a298a830f36751055417164() {
        assertEval("{ colMeans(matrix((1:6)*(1+1i), nrow=2)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testColumnsRowsStatIgnore_e27a7ec7efc72290832ff500ab7fdbbd() {
        assertEval("{ rowSums(matrix(as.complex(1:6), nrow=2)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testColumnsRowsStatIgnore_0222b72afb3af3984c867d68ee9c340f() {
        assertEval("{ rowSums(matrix((1:6)*(1+1i), nrow=2)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testColumnsRowsStatIgnore_8214d8fc710c76862499f1c9b1a31121() {
        assertEval("{ rowMeans(matrix(as.complex(1:6), nrow=2)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testColumnsRowsStatIgnore_15d9ab20e0f0df878fa345ad14ce4245() {
        assertEval("{ rowMeans(matrix((1:6)*(1+1i), nrow=2)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testColumnsRowsStatIgnore_cfbfed37d84d4a557a3944e4001685a4() {
        assertEval("{ colSums(matrix(as.complex(1:6), nrow=2)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testColumnsRowsStatIgnore_b62078f5eeef7282e5eff2a59a8d8cd8() {
        assertEval("{ colSums(matrix((1:6)*(1+1i), nrow=2)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testColumnsRowsStatIgnore_ef0e18bdd086f0183fcc8fae77cc4d1a() {
        assertEval("{ o <- outer(1:3, 1:4, \"<\") ; colSums(o) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testCombineBroken_d365e1ffe5f8c886f6d1911c69b3af00() {
        assertEval("{ c(1i,0/0) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testComplexIgnore_6c296b051839b1865e7b24f04e0f89d5() {
        assertEval("{ x <- 1:2 ; attr(x,\"my\") <- 2 ; Im(x) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testComplexIgnore_ebb6e003d79ccc9419c0bbc4c4601d12() {
        assertEval("{ x <- c(1+2i,3-4i) ; attr(x,\"my\") <- 2 ; Im(x) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testComplexIgnore_0a640363497df7e0fff841acd48b8679() {
        assertEval("{ x <- 1:2 ; attr(x,\"my\") <- 2 ; Re(x) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testComplexIgnore_cd6019c801f0cbbb3b00ecbde91958c5() {
        assertEval("{ x <- c(1+2i,3-4i) ; attr(x,\"my\") <- 2 ; Re(x) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testCorIgnore_13b78c66b0e72ebed23e724262a27546() {
        assertEval("{ round( cor(cbind(c(10,5,4,1), c(2,5,10,5))), digits=5 ) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testCrossprod_7f9549017d66ad3dd1583536fa7183d7() {
        assertEval("{ x <- 1:6 ; crossprod(x) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testCrossprod_1c6fdfbd19321f1f57a6f9260789424a() {
        assertEval("{ x <- 1:2 ; crossprod(t(x)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testCrossprod_0ceb7477eceaa0684310f07ef6b6865c() {
        assertEval("{ crossprod(1:3, matrix(1:6, ncol=2)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testCrossprod_57b1bcccff6a1f41d6a0c82a658a3c52() {
        assertEval("{ crossprod(t(1:2), 5) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testCrossprod_2770157f2b02bfda92abe04278a245f8() {
        assertEval("{ crossprod(c(1,NA,2), matrix(1:6, ncol=2)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testCumulativeSumBroken_29fdcc5a5db08a57fa538ba6ea36df62() {
        assertEval("{ cumsum(c(1,2,3,0/0,5)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testCumulativeSumBroken_c4e74421afc1541ec09c1258dd016111() {
        assertEval("{ cumsum(c(1,0/0,5+1i)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testCumulativeSumBroken_c798b06052d4528aca37769d38a0f9af() {
        assertEval("{ cumsum(as.raw(1:6)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testCumulativeSumBroken_24579242149f490e91e8b1b7fc76f4e9() {
        assertEval("{ cumsum(rep(1e308, 3) ) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testCumulativeSumBroken_9e68f6a2cfecca2814fd572d9d3dc519() {
        assertEval("{ cumsum(c(1e308, 1e308, NA, 1, 2)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testCumulativeSumBroken_e1af5bf2238f58b9e00ba5f815e46a59() {
        assertEval("{ cumsum(c(2000000000L, 2000000000L)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testCumulativeSumBroken_e41ac0de20a9dba0b5c5c897e46d2ddb() {
        assertEval("{ cumsum(c(-2147483647L, -1L)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testCumulativeSumBroken_598bb2dd748d2cd878a7312e7a0935c9() {
        assertEval("{ cumsum((1:6)*(1+1i)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testDefaultArgsIgnore_da411f3d8d8a722a471e77966e8e1135() {
        assertEval("{ length(array(dim=c(1,0,2,3))) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testDefaultArgsIgnore_3cc1186607b6ef41bdbc0c66fc278b3a() {
        assertEval("{ dim(array(dim=c(2.1,2.9,3.1,4.7))) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testDefaultArgsIgnore_62c7f6f4b6bf06a81284d05487afc849() {
        assertEvalError("{ array(dim=c(-2,2)); }");
    }

    @Ignore
    public void TestSimpleBuiltins_testDefaultArgsIgnore_6298ff4d222c7787e6c111563ac6a26a() {
        assertEvalError("{ array(dim=c(-2,-2)); }");
    }

    @Ignore
    public void TestSimpleBuiltins_testDelayedAssign_8ec95e38ecb3a999ffba3e7abc6ffb72() {
        assertEval("{ delayedAssign(\"x\", y); y <- 10; x }");
    }

    @Ignore
    public void TestSimpleBuiltins_testDelayedAssign_e828fbbef10258dab93aa4d7350c38f9() {
        assertEval("{ delayedAssign(\"x\", a+b); a <- 1 ; b <- 3 ; x }");
    }

    @Ignore
    public void TestSimpleBuiltins_testDelayedAssign_cedc0d1753c9e0fc71d5868f5654e3ef() {
        assertEval("{ f <- function() { delayedAssign(\"x\", y); y <- 10; x  } ; f() }");
    }

    @Ignore
    public void TestSimpleBuiltins_testDelayedAssign_79fb1d399e2b39a496dac5a9749fb873() {
        assertEval("{ h <- new.env(parent=emptyenv()) ; delayedAssign(\"x\", y, h, h) ; assign(\"y\", 2, h) ; get(\"x\", h) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testDelayedAssign_af327b1b6a16f6b664839a659452d6ff() {
        assertEval("{ h <- new.env(parent=emptyenv()) ; assign(\"x\", 1, h) ; delayedAssign(\"x\", y, h, h) ; assign(\"y\", 2, h) ; get(\"x\", h) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testDelayedAssign_b0a8cc01cf8e5fc94f5e4084097107ad() {
        assertEval("{ f <- function(...) { delayedAssign(\"x\", ..1) ; y <<- x } ; f(10) ; y }");
    }

    @Ignore
    public void TestSimpleBuiltins_testDelayedAssign_2650fc25df477fca9f65b4ae42030ddc() {
        assertEval("{ f <- function() { delayedAssign(\"x\", 3); delayedAssign(\"x\", 2); x } ; f() }");
    }

    @Ignore
    public void TestSimpleBuiltins_testDelayedAssign_8c59e6c2915b2b15a962ae541292c0db() {
        assertEval("{ f <- function() { x <- 4 ; delayedAssign(\"x\", y); y <- 10; x  } ; f() }");
    }

    @Ignore
    public void TestSimpleBuiltins_testDelayedAssign_83064c7d347757ad66074441e8cfc90e() {
        assertEvalError("{ f <- function() { delayedAssign(\"x\", y); delayedAssign(\"y\", x) ; x } ; f() }");
    }

    @Ignore
    public void TestSimpleBuiltins_testDeparse_1dc435ef27d6d10df26ec2271cb67316() {
        assertEval("{ f <- function(x) { deparse(substitute(x)) } ; f(a + b * (c - d)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testDet_0119e3eeb33ab4a029ba7826ddc06536() {
        assertEval("{ det(matrix(c(1,2,4,5),nrow=2)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testDet_5e1459250de6d93f03e5e5eaaccd1afc() {
        assertEval("{ det(matrix(c(1,-3,4,-5),nrow=2)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testDet_9c562345cefeea163f138973f9d0f2a1() {
        assertEval("{ det(matrix(c(1,0,4,NA),nrow=2)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testDiagnostics_f20f62c82be750e78cc720a71705d1f4() {
        assertEvalError("{ f <- function() { stop(\"hello\",\"world\") } ; f() }");
    }

    @Ignore
    public void TestSimpleBuiltins_testEigen_5f76ba83937083ccca6e7d8fca5c8d43() {
        assertEval("{ r <- eigen(matrix(rep(1,4), nrow=2), only.values=FALSE) ; round( r$vectors, digits=5 ) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testEigen_3a0973319dd9e19b5d218165db6c191e() {
        assertEval("{ r <- eigen(matrix(rep(1,4), nrow=2), only.values=FALSE) ; round( r$values, digits=5 ) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testEigen_115e6b72c47df2b5d5700b273b70c533() {
        assertEval("{ eigen(10, only.values=FALSE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testEigen_0449327e2827cfc14c352f69bb2d6863() {
        assertEval("{ r <- eigen(matrix(c(1,2,2,3), nrow=2), only.values=FALSE); round( r$vectors, digits=5 ) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testEigen_1807792fd12f35acb23589be46cf6b57() {
        assertEval("{ r <- eigen(matrix(c(1,2,2,3), nrow=2), only.values=FALSE); round( r$values, digits=5 ) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testEigen_a7d1b10ab33353c276caf5c71013af50() {
        assertEval("{ r <- eigen(matrix(c(1,2,3,4), nrow=2), only.values=FALSE); round( r$vectors, digits=5 ) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testEigen_83d97801023043df2de8fa2831ea80e5() {
        assertEval("{ r <- eigen(matrix(c(1,2,3,4), nrow=2), only.values=FALSE); round( r$values, digits=5 ) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testEigen_e1ef8addd5b3fea26321432b42bf54e5() {
        assertEval("{ r <- eigen(matrix(c(3,-2,4,-1), nrow=2), only.values=FALSE); round( r$vectors, digits=5 ) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testEigen_19ec900b70611f935fb95e980df000f3() {
        assertEval("{ r <- eigen(matrix(c(3,-2,4,-1), nrow=2), only.values=FALSE); round( r$values, digits=5 ) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testEnvironmentIgnore_c29f313075292391e27de42119da385a() {
        assertEval("{ h <- new.env(parent=globalenv()) ; assign(\"x\", 10, h, inherits=TRUE) ; x }");
    }

    @Ignore
    public void TestSimpleBuiltins_testEnvironmentIgnore_ce30ddfe4bd336aa1ca03e769de77455() {
        assertEval("{ ph <- new.env() ; h <- new.env(parent=ph) ; assign(\"x\", 10, h, inherits=TRUE) ; x }");
    }

    @Ignore
    public void TestSimpleBuiltins_testEnvironmentIgnore_f9bf2bff62b5ca445def1eed9808f98c() {
        assertEval("{ plus <- function(x) { function(y) x + y } ; plus_one <- plus(1) ; ls(environment(plus_one)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testEnvironmentIgnore_0902b89753b80fe43a8612bd6c00d063() {
        assertEval("{ ls(.GlobalEnv) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testEnvironmentIgnore_5482bc17285fec304815fd90301c9e13() {
        assertEval("{ x <- 1 ; ls(.GlobalEnv) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testEnvironmentIgnore_067a1395bae2eadd465e38a5799ca76a() {
        assertEvalError("{ ph <- new.env(parent=emptyenv()) ; h <- new.env(parent=ph) ; assign(\"x\", 10, h, inherits=TRUE) ; get(\"x\", ph)}");
    }

    @Ignore
    public void TestSimpleBuiltins_testEnvironmentIgnore_60bf41382750ac0f4de965f761a2fcf7() {
        assertEvalError("{ ph <- new.env() ; h <- new.env(parent=ph) ; assign(\"x\", 2, h) ; assign(\"x\", 10, h, inherits=TRUE) ; get(\"x\", ph)}");
    }

    @Ignore
    public void TestSimpleBuiltins_testEval_df5a9c0a0569879276fa81b87dddc5cf() {
        assertEval("{ eval(quote(x+x), list(x=1)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testEval_046c5969a889af57d7ea19d1fba119d6() {
        assertEval("{ y <- 2; eval(quote(x+y), list(x=1)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testEval_5b956e0508e3402588200db72e33861f() {
        assertEval("{ y <- 2; x <- 4; eval(x + y, list(x=1)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testEval_b2e8a12bd61dc527a9bc79b8c43a380f() {
        assertEval("{ y <- 2; x <- 2 ; eval(quote(x+y), -1) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testExp_604f92586ff1b698d6b752cce3248f1e() {
        assertEval("{ round( exp(c(1+1i,-2-3i)), digits=5 ) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testExp_615369efc779cc2d92f0f1998762dc35() {
        assertEval("{ round( exp(1+2i), digits=5 ) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testFFT_7d15c7af36066c109da585156e650924() {
        assertEval("{ fft(1:4) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testFFT_f1ae7f45f01309beee55de626238e7c3() {
        assertEval("{ fft(1:4, inverse=TRUE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testFFT_29d449480364092bd0ea8a833767b31e() {
        assertEval("{ fft(10) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testFFT_f64cc856ecf7295f8f5b1c98bf346710() {
        assertEval("{ fft(cbind(1:2,3:4)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testFileListing_9646bfd3fb553824f1f54cc5d04b8219() {
        assertEval("{ list.files(\"test/r/simple/data/tree1\") }");
    }

    @Ignore
    public void TestSimpleBuiltins_testFileListing_c3407928ac3dcbd4ed94ca586c8fa3bd() {
        assertEval("{ list.files(\"test/r/simple/data/tree1\", recursive=TRUE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testFileListing_b71b321a5f8b4e1665e1e8c55dfc00f5() {
        assertEval("{ list.files(\"test/r/simple/data/tree1\", recursive=TRUE, pattern=\".*dummy.*\") }");
    }

    @Ignore
    public void TestSimpleBuiltins_testFileListing_b36b504faedcd110cf3480d0627a4990() {
        assertEval("{ list.files(\"test/r/simple/data/tree1\", recursive=TRUE, pattern=\"dummy\") }");
    }

    @Ignore
    public void TestSimpleBuiltins_testFileListing_de580ef8e4242ba05e2ab96a9e21d936() {
        assertEval("{ list.files(\"test/r/simple/data/tree1\", pattern=\"*.tx\") }");
    }

    @Ignore
    public void TestSimpleBuiltins_testGetClassIgnore_04e1bbb35c3306f6feb801b5cce80b88() {
        assertEval("{x<-seq(1,10);class(x)}");
    }

    @Ignore
    public void TestSimpleBuiltins_testGetIgnore_64afee6cadb778dda13b25a2f3f9ecef() {
        assertEval("{y<-function(){y<-2;get(\"y\",mode=\"closure\",inherits=FALSE);};y();}");
    }

    @Ignore
    public void TestSimpleBuiltins_testIdentical_c46eaf60fda944bdf1391b5fe9af0427() {
        assertEval("{ identical(1,1) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testIdentical_53fdb3573317b847b951f1bb6b1d8ea0() {
        assertEval("{ identical(1L,1) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testIdentical_959b063ad8742ea07448fc45ba8f9851() {
        assertEval("{ identical(1:3, c(1L,2L,3L)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testIdentical_0538458b54dce047351d6fe4728461d7() {
        assertEval("{ identical(0/0,1[2]) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testIdentical_e9828bc94f4f46dc68f975a39942f654() {
        assertEval("{ identical(list(1, list(2)), list(list(1), 1)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testIdentical_1bd4e6954bc44911ff58137eb71e3c2c() {
        assertEval("{ identical(list(1, list(2)), list(1, list(2))) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testIdentical_3dd8c26fc61d38a1308e5199dfaeb876() {
        assertEval("{ x <- 1 ; attr(x, \"my\") <- 10; identical(x, 1) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testIdentical_329bfbf3d8ef2c8dccff787144ebe4c5() {
        assertEval("{ x <- 1 ; attr(x, \"my\") <- 10; y <- 1 ; attr(y, \"my\") <- 10 ; identical(x,y) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testIdentical_905c81c2be1d34a4bba411f19c71b4ae() {
        assertEval("{ x <- 1 ; attr(x, \"my\") <- 10; y <- 1 ; attr(y, \"my\") <- 11 ; identical(x,y) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testIdentical_6c7bc412e522d929c5a5f2071ca26ec9() {
        assertEval("{ x <- 1 ; attr(x, \"hello\") <- 2 ; attr(x, \"my\") <- 10;  attr(x, \"hello\") <- NULL ; y <- 1 ; attr(y, \"my\") <- 10 ; identical(x,y) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testInheritsIgnore_d0dc6389c924878311546ba61d753a22() {
        assertEval("{x <- 10;class(x) <- c(\"a\", \"b\");inherits(x, 2, c(TRUE)) ;}");
    }

    @Ignore
    public void TestSimpleBuiltins_testInheritsIgnore_89e7444d88aeaed136ad761742bfd5e4() {
        assertEval("{x <- 10;class(x) <- c(\"a\", \"b\");inherits(x, \"a\", 1) ;}");
    }

    @Ignore
    public void TestSimpleBuiltins_testInvocationIgnore_6024770f1412c264dd004f2fa8bc6fbf() {
        assertEval("{ round( rnorm(1,), digits = 5 ) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testInvocationIgnore_dd3e0cc9f1a660be34f8d72900973743() {
        assertEval("{ f <- function(...) { l <- list(...) ; l[[1]] <- 10; ..1 } ; f(11,12,13) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testInvocationIgnore_52f3eb5641c6781b78df1fadd9026fd4() {
        assertEval("{ g <- function(...) { length(list(...)) } ; f <- function(...) { g(..., ...) } ; f(z = 1, g = 31) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testInvocationIgnore_1258dbcba01e5d764684be0e540347c1() {
        assertEval("{ g <- function(...) { `-`(...) } ; g(1,2) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testInvocationIgnore_a3771a811b477ac7315bd35bcf519731() {
        assertEval("{ f <- function(...) { list(a=1,...) } ; f(b=2,3) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testInvocationIgnore_a8ec33ddd003e2f4f13be2ec0d07b6d3() {
        assertEval("{ f <- function(...) { substitute(...) } ; f(x + z) } ");
    }

    @Ignore
    public void TestSimpleBuiltins_testInvocationIgnore_c0649b33488ef441844f88cbeb22d470() {
        assertEval("{ p <- function(prefix, ...) { cat(prefix, ..., \"\n\") } ; p(\"INFO\", \"msg:\", \"Hello\", 42) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testInvocationIgnore_d9a5cb384d79347b34d55b8293316a42() {
        assertEval("{ f <- function(...) { g <- function() { list(...)$a } ; g() } ; f(a=1) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testInvocationIgnore_aa735a388a824b851e914305a0ee78ec() {
        assertEval("{ f <- function(...) { args <- list(...) ; args$name } ; f(name = 42) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testInvocationIgnore_e7dd2cd652f2b8c1a31a90832603d4c5() {
        assertEvalError("{ matrix(x=1) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testInvocationIgnore_53d1bf6a3bf98883a70a360da169055c() {
        assertEvalError("{ max(1,2,) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testLogIgnore_052ed04e88403025c80c488866a0f346() {
        assertEval("{ m <- matrix(1:4, nrow=2) ; round( log10(m), digits=5 )  }");
    }

    @Ignore
    public void TestSimpleBuiltins_testLogIgnore_6568d70e4d076fc4b14b58158162a0ea() {
        assertEval("{ x <- c(a=1, b=10) ; round( c(log(x), log10(x), log2(x)), digits=5 ) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testLookupIgnore_7e5d40be5a03aac06880b44eefa7d94b() {
        assertEval("{ f <- function(z) { exists(\"z\") } ; f(a) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testLookupIgnore_7623faf4c356905dacd205a8b10eac15() {
        assertEval("{ g <- function() { assign(\"myfunc\", function(i) { sum(i) });  f <- function() { lapply(2, \"myfunc\") } ; f() } ; g() }");
    }

    @Ignore
    public void TestSimpleBuiltins_testLookupIgnore_2c371d6a6d4b74a871402788dbf16cf8() {
        assertEval("{ myfunc <- function(i) { sum(i) } ; g <- function() { assign(\"z\", 1);  f <- function() { lapply(2, \"myfunc\") } ; f() } ; g() }");
    }

    @Ignore
    public void TestSimpleBuiltins_testLookupIgnore_fc0e56627d1b08ab2d6c38875a68a1f0() {
        assertEval("{ g <- function() { f <- function() { assign(\"myfunc\", function(i) { sum(i) }); lapply(2, \"myfunc\") } ; f() } ; g() }");
    }

    @Ignore
    public void TestSimpleBuiltins_testLookupIgnore_2deae78feff592acd7d61159c8e39ea7() {
        assertEval("{ g <- function() { myfunc <- function(i) { i+i } ; f <- function() { lapply(2, \"myfunc\") } ; f() } ; g() }");
    }

    @Ignore
    public void TestSimpleBuiltins_testLowerTriangular_d0f253a7c6e1e06bb5cf39dbff9f01da() {
        assertEval("{ m <- matrix(1:6, nrow=2) ;  lower.tri(m, diag=TRUE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testLowerTriangular_0ba0d133686dd0481614017fbd5e5b41() {
        assertEval("{ m <- matrix(1:6, nrow=2) ;  lower.tri(m, diag=FALSE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testLowerTriangular_44ba325a12bc689011ed5350658dabb6() {
        assertEval("{ lower.tri(1:3, diag=TRUE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testLowerTriangular_29e7f74c119f3fd2dff006792c5fa9a1() {
        assertEval("{ lower.tri(1:3, diag=FALSE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testMatMultIgnore_e9ba9d6fa9abe7cec2ddbabcc73934ca() {
        assertEval("{ matrix(c(1+1i,2-2i,3+3i,4-4i), 2) %*% matrix(c(5+5i,6-6i,7+7i,8-8i), 2) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testMatMultIgnore_864ab8a27b006789bddc33fbf08a681d() {
        assertEval("{ matrix(c(3+3i,1-1i,2+2i,0-0i,1+1i,2-2i), 2) %*% matrix(c(1+1i,0-0i,4+4i,2-2i,1+1i,0-0i), 3) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testMatMultIgnore_2a28fb03fdd28d0687ea97640678c7c5() {
        assertEval("{ c(1+1i,2-2i,3+3i) %*% c(4-4i,5+5i,6-6i) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testMatMultIgnore_500c9fe5e23232d488b23dea0ffe60e6() {
        assertEval("{ matrix(c(3+3i,1-1i,2+2i,0-0i,1+1i,2-2i),2) %*% c(1+1i,0-0i,4+4i) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testMatMultIgnore_bd7d1161309480785b4881fa0f001408() {
        assertEval("{ c(1+1i,0-0i,4+4i) %*% matrix(c(3+3i,1-1i,2+2i,0-0i,1+1i,2-2i),3) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testMatchIgnore_048ab83fbf746ab7b0de92f083754c50() {
        assertEval("{ match(2,c(1,2,3)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testMatchIgnore_4b9c00763f8d3b8f32effe9cf00561c6() {
        assertEval("{ match(c(1,2,3,4,5),c(1,2,1,2)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testMatchIgnore_939487ea836b5aac7a33fa6875c20339() {
        assertEval("{ match(\"hello\",c(\"I\", \"say\", \"hello\", \"world\")) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testMatchIgnore_354af2561e4e24ce3b2b61b15e126ce8() {
        assertEval("{ match(c(\"hello\", \"say\"),c(\"I\", \"say\", \"hello\", \"world\")) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testMatrixIgnore_f5dba0a59ab80b80d211e6e6fee198de() {
        assertEvalWarning("{ matrix(c(1,2,3,4),3,2) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testMatrixIgnore_8daf811c43e5de9f9027463997632ce6() {
        assertEvalWarning("{ matrix(1:4,3,2) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testMaximumIgnore_9669c97c2ea4e1d1253ad005c5ca32c9() {
        assertEval("{ max(1:10, 100:200, c(4.0, 5.0), c(TRUE,FALSE,NA)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testMaximumIgnore_dc0861ab168a5dfb771bd75705f64484() {
        assertEval("{ max(c(\"hi\",\"abbey\",\"hello\")) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testMaximumIgnore_05c8d18859b5c967c43445aa5d36985c() {
        assertEval("{ max(\"hi\",\"abbey\",\"hello\") }");
    }

    @Ignore
    public void TestSimpleBuiltins_testMinimumIgnore_439b91bb3000e058b9736056b15556a1() {
        assertEval("{ min(1:10, 100:200, c(4.0, 5.0), c(TRUE,FALSE,NA)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testMinimumIgnore_6ff5d3958c466ce8176bc44372e64494() {
        assertEval("{ min(c(\"hi\",\"abbey\",\"hello\")) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testMinimumIgnore_c38784d03f763b9b7ba319a4e709ad53() {
        assertEval("{ min(\"hi\",\"abbey\",\"hello\") }");
    }

    @Ignore
    public void TestSimpleBuiltins_testMinimumIgnore_e8d15c4a706047697bad794ac2370a27() {
        assertEval("{ min(\"hi\",100) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testMissingIgnore_cf62337ead8caecb2e4db39b971a6823() {
        assertEval("{ f <- function(a = 2 + 3) { missing(a) } ; f() }");
    }

    @Ignore
    public void TestSimpleBuiltins_testMissingIgnore_e3ec4820900994d734d0199b41a505ab() {
        assertEval("{ f <- function(a = z) { missing(a) } ; f() }");
    }

    @Ignore
    public void TestSimpleBuiltins_testMissingIgnore_14a03fde115ece14b0e877fd4bf28ad0() {
        assertEval("{ f <- function(a = 2 + 3) { a;  missing(a) } ; f() }");
    }

    @Ignore
    public void TestSimpleBuiltins_testMissingIgnore_0da52004f0b9453ad6deab5e0b49a111() {
        assertEval("{ f <- function(a = z) {  g(a) } ; g <- function(b) { missing(b) } ; f() }");
    }

    @Ignore
    public void TestSimpleBuiltins_testMissingIgnore_3b1c18d77df4f57cd223b95c8c205d89() {
        assertEval("{ f <- function(a = z, z) {  g(a) } ; g <- function(b) { missing(b) } ; f() }");
    }

    @Ignore
    public void TestSimpleBuiltins_testMissingIgnore_12f97d45e336adc392898885f48afa76() {
        assertEval("{ f <- function(a) { g(a) } ; g <- function(b=2) { missing(b) } ; f() }");
    }

    @Ignore
    public void TestSimpleBuiltins_testMissingIgnore_a96249c626958ddb13c95b4628e7f318() {
        assertEval("{ f <- function(x = y, y = x) { g(x, y) } ; g <- function(x, y) { missing(x) } ; f() }");
    }

    @Ignore
    public void TestSimpleBuiltins_testMissingIgnore_fc5302d7e40c71c48b09f7e6fcf1df6d() {
        assertEval("{ f <- function(x) { missing(x) } ; f(a) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testMissingIgnore_20756d2c3aaa3afd4ad6f87416f461ea() {
        assertEval("{ f <- function(a) { g <- function(b) { before <- missing(b) ; a <<- 2 ; after <- missing(b) ; c(before, after) } ; g(a) } ; f() }");
    }

    @Ignore
    public void TestSimpleBuiltins_testMissingIgnore_2c7389435b7285c22a1e276db60a1c8e() {
        assertEval("{ f <- function(...) { g(...) } ;  g <- function(b=2) { missing(b) } ; f() }");
    }

    @Ignore
    public void TestSimpleBuiltins_testMissingIgnore_7a7476796aa855e4eef288a9fa74b80f() {
        assertEval("{ f <- function(...) { missing(..2) } ; f(x + z, a * b) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testOperatorsIgnore_dd8820aada824b55da8fce1b2069a4a8() {
        assertEval("{ `%*%`(3,5) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testOrderIgnore_9d9e462e8a8cc7dbbf92366b9602bf39() {
        assertEval("{ order(1:3) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testOrderIgnore_ea195becea5e63c0bc6efd17b21ed503() {
        assertEval("{ order(3:1) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testOrderIgnore_05f671b27b0512bcbf1a2e113be7890a() {
        assertEval("{ order(c(1,1,1), 3:1) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testOrderIgnore_00ba7b7a2cb7b8ec3054739ef0c56f0e() {
        assertEval("{ order(c(1,1,1), 3:1, decreasing=FALSE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testOrderIgnore_0aee4193d1ed56df561c1905296ddca9() {
        assertEval("{ order(c(1,1,1), 3:1, decreasing=TRUE, na.last=TRUE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testOrderIgnore_87d0b85ae402b237e6eea7524e6ebfe2() {
        assertEval("{ order(c(1,1,1), 3:1, decreasing=TRUE, na.last=NA) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testOrderIgnore_63382528759189343899c7eaad048f33() {
        assertEval("{ order(c(1,1,1), 3:1, decreasing=TRUE, na.last=FALSE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testOrderIgnore_8b055d570492191af8f8acd6bca6b6ad() {
        assertEval("{ order() }");
    }

    @Ignore
    public void TestSimpleBuiltins_testOrderIgnore_233b9224709438d6239a02a3cbca1d6f() {
        assertEval("{ order(c(NA,NA,1), c(2,1,3)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testOrderIgnore_0d31ec524c63c01a9d36ce580dd87b76() {
        assertEval("{ order(c(NA,NA,1), c(1,2,3)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testOrderIgnore_4b6ee44c315ce2abafeeff55be3bda6a() {
        assertEval("{ order(c(1,2,3,NA)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testOrderIgnore_e08023e645a2200f800f52383def050b() {
        assertEval("{ order(c(1,2,3,NA), na.last=FALSE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testOrderIgnore_5b504932f266176135d80d1de4c180a6() {
        assertEval("{ order(c(1,2,3,NA), na.last=FALSE, decreasing=TRUE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testOrderIgnore_1b4cf21da630e25cd59c951bbff7a050() {
        assertEval("{ order(c(0/0, -1/0, 2)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testOrderIgnore_e63709ad10dd0c536abd53f59d2cfdf8() {
        assertEval("{ order(c(0/0, -1/0, 2), na.last=NA) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testOuterIgnore_da963cbde1784128a50d0bb2220f4a09() {
        assertEval("{ foo <- function (x,y) { x + y * 1i } ; outer(3,3,foo) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testOuterIgnore_fa7bab756255d002e9b280b544ccabdb() {
        assertEval("{ foo <- function (x,y) { x + y * 1i } ; outer(3,3,\"foo\") }");
    }

    @Ignore
    public void TestSimpleBuiltins_testOuterIgnore_4a115174070896c785016a9d9d5d665e() {
        assertEval("{ foo <- function (x,y) { x + y * 1i } ; outer(1:3,1:3,foo) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testOuterIgnore_e5c558a0c7a7981c18d26924fb310194() {
        assertEval("{ outer(c(1,2,3),c(1,2),\"+\") }");
    }

    @Ignore
    public void TestSimpleBuiltins_testOuterIgnore_5182ad090b959b44000d6c63b2bf223b() {
        assertEval("{ outer(1:3,1:2) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testOuterIgnore_2d96437a7e8bbf4c84f39c87f3822203() {
        assertEval("{ outer(1:3,1:2,\"*\") }");
    }

    @Ignore
    public void TestSimpleBuiltins_testOuterIgnore_6dc2cca210d082a9eafba79e161f0d8f() {
        assertEval("{ outer(1:3,1:2, function(x,y,z) { x*y*z }, 10) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testOuterIgnore_9eece79caddd6ebf500a83a675d56b84() {
        assertEval("{ outer(1:2, 1:3, \"<\") }");
    }

    @Ignore
    public void TestSimpleBuiltins_testOuterIgnore_9260b477fa0c0eacb1851e4c1227c63d() {
        assertEval("{ outer(1:2, 1:3, '<') }");
    }

    @Ignore
    public void TestSimpleBuiltins_testParen_499acebd19ac76555ed92ca7ecc3ec53() {
        assertEval("{ a = array(1,c(3,3,3)); (a[1,2,3] = 3) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testPasteIgnore_1a3c1e77838670e434c0da99950c8e2c() {
        assertEval("{ file.path(\"a\", \"b\", c(\"d\",\"e\",\"f\")) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testPasteIgnore_3408303a6c99992f74f43cb72bc7fa75() {
        assertEval("{ file.path() }");
    }

    @Ignore
    public void TestSimpleBuiltins_testQr_4c61546a62c6441af95effa50e76e062() {
        assertEval(" { x <- qr(cbind(1:10,2:11), LAPACK=TRUE) ; round( qr.coef(x, 1:10), digits=5 ) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testQr_abe3bd72b9a9dc9279dace1511a3fac8() {
        assertEval("{ qr(10, LAPACK=TRUE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testQr_2e522fbe7c114da3cb368c5f7274cf12() {
        assertEval("{ round( qr(matrix(1:6,nrow=2), LAPACK=TRUE)$qr, digits=5) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testQr_98faff4fc32371fae174496695a3a35b() {
        assertEval("{ qr(matrix(1:6,nrow=2), LAPACK=FALSE)$pivot }");
    }

    @Ignore
    public void TestSimpleBuiltins_testQr_251a3e0804d5e1ec4ba95cabe5851fea() {
        assertEval("{ qr(matrix(1:6,nrow=2), LAPACK=FALSE)$rank }");
    }

    @Ignore
    public void TestSimpleBuiltins_testQr_17317e26aa90dc9f21710b9567daa0c0() {
        assertEval("{ round( qr(matrix(1:6,nrow=2), LAPACK=FALSE)$qraux, digits=5 ) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testQr_637b00e95199b0d802bfd6e4c98184a6() {
        assertEval("{ round( qr(matrix(c(3,2,-3,-4),nrow=2), LAPACK=FALSE)$qr, digits=5 ) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testQr_0cb51ae181bc178bf223d49001723552() {
        assertEval("{ x <- qr(t(cbind(1:10,2:11)), LAPACK=TRUE) ; qr.coef(x, 1:2) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testQr_eb7d6b94998592915901ccdc876f3e5e() {
        assertEval("{ x <- qr(c(3,1,2), LAPACK=TRUE) ; round( qr.coef(x, c(1,3,2)), digits=5 ) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testQr_b833c099f54f44df2488c463c5977c69() {
        assertEval("{ x <- qr(t(cbind(1:10,2:11)), LAPACK=FALSE) ; qr.coef(x, 1:2) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testQr_faacf8177a822d44074aa43fd81139d5() {
        assertEval("{ x <- qr(c(3,1,2), LAPACK=FALSE) ; round( qr.coef(x, c(1,3,2)), digits=5 ) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testQr_17cad1cc6779f137acbded3e743990f8() {
        assertEval("{ m <- matrix(c(1,0,0,0,1,0,0,0,1),nrow=3) ; x <- qr(m, LAPACK=FALSE) ; qr.coef(x, 1:3) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testQr_1cd6ad9cf8d11508e422eae128c0fa58() {
        assertEval("{ x <- qr(cbind(1:3,2:4), LAPACK=FALSE) ; round( qr.coef(x, 1:3), digits=5 ) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testQr_e2d68b4592f13f68f031a68d95f80d75() {
        assertEval("{ round( qr.solve(qr(c(1,3,4,2)), c(1,2,3,4)), digits=5 ) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testQr_46728c69e8381944b3e3b0272b971935() {
        assertEval("{ round( qr.solve(c(1,3,4,2), c(1,2,3,4)), digits=5) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testQr_cb5a4156797fb35468b2a52c03675858() {
        assertEvalError("{ x <- qr(cbind(1:10,2:11), LAPACK=TRUE) ; qr.coef(x, 1:2) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testQuote_b0c9c56afaa693b70b7fb241f261ccdf() {
        assertEval("{ quote(1:3) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testQuote_8b82ba407a1eb6062c2565daa9557474() {
        assertEval("{ quote(list(1,2)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testQuote_339002b066f4349faeef982ea5860293() {
        assertEval("{ typeof(quote(1)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testQuote_d8393f64864243ce76e46a2bb07637b2() {
        assertEval("{ typeof(quote(x + y)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testQuote_0b4f01ed9d7275da794434ee3b6f8d45() {
        assertEval("{ quote(x <- x + 1) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testQuote_0ce6b058e6a459207f7154ded3d856cb() {
        assertEval("{ typeof(quote(x)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testQuote_2ce345e0f74c01976ac35948bfab5a71() {
        assertEval("{ l <- quote(x[1,1] <- 10) ; f <- function() { eval(l) } ; x <- matrix(1:4,nrow=2) ; f() ; x }");
    }

    @Ignore
    public void TestSimpleBuiltins_testQuote_409341bfbb82606d75eb0c1700c98952() {
        assertEval("{ l <- quote(x[1] <- 1) ; f <- function() { eval(l) } ; x <- 10 ; f() ; x }");
    }

    @Ignore
    public void TestSimpleBuiltins_testQuote_b8cacd46656e5a810809ba31bd8af586() {
        assertEval("{ l <- quote(x[1] <- 1) ; f <- function() { eval(l) ; x <<- 10 ; get(\"x\") } ; x <- 20 ; f() }");
    }

    @Ignore
    public void TestSimpleBuiltins_testQuote_e61120d917bf2901af3855b76706bcf1() {
        assertEvalError("{ l <- quote(a[3] <- 4) ; f <- function() { eval(l) } ; f() }");
    }

    @Ignore
    public void TestSimpleBuiltins_testQuote_d285d13bbf9697578c2b60d4e8305cdd() {
        assertEvalError("{ l <- quote(a[3] <- 4) ; eval(l) ; f() }");
    }

    @Ignore
    public void TestSimpleBuiltins_testRandomIgnore_4f7a7feadb0afd594a6252de0817b40f() {
        assertEval("{ set.seed(4357, \"default\"); round( rnorm(3,1000,10), digits = 5 ) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testRandomIgnore_784f02d69de0bfc6b26f80cc27b3eaf0() {
        assertEval("{ round( rnorm(3,c(1000,2,3),c(10,11)), digits = 5 ) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testRandomIgnore_b2e35c06b054d504b83a29fdc0f2c77a() {
        assertEval("{ round( runif(3), digits = 5 ) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testRandomIgnore_38f6214fa41def07b060c01b29004277() {
        assertEval("{ round( runif(3,1,10), digits = 5 ) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testRandomIgnore_f1a576fe16d8967d5d94472745eb8757() {
        assertEval("{ round( runif(3,1:3,3:2), digits = 5 ) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testRandomIgnore_b1cb39289a32d016a5e4d8fd0369a06b() {
        assertEval("{ round( rgamma(3,1), digits = 5 ) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testRandomIgnore_98b47b95df69a17bd9bfaf2a24c9cffd() {
        assertEval("{ round( rgamma(3,0.5,scale=1:3), digits = 5 ) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testRandomIgnore_fd28dcd349e0cca475812e380ef658bf() {
        assertEval("{ round( rgamma(3,0.5,rate=1:3), digits = 5 ) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testRandomIgnore_e0ebcb975feabfb978612a64a771116e() {
        assertEval("{ round( rbinom(3,3,0.9), digits = 5 ) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testRandomIgnore_8c7daa50068479e536d478513c940605() {
        assertEval("{ round( rbinom(3,10,(1:5)/5), digits = 5 ) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testRandomIgnore_7d00e32e71b1e734a6bf82d8e5ad1e59() {
        assertEval("{ round( rlnorm(3), digits = 5 ) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testRandomIgnore_b35e5af9e87e8a17b87bad6537a48322() {
        assertEval("{ round( rlnorm(3,sdlog=c(10,3,0.5)), digits = 5 ) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testRandomIgnore_9e1f8a6e4a70c5688947e9205b449a9e() {
        assertEval("{ round( rcauchy(3), digits = 5 ) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testRandomIgnore_df5e70f5779809e68123bd1f1474d2de() {
        assertEval("{ round( rcauchy(3, scale=4, location=1:3), digits = 5 ) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testRank_ac4677bb60d34cb54b0855ff9af216fe() {
        assertEval("{ rank(c(10,100,100,1000)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testRank_b661e996c8bab94a49a1b912170e269c() {
        assertEval("{ rank(c(1000,100,100,100, 10)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testRank_8119ffd7c473890dd5a8fb4bb4eb27dd() {
        assertEval("{ rank(c(a=2,b=1,c=3,40)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testRank_79652345882c62a61705a5fc72b80f6c() {
        assertEval("{ rank(c(a=2,b=1,c=3,d=NA,e=40), na.last=NA) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testRank_d933b8b9599a925bdbfc61565085f049() {
        assertEval("{ rank(c(a=2,b=1,c=3,d=NA,e=40), na.last=\"keep\") }");
    }

    @Ignore
    public void TestSimpleBuiltins_testRank_920ad82c4f789e0f160e9bec2592a796() {
        assertEval("{ rank(c(a=2,b=1,c=3,d=NA,e=40), na.last=TRUE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testRank_71d5d62deb1ac8f050666be28cc69770() {
        assertEval("{ rank(c(a=2,b=1,c=3,d=NA,e=40), na.last=FALSE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testRank_25cc554304f5043b71318c6e7db78796() {
        assertEval("{ rank(c(a=1,b=1,c=3,d=NA,e=3), na.last=FALSE, ties.method=\"max\") }");
    }

    @Ignore
    public void TestSimpleBuiltins_testRank_71c5bf762cec2ebaac51f86364fad786() {
        assertEval("{ rank(c(a=1,b=1,c=3,d=NA,e=3), na.last=NA, ties.method=\"min\") }");
    }

    @Ignore
    public void TestSimpleBuiltins_testRank_4b9cea01de60a8694a6b5606f91cf6e5() {
        assertEval("{ rank(c(1000, 100, 100, NA, 1, 20), ties.method=\"first\") }");
    }

    @Ignore
    public void TestSimpleBuiltins_testRbindIgnore_be158803468f8099cec173e61a9c21e2() {
        assertEval("{ m <- matrix(1:6, nrow=2) ; rbind(11:12, m) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testRegExprComplex_86a31eb43c44df7c7453e0bfe0140ded() {
        assertEval("gregexpr(\"(a)[^a]\\1\", c(\"andrea apart\", \"amadeus\", NA))");
    }

    @Ignore
    public void TestSimpleBuiltins_testRegExprComplex_97c86df70bdfc0c7ad6b46db6019ca17() {
        assertEval("regexpr(\"(a)[^a]\\1\", c(\"andrea apart\", \"amadeus\", NA))");
    }

    @Ignore
    public void TestSimpleBuiltins_testRegExprIgnore_72408e09ac9c484ede969026b2eec870() {
        assertEval("regexpr(\"e\",c(\"arm\",\"foot\",\"lefroo\", \"bafoobar\"))");
    }

    @Ignore
    public void TestSimpleBuiltins_testRegExprIgnore_aed64085f066f3404115215e0fded1c4() {
        assertEval("gregexpr(\"e\",c(\"arm\",\"foot\",\"lefroo\", \"bafoobar\"))");
    }

    @Ignore
    public void TestSimpleBuiltins_testRepIgnore_f5295de8fec47c85c0ebb8273aaffe5e() {
        assertEval("{ rep(1:3, length.out=NA) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testRepIgnore_37bcda27c57e6918291616b0f69bf3b6() {
        assertEval("{ x <- as.raw(11) ; names(x) <- c(\"X\") ; rep(x, 3) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testRepIgnore_5b82141af1888c35e442c79c94ee046f() {
        assertEval("{ x <- as.raw(c(11,12)) ; names(x) <- c(\"X\",\"Y\") ; rep(x, 2) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testRepIgnore_2df9727ae253abdb9c0ea3a4055d1563() {
        assertEval("{ x <- c(TRUE,NA) ; names(x) <- c(\"X\",NA) ; rep(x, length.out=3) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testRepIgnore_41febe11e7d8ee67ae1a3c96176e6758() {
        assertEval("{ x <- 1L ; names(x) <- c(\"X\") ; rep(x, times=2) } ");
    }

    @Ignore
    public void TestSimpleBuiltins_testRepIgnore_4d2f602803b6746348def3b076ff4129() {
        assertEval("{ x <- 1 ; names(x) <- c(\"X\") ; rep(x, times=0) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testRepIgnore_e8422af202641451dc9547b331356e3f() {
        assertEval("{ x <- 1+1i ; names(x) <- c(\"X\") ; rep(x, times=2) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testRepIgnore_109091b6f9625b204bc0e053084ffef6() {
        assertEval("{ x <- c(1+1i,1+2i) ; names(x) <- c(\"X\") ; rep(x, times=2) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testRepIgnore_5e2e382a5ebec41881dd1cac8e3dc177() {
        assertEval("{ x <- c(\"A\",\"B\") ; names(x) <- c(\"X\") ; rep(x, length.out=3) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testRoundIgnore_bb594f5dd03efc19fa1dbee51b5324da() {
        assertEval("{ round(1.123456,digit=2.8) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testRowStats_80140817c8e933718f596cc1e3fbdfd6() {
        assertEval("{ a = rowSums(matrix(1:12,3,4)); is.null(dim(a)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testRowStats_4d8e03379ba609c667ba75b44ee74af9() {
        assertEval("{ a = rowSums(matrix(1:12,3,4)); length(a) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testRowStats_8da03b857598bdb3f6318c67e59d362c() {
        assertEval("{ a = rowSums(matrix(1:12,3,4)); c(a[1],a[2],a[3]) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testRowStatsArray_c5f4c7d13c735e2fa65c4f607b63518b() {
        assertEval("{ a = rowSums(array(1:24,c(2,3,4))); is.null(dim(a)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testRowStatsArray_06049a7dceb10c804f2b283437a7e06a() {
        assertEval("{ a = rowSums(array(1:24,c(2,3,4))); length(a) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testRowStatsArray_0963abebe9629587b68d742c268c67e5() {
        assertEval("{ a = rowSums(array(1:24,c(2,3,4))); c(a[1],a[2]) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSapplyIgnore_e30b8dbeaaac291438d9893765622dcc() {
        assertEval("{ f<-function(g) { sapply(1:3, g) } ; f(function(x) { x*2 }) ; f(function(x) { TRUE }) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSapplyIgnore_d1e677fbd4330542e55296a85de7a560() {
        assertEval("{ sapply(1:2, function(i) { if (i==1) { as.raw(0) } else { 5+10i } }) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSapplyIgnore_3348bfd05e16974ee51fd002aa21a7c4() {
        assertEval("{ sapply(1:2, function(i) { if (i==1) { as.raw(0) } else { as.raw(10) } }) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSapplyIgnore_a1f12546a0709e269e55fdf2ce6796a1() {
        assertEval("{ sapply(1:2, function(i) { if (i==1) { as.raw(0) } else { \"hello\" }} ) } ");
    }

    @Ignore
    public void TestSimpleBuiltins_testSapplyIgnore_64d9e8edd48f17d106de20e6c9502df6() {
        assertEval("{ sapply(1:3, function(x) { if (x==1) { list(1) } else if (x==2) { list(NULL) } else { list(2) } }) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSapplyIgnore_567fb751fa9228a98594254d6b9f8f06() {
        assertEval("{ sapply(1:3, `-`, 2) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSapplyIgnore_9ad66c18d0dee6188d50055a969a5721() {
        assertEval("{ sapply(1:3, \"-\", 2) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSapplyIgnore_2be6b7c9102a07fc7019e3f281e0ee77() {
        assertEval("{ sapply(1:3, function(i) { list(1,2) }) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSapplyIgnore_e47eef80479600898e0643dc204df376() {
        assertEval("{ sapply(1:3, function(i) { if (i < 3) { list(1,2) } else { c(11,12) } }) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSapplyIgnore_90910a59f9c7641649fafc606ad82fbe() {
        assertEval("{ sapply(1:3, function(i) { if (i < 3) { c(1+1i,2) } else { c(11,12) } }) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSapplyIgnore_2cf7378fd6b712f0b62c0f76b237c08c() {
        assertEval("{ (sapply(1:3, function(i) { if (i < 3) { list(xxx=1) } else {list(zzz=2)} })) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSapplyIgnore_91913713ed1196f2c80dc3bdd44320fe() {
        assertEval("{ (sapply(1:3, function(i) { list(xxx=1:i) } )) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSapplyIgnore_142908c5c8b7910e9934f2f41b1aa41a() {
        assertEval("{ sapply(1:3, function(i) { if (i < 3) { list(xxx=1) } else {list(2)} }) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSapplyIgnore_2304de70341b6e2e641140ace2ce7f15() {
        assertEval("{ (sapply(1:3, function(i) { if (i < 3) { c(xxx=1) } else {c(2)} })) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSapplyIgnore_5a1e2c136a6c7890d7d240bbf2b24fd5() {
        assertEval("{ f <- function() { sapply(c(1,2), function(x) { c(a=x) })  } ; f() }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSapplyIgnore_c113767d2df4d2f9f537c1fcd5cc62c2() {
        assertEval("{ f <- function() { sapply(c(X=1,Y=2), function(x) { c(a=x) })  } ; f() }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSapplyIgnore_a5b2fb168341e693b49bdbf8260ea50a() {
        assertEval("{ f <- function() { sapply(c(\"a\",\"b\"), function(x) { c(a=x) })  } ; f() }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSapplyIgnore_5024f503e2bdd48f3b32408e0c8c3e1c() {
        assertEval("{ f <- function() { sapply(c(X=\"a\",Y=\"b\"), function(x) { c(a=x) })  } ; f() }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSapplyIgnore_c2167cd4565e9253a6b834237b6772a6() {
        assertEval("{ sapply(c(\"a\",\"b\",\"c\"), function(x) { x }) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSequenceStatementIgnore_6e0da5f0115b849917bed14234134dd1() {
        assertEval("{ f <- function(b, i, v) { b[i] <- v ; b } ; f(c(1,3,10), seq(2L,4L,2L),c(TRUE,FALSE)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSequenceStatementIgnore_0eb86a4dc13ce0ad3244974ab0baef64() {
        assertEval("{ f <- function(b, i, v) { b[i] <- v ; b } ; f(as.double(1:5), seq(7L,1L,-3L),c(TRUE,FALSE,NA)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSequenceStatementIgnore_94d11f5198379c03b6e2a20a174ae13b() {
        assertEval("{ f <- function(b, i, v) { b[i] <- v ; b } ; f(as.logical(-3:3),seq(1L,7L,3L),c(TRUE,NA,FALSE)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSequenceStatementIgnore_74f98be1aeeaf4ffef6fb7da1d0df304() {
        assertEval("{ f <- function(b, i, v) { b[i] <- v ; b } ; f(as.character(-3:3),seq(1L,7L,3L),c(\"A\",\"a\",\"XX\")) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSequenceStatementIgnore_7689ae968008d949c0ab6cd0ffaff400() {
        assertEval("{ f <- function(b, i, v) { b[i] <- v ; b } ; f(1:2,1:2,3:4); f(1:2,1:2,c(3,4)) ; f(1:8, seq(1L,7L,3L), c(10,100,1000)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSequenceStatementIgnore_62d05e6f950604222ac778f81a04c118() {
        assertEval("{ f <- function(b, i, v) { b[i] <- v ; b } ; f(1:2,1:2,3:4); f(1:2,1:2,c(3,4)) ; z <- f(1:8, seq(1L,7L,3L), list(10,100,1000)) ; sum(as.double(z)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSequenceStatementNamedParamsIgnore_1251c8e4910f8fd3c34d302f4dedd4e3() {
        assertEval("{ seq(to=-1,from=-10) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSequenceStatementNamedParamsIgnore_e098431abfadfb039b6df6aff8256b5e() {
        assertEval("{ seq(length.out=13.4) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSequenceStatementNamedParamsIgnore_017c83d5285ef470e086c8cdcf688948() {
        assertEval("{ seq(length.out=0) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSequenceStatementNamedParamsIgnore_4d45a903e77e66f73e8e8dc46c0f6295() {
        assertEval("{ seq(along.with=10) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSequenceStatementNamedParamsIgnore_8f03e56bf879ae85769df875ba64193f() {
        assertEval("{ seq(along.with=NA) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSequenceStatementNamedParamsIgnore_260fc64c52f6c6a0f229523992fc18b8() {
        assertEval("{ seq(along.with=1:10) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSequenceStatementNamedParamsIgnore_6da980d127281bc30e3ee84c77da9350() {
        assertEval("{ seq(along.with=-3:-5) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSequenceStatementNamedParamsIgnore_9e0234d61f5fcd67663f569045ba0f06() {
        assertEval("{ seq(from=10:12) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSequenceStatementNamedParamsIgnore_90194674658adf75d59119916718fc06() {
        assertEval("{ seq(from=c(TRUE, FALSE)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSequenceStatementNamedParamsIgnore_06d793d38a0809d898a5bc0678f47dd2() {
        assertEval("{ seq(from=TRUE, to=TRUE, length.out=0) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSequenceStatementNamedParamsIgnore_252700236c9eb870fbf263c1aacd182e() {
        assertEval("{ round(seq(from=10.5, to=15.4, length.out=4), digits=5) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSequenceStatementNamedParamsIgnore_34a207f39c5269d9972a5c0adda240b1() {
        assertEval("{ seq(from=11, to=12, length.out=2) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSequenceStatementNamedParamsIgnore_2b815d4518fb10efc18eb377b3111cbc() {
        assertEval("{ seq(from=-10.4,to=-5.8,by=2.1) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSequenceStatementNamedParamsIgnore_57722e8323d481afeb0dc6bc8ef818e9() {
        assertEval("{ round(seq(from=3L,to=-2L,by=-4.2), digits=5) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSequenceStatementNamedParamsIgnore_6e790dfb1de4a070282c353b0be255bd() {
        assertEval("{ seq(along=c(10,11,12)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSort_284b7e7d187c6ab2e4fa9e4409153a7b() {
        assertEval("{ sort(c(1L,10L,2L)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSort_1fd4d093837b7d126d0ef7530e43c343() {
        assertEval("{ sort(c(3,10,2)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSort_6a592c6f57c71c5d15a2ca0155fee884() {
        assertEval("{ sort(c(1,2,0/0,NA)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSort_5aa86dc4ae1bb25c682d61e872e9b040() {
        assertEval("{ sort(c(2,1,0/0,NA), na.last=NA) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSort_6a7ec5187507fa97abda94b64f5a079d() {
        assertEval("{ sort(c(3,0/0,2,NA), na.last=TRUE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSort_b5d4d0684b5f7ae93abbd963d09e2547() {
        assertEval("{ sort(c(3,NA,0/0,2), na.last=FALSE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSort_ccb733ea6a05ce0344a90278f6b60239() {
        assertEval("{ sort(c(3L,NA,2L)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSort_894104e630b40ec41f7a3242c9dd48bb() {
        assertEval("{ sort(c(3L,NA,-2L), na.last=TRUE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSort_7371476317ce19939f96f4a8546a66ca() {
        assertEval("{ sort(c(3L,NA,-2L), na.last=FALSE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSort_b2088bf4f79792e07aeb1878814c42dd() {
        assertEval("{ sort(c(a=NA,b=NA,c=3,d=1),na.last=TRUE, decreasing=TRUE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSort_7cfdc805071697201c562b5f50ebd539() {
        assertEval("{ sort(c(a=NA,b=NA,c=3,d=1),na.last=FALSE, decreasing=FALSE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSort_ac8a4c1d13606a72e3e1b8c439efda29() {
        assertEval("{ sort(c(a=0/0,b=1/0,c=3,d=NA),na.last=TRUE, decreasing=FALSE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSort_519a0465d477a73e1db30d78e8776c1b() {
        assertEval("{ sort(double()) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSort_df4ed76c79e6d77ac09a69738271e1fd() {
        assertEval("{ sort(c(a=NA,b=NA,c=3L,d=-1L),na.last=TRUE, decreasing=FALSE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSort_2ce0809f50d42943354aa60d00cd1a90() {
        assertEval("{ sort(c(3,NA,1,d=10), decreasing=FALSE, index.return=TRUE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSort_9f37df375d06bb45b37c5fe0fb3d1b54() {
        assertEval("{ sort(3:1, index.return=TRUE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSource_5c17b4de1a98b4e6a8cfa7815d97f7e4() {
        assertEval("{ source(\"test/r/simple/data/tree2/setx.r\") ; x }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSource_d4a38dfd161547e3c0a27bad69e1cbf8() {
        assertEval("{ source(\"test/r/simple/data/tree2/setx.r\", local=TRUE) ; x }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSource_be101f4a7d5eb393d6100a7da3b04018() {
        assertEval("{ x <- 1; f <- function() { source(\"test/r/simple/data/tree2/setx.r\", local=TRUE) ; x } ; c(f(), x) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSource_f8c23fa44e5be57cccce50c2c2c77af6() {
        assertEval("{ x <- 1; f <- function() { source(\"test/r/simple/data/tree2/setx.r\", local=FALSE) ; x } ; c(f(), x) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSource_47529aa6f5e299a286137b552e7163dc() {
        assertEval("{ x <- 1; f <- function() { source(\"test/r/simple/data/tree2/incx.r\", local=FALSE) ; x } ; c(f(), x) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSource_e52eebdb86410e47576dc1c11b4690b0() {
        assertEval("{ x <- 1; f <- function() { source(\"test/r/simple/data/tree2/incx.r\", local=TRUE) ; x } ; c(f(), x) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSqrtBroken_dda9ccdc11f9f5afbe9854145501c5e5() {
        assertEval("{ sqrt(c(a=9,b=81)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSqrtBroken_a2489c7a22d5ac414a9587cbff9b6c64() {
        assertEval("{ sqrt(1:5) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSqrtBroken_cae4a927d1bb1f88b88550ba795899f5() {
        assertEval("{ sqrt(-1L) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSqrtBroken_d1949f3b9fbc81f7fe02ad4b8719bcaa() {
        assertEval("{ sqrt(-1) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testStrSplitIgnore_46d4b4f12ca8e8fb947be03344b9b554() {
        assertEval("{ strsplit(\"ahoj\", split=\"\") [[c(1,2)]] }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSubIgnore_0902579a0dce5fa8d7a808155b8c09b0() {
        assertEval("{ gsub(\"a\",\"aa\", \"prague alley\", fixed=TRUE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSubIgnore_fa9e3d4d6577b70532d26a56fc343b17() {
        assertEval("{ sub(\"a\",\"aa\", \"prague alley\", fixed=TRUE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSubIgnore_dca0ae0449dfa1c58f334818a4b87673() {
        assertEval("{ gsub(\"a\",\"aa\", \"prAgue alley\", fixed=TRUE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSubIgnore_3d79a5bb75bf60e95350618f5485daa6() {
        assertEval("{ gsub(\"a\",\"aa\", \"prAgue alley\", fixed=TRUE, ignore.case=TRUE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSubIgnore_d1977e782dbbd1ca4da912d5f56d63ed() {
        assertEval("{ gsub(\"a\",\"aa\", \"prAgue alley\", ignore.case=TRUE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSubIgnore_7332b217f11d38a5978915cf31eff6f4() {
        assertEval("{ gsub(\"([a-e])\",\"\\1\\1\", \"prague alley\") }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSubIgnore_8df24d5d1e0149a6b232c373b6057aa7() {
        assertEval("{ gsub(\"h\",\"\", c(\"hello\", \"hi\", \"bye\")) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSubIgnore_42529469f0a7019b2a56e1e5312e0577() {
        assertEval("{ gsub(\"h\",\"\", c(\"hello\", \"hi\", \"bye\"), fixed=TRUE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSubstitute_4d6f07ded5992a096c046ebead59dfd0() {
        assertEval("{ substitute(x + y, list(x=1)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSubstitute_69aeec67da0ee58f71a5a4244df69a7c() {
        assertEval("{ f <- function(expr) { substitute(expr) } ; f(a * b) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSubstitute_4c1a0e897f6f8dcba279129803430c82() {
        assertEval("{ f <- function() { delayedAssign(\"expr\", a * b) ; substitute(expr) } ; f() }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSubstitute_f82a54616cf2b4be6f752e5c66c635c9() {
        assertEval("{ f <- function() { delayedAssign(\"expr\", a * b) ; substitute(dummy) } ; f() }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSubstitute_587cbbd25dcab3e16f1b360e583c7db5() {
        assertEval("{ delayedAssign(\"expr\", a * b) ; substitute(expr) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSubstitute_dc45366e3a931d33e1c7ea987435cdd1() {
        assertEval("{ f <- function(expr) { expr ; substitute(expr) } ; a <- 10; b <- 2; f(a * b) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSubstitute_61078b0c4da1266fe57918a4361362dd() {
        assertEval("{ f <- function(expra, exprb) { substitute(expra + exprb) } ; f(a * b, a + b) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSubstitute_d84d47dddb7bd0bf96bf16437eadd619() {
        assertEval("{ f <- function(y) { substitute(y) } ; f() }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSubstitute_5f9847b1be03c329f3c41d8883684dc2() {
        assertEval("{ f <- function(y) { substitute(y) } ; typeof(f()) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSubstitute_8308ab3830982170f12169a348ea89e8() {
        assertEval("{ f <- function(z) { g <- function(y) { substitute(y)  } ; g(z) } ; f(a + d) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSubstitute_a8173ff3145e5caeadfe0a38e28a2a09() {
        assertEval("{ f <- function(x) { g <- function() { substitute(x) } ; g() } ;  f(a * b) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSubstitute_89798b3d8963d8d31c6b22ed6bc05491() {
        assertEval("{ substitute(a, list(a = quote(x + y), x = 1)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSubstitute_3e4cc116e9a592c28b2159c6e8365bfa() {
        assertEval("{ f <- function(x = y, y = x) { substitute(x) } ; f() }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSubstitute_1bcbef75639b8b543cc72a07279a2203() {
        assertEval("{ f <- function(a, b=a, c=b, d=c) { substitute(d) } ; f(x + y) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSubstitute_b728de23a3c96c7d1c7e179ba0cf22c8() {
        assertEval("{ substitute(if(a) { x } else { x * a }, list(a = quote(x + y), x = 1)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSubstitute_b9b9e1994091af7e565e035d8c87b9ef() {
        assertEval("{ substitute(function(x, a) { x + a }, list(a = quote(x + y), x = 1)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSubstitute_9d646fcf10648fbae8e8087bb65a9bd6() {
        assertEval("{ substitute(a[x], list(a = quote(x + y), x = 1)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSubstitute_844fb1f54ddd6fb3cb03e5a9d632edda() {
        assertEval("{ f <- function(x) { substitute(x, list(a=1,b=2)) } ; f(a + b) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSubstitute_0083a2f370b2d901d6617b52259cd8ef() {
        assertEval("{ f <- function() { substitute(x(1:10), list(x=quote(sum))) } ; f() }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSubstitute_ba8b61c2d3fa9c76a2c14d5e96138f4b() {
        assertEval("{ env <- new.env() ; z <- 0 ; delayedAssign(\"var\", z+2, assign.env=env) ; substitute(var, env=env) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSubstitute_91aaa32f72b8dab4c7856c1e7e89ed54() {
        assertEval("{ env <- new.env() ; z <- 0 ; delayedAssign(\"var\", z+2, assign.env=env) ; z <- 10 ; substitute(var, env=env) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSubstitute_8b21e0ecb7d6143dab8b63c68608f906() {
        assertEval("{ f <- function() { substitute(list(a=1,b=2,...,3,...)) } ; f() }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSubstitute_6da555da9a31bfb212efe33b45c838d7() {
        assertEval("{ f <- function(...) { substitute(list(a=1,b=2,...,3,...)) } ; f() }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSubstitute_fc2154960706a9f7207993aa89aaca50() {
        assertEval("{ f <- function(...) { substitute(list(a=1,b=2,...,3,...)) } ; f(x + z, a * b) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSubstitute_b6449119b833609315c063f2a2c5a363() {
        assertEval("{ f <- function(...) { substitute(list(...)) } ; f(x + z, a * b) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSubstringIgnore_41302c9bd877c3627e699cd303bfef78() {
        assertEval("{ substring(\"123456\", first=2, last=4) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSubstringIgnore_747b32e2b791c976fc9b634a5aef6b23() {
        assertEval("{ substring(\"123456\", first=2.8, last=4) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSubstringIgnore_8ce15f4973c2ddb4ca609ef2c4836ab5() {
        assertEval("{ substring(c(\"hello\", \"bye\"), first=c(1,2,3), last=4) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSubstringIgnore_6dd56114a5d7ba502c449ca3c03308ae() {
        assertEval("{ substring(\"fastr\", first=NA, last=2) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSubstringIgnore_221901876479773561663a589e4c633b() {
        assertEval("{ substr(NA,1,2) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSubstringIgnore_d6fcea25fcf0ab63be67b287b1d36d91() {
        assertEval("{ substr(\"fastr\", NA, 2) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSubstringIgnore_b67af38ded736620a9005880de5731e0() {
        assertEval("{ substr(\"fastr\", 1, NA) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSumIgnore_512304594d55f1330efacd6cc594cf7a() {
        assertEval("{ sum(0, 1[3]) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSumIgnore_b579f0fccb80261d02dd8e36a1c21977() {
        assertEval("{ sum(na.rm=FALSE, 0, 1[3]) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSumIgnore_71b125cd0c9f2fe015befa381709e1a6() {
        assertEval("{ sum(0, na.rm=FALSE, 1[3]) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSumIgnore_d6658778aa6ef9490e87eee1748c00b1() {
        assertEval("{ sum(0, 1[3], na.rm=FALSE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSumIgnore_d8048d7927bb3ae55032b224e19caf66() {
        assertEval("{ sum(0, 1[3], na.rm=TRUE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testSumIgnore_79d5da5603083c8a7cd4e867a99de305() {
        assertEval("{ sum(1+1i,2,NA, na.rm=TRUE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testTriangular_41ca685d92138926005a9f7fb6ca8478() {
        assertEval("{ m <- { matrix( as.character(1:6), nrow=2 ) } ; diag(m) <- c(1,2) ; m }");
    }

    @Ignore
    public void TestSimpleBuiltins_testTriangular_f1776e942214f71194d5c31b1a80996e() {
        assertEval("{ m <- { matrix( (1:6) * (1+3i), nrow=2 ) } ; diag(m) <- c(1,2) ; m }");
    }

    @Ignore
    public void TestSimpleBuiltins_testTriangular_e3c989be96bfd58a83c33b08e911de62() {
        assertEval("{ m <- { matrix( as.raw(11:16), nrow=2 ) } ; diag(m) <- c(as.raw(1),as.raw(2)) ; m }");
    }

    @Ignore
    public void TestSimpleBuiltins_testTypeCheckIgnore_7f8323b03018432a0d32c10f362ec5d7() {
        assertEval("{ is.list(NULL) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testUnlistIgnore_f35b6e0161ac852251f29fe1bc8a7f0c() {
        assertEval("{ unlist(list(a=\"hello\", b=\"hi\")) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testUnlistIgnore_0e497d9170f54c56c46d71f9c2a7b065() {
        assertEval("{ x <- list(a=1,b=2:3,list(x=FALSE)) ; unlist(x, recursive=FALSE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testUnlistIgnore_053bfeb29189c57f2c388a6015092e27() {
        assertEval("{ x <- list(1,z=list(1,b=22,3)) ; unlist(x, recursive=FALSE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testUnlistIgnore_566f28a4c86058a48ce00c31c2d3032c() {
        assertEval("{ x <- list(1,z=list(1,b=22,3)) ; unlist(x, recursive=FALSE, use.names=FALSE) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testUnlistIgnore_a698318202ba9d48899d816aaf045170() {
        assertEval("{ x <- list(\"a\", c(\"b\", \"c\"), list(\"d\", list(\"e\"))) ; unlist(x) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testUnlistIgnore_f28bf5269d48ccb8325f37a8fda65a1d() {
        assertEval("{ x <- list(NULL, list(\"d\", list(), character())) ; unlist(x) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testUnlistIgnore_1d0087eeeb15e56b4081ebf242c3ee4c() {
        assertEval("{ x <- list(a=list(\"1\",\"2\",b=\"3\",\"4\")) ; unlist(x) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testUnlistIgnore_86b20ffcf8f88b8502d3da0218b3327c() {
        assertEval("{ x <- list(a=list(\"1\",\"2\",b=list(\"3\"))) ; unlist(x) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testUnlistIgnore_ca79e22b108545ebb9086587d6a71e2f() {
        assertEval("{ x <- list(a=list(1,FALSE,b=list(2:4))) ; unlist(x) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testUnlistIgnore_7c2d3aec2785e5d94b9cad216a3ba4f9() {
        assertEval("{ x <- list(1,list(2,3),4) ; z <- list(x,x) ; u <- list(z,z) ; u[[c(2,2,3)]] <- 6 ; unlist(u) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testUpdateClassIgnore_de2b6cfc60c31afa53dbd74ec10d3136() {
        assertEval("{x<-c(1,2,3,4); class(x)<-\"array\"; class(x)<-\"matrix\";}");
    }

    @Ignore
    public void TestSimpleBuiltins_testUpdateClassIgnore_dfbd07abb7b6feb1f2afd25c4ad019ef() {
        assertEval("{x<-1;attr(x,\"class\")<-c(1,2,3);}");
    }

    @Ignore
    public void TestSimpleBuiltins_testUpdateNamesIgnore_2cffdfa878b18bbad7b6a53d7e4932ae() {
        assertEval("{ x <- c(1,2); names(x) <- c(\"A\", \"B\") ; x + 1 }");
    }

    @Ignore
    public void TestSimpleBuiltins_testUpdateNamesIgnore_d40e4da2cc65cb7648581165a629d52a() {
        assertEval("{ x <- 1:2; names(x) <- c(\"A\", \"B\") ; y <- c(1,2,3,4) ; names(y) <- c(\"X\", \"Y\", \"Z\") ; x + y }");
    }

    @Ignore
    public void TestSimpleBuiltins_testVectorConstructorIgnore_4c533a47811eec5d654d8bc9cada841a() {
        assertEval("{ vector(length=3) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testWhichIgnore_6d01b8ef11e5cdf979ca7122cd3de717() {
        assertEval("{ which(c(a=TRUE,b=FALSE,c=TRUE)) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testWorkingDirectory_4dea13731bbc2e14f050d3a8c9270396() {
        assertEval("{ cur <- getwd(); cur1 <- setwd(getwd()) ; cur2 <- getwd() ; cur == cur1 && cur == cur2 }");
    }

    @Ignore
    public void TestSimpleBuiltins_testWorkingDirectory_4158e8f80f9f54af9ceaf07aaacc8395() {
        assertEval("{ cur <- getwd(); cur1 <- setwd(c(cur, \"dummy\")) ; cur2 <- getwd() ; cur == cur1  }");
    }

    @Ignore
    public void TestSimpleBuiltins_testWorkingDirectory_b06c73943c7300d6a0af95bb6d4140c3() {
        assertEvalError("{ setwd(1) }");
    }

    @Ignore
    public void TestSimpleBuiltins_testWorkingDirectory_d4bb5261e83943081702a1fb0f063135() {
        assertEvalError("{ setwd(character()) }");
    }

    @Ignore
    public void TestSimpleComparison_testMatrices_eb091ba085dda60b02299905b6603cba() {
        assertEval("{ matrix(1) > matrix(2) }");
    }

    @Ignore
    public void TestSimpleComparison_testMatrices_e08838ffe9812e3d1cb041aaddec856a() {
        assertEval("{ matrix(1) > NA }");
    }

    @Ignore
    public void TestSimpleComparison_testMatrices_6e89d79b793dfb2076088167e168c6e0() {
        assertEval("{ m <- matrix(1:6, nrow=2) ; m > c(1,2,3) }");
    }

    @Ignore
    public void TestSimpleComparison_testScalarsIgnore_7a6557e91f8f198b6c11c29c4e572f57() {
        assertEval("{ z <- TRUE; dim(z) <- c(1) ; dim(z == TRUE) }");
    }

    @Ignore
    public void TestSimpleComparison_testScalarsIgnore_6f066c83dbb9ff430a0d5056100fbb50() {
        assertEvalError("{ z <- TRUE; dim(z) <- c(1) ; u <- 1:3 ; dim(u) <- 3 ; u == z }");
    }

    @Ignore
    public void TestSimpleComparison_testScalarsNAAsFunctionIgnore_0a500b31b16f008e4a1dc5b5630344c8() {
        assertEval("{ f <- function(a,b) { a > b } ; f(1,2) ; f(1L,2) ; f(\"hello\", \"hi\"[2]) }");
    }

    @Ignore
    public void TestSimpleComparison_testScalarsNAAsFunctionIgnore_c803d5d2a05362ff97b2237e3502ac08() {
        assertEval("{ f <- function(a,b) { a > b } ; f(1,2) ; f(1L,2) ; f(\"hello\"[2], \"hi\") }");
    }

    @Ignore
    public void TestSimpleComparison_testScalarsNAIgnore_5d82706c2baa41a30419736895aecb0c() {
        assertEval("{ a <- 1L ; b <- TRUE[2] ; a == b }");
    }

    @Ignore
    public void TestSimpleComparison_testScalarsNAIgnore_6617a42ac54ed9cdf434eee9b0c67e30() {
        assertEval("{ a <- TRUE[2] ; b <- 1L ; a == b }");
    }

    @Ignore
    public void TestSimpleComparison_testVectorsIgnore_9ad8bb825e6c5d11db011ae03b0c67c1() {
        assertEvalError("{ m <- matrix(nrow=2, ncol=2, 1:4) ; m == 1:16 }");
    }

    @Ignore
    public void TestSimpleFunctions_testDefinitionsIgnore_b8d75a017c31d73d6dbf7c6a93953d67() {
        assertEval("{ x <- function(a,b) { a^b } ; f <- function() { x <- \"sum\" ; sapply(1, x, 2) } ; f() }");
    }

    @Ignore
    public void TestSimpleFunctions_testDefinitionsIgnore_dfa24cb65db3a6a592617aa583ec1aaa() {
        assertEval("{ x <- function(a,b) { a^b } ; g <- function() { x <- \"sum\" ; f <- function() { sapply(1, x, 2) } ; f() }  ; g() }");
    }

    @Ignore
    public void TestSimpleFunctions_testDefinitionsIgnore_6ff99329ff4c5405259dd094d456df82() {
        assertEval("{ x <- function(a,b) { a^b } ; f <- function() { x <- 211 ; sapply(1, x, 2) } ; f() }");
    }

    @Ignore
    public void TestSimpleFunctions_testDefinitionsIgnore_90214c174a4cd064fcdf43a64bba6f73() {
        assertEval("{ x <- function(a,b) { a^b } ; dummy <- sum ; f <- function() { x <- \"dummy\" ; sapply(1, x, 2) } ; f() }");
    }

    @Ignore
    public void TestSimpleFunctions_testDefinitionsIgnore_ba4a8d210d2bcdac8ede803b28c13172() {
        assertEval("{ x <- function(a,b) { a^b } ; dummy <- sum ; f <- function() { x <- \"dummy\" ; dummy <- 200 ; sapply(1, x, 2) } ; f() }");
    }

    @Ignore
    public void TestSimpleFunctions_testDefinitionsIgnore_8ef4913016fe9a78ae79cb9f48e3c5ae() {
        assertEval("{ foo <- function (x) { x } ; foo() }");
    }

    @Ignore
    public void TestSimpleFunctions_testDefinitionsIgnore_1c3efc0657001d0ce5000a68b2e7b18d() {
        assertEval("{ foo <- function (x) { x } ; foo(1,2,3) }");
    }

    @Ignore
    public void TestSimpleFunctions_testDotsIgnore_e620898284cbe5e1d40bfe326c77804e() {
        assertEval("{ f <- function(...) { ..1 } ;  f(10) }");
    }

    @Ignore
    public void TestSimpleFunctions_testDotsIgnore_a8e7323fa1a949f877214637cf0a91b1() {
        assertEval("{ f <- function(...) { x <<- 10 ; ..1 } ; x <- 1 ; f(x) }");
    }

    @Ignore
    public void TestSimpleFunctions_testDotsIgnore_ab19b9b703d36ea0149b6950305344b1() {
        assertEval("{ f <- function(...) { ..1 ; x <<- 10 ; ..1 } ; x <- 1 ; f(x) }");
    }

    @Ignore
    public void TestSimpleFunctions_testDotsIgnore_a52d7c73079437ca5443652b7f20f2ef() {
        assertEval("{ f <- function(...) { ..1 ; x <<- 10 ; ..2 } ; x <- 1 ; f(100,x) }");
    }

    @Ignore
    public void TestSimpleFunctions_testDotsIgnore_fc05b96d7c209b4b11d3c1597a4f5d95() {
        assertEval("{ f <- function(...) { ..2 ; x <<- 10 ; ..1 } ; x <- 1 ; f(x,100) }");
    }

    @Ignore
    public void TestSimpleFunctions_testDotsIgnore_d6e84b6c4d84ca15395f370802824ec0() {
        assertEval("{ g <- function(...) { 0 } ; f <- function(...) { g(...) ; x <<- 10 ; ..1 } ; x <- 1 ; f(x) }");
    }

    @Ignore
    public void TestSimpleFunctions_testDotsIgnore_581191e3ee585752a4393b1dd5c20af3() {
        assertEval("{ f <- function(...) { substitute(..1) } ;  f(x+y) }");
    }

    @Ignore
    public void TestSimpleFunctions_testDotsIgnore_46356a32a158c79de398dd64974058fc() {
        assertEval("{ f <- function(...) { g <- function() { ..1 } ; g() } ; f(a=2) }");
    }

    @Ignore
    public void TestSimpleFunctions_testDotsIgnore_569ec3ad103b4dcd2b7e7af1202dd26f() {
        assertEval("{ f <- function(...) { ..1 <- 2 ; ..1 } ; f(z = 1) }");
    }

    @Ignore
    public void TestSimpleFunctions_testDotsIgnore_a29c54a3c8cd1ee3e35a2aea432951cb() {
        assertEval("{ g <- function(a,b) { a + b } ; f <- function(...) { g(...) }  ; f(1,2) }");
    }

    @Ignore
    public void TestSimpleFunctions_testDotsIgnore_82b39f3b671e13554b9f70c67b51d9bc() {
        assertEval("{ g <- function(a,b,x) { a + b * x } ; f <- function(...) { g(...,x=4) }  ; f(b=1,a=2) }");
    }

    @Ignore
    public void TestSimpleFunctions_testDotsIgnore_44ffe8a1375fa81b1531c8e8a3c876ee() {
        assertEval("{ g <- function(a,b,x) { a + b * x } ; f <- function(...) { g(x=4, ...) }  ; f(b=1,a=2) }");
    }

    @Ignore
    public void TestSimpleFunctions_testDotsIgnore_1d94abf5afd9989c20c9e7713f15aa3a() {
        assertEval("{ g <- function(a,b,x) { a + b * x } ; f <- function(...) { g(x=4, ..., 10) }  ; f(b=1) }");
    }

    @Ignore
    public void TestSimpleFunctions_testDotsIgnore_b7c1eb65db6a2cb8b5f3401383477104() {
        assertEval("{ g <- function(a,b,aa,bb) { a ; x <<- 10 ; aa ; c(a, aa) } ; f <- function(...) {  g(..., ...) } ; x <- 1; y <- 2; f(x, y) }");
    }

    @Ignore
    public void TestSimpleFunctions_testDotsIgnore_f869c81e19bebe1d0b508f3152867860() {
        assertEval("{ f <- function(a, b) { a - b } ; g <- function(...) { f(1, ...) } ; g(a = 2) }");
    }

    @Ignore
    public void TestSimpleFunctions_testDotsIgnore_168904965e7c99fe53738eba7ef80c6e() {
        assertEval("{ f <- function(a, barg, ...) { a + barg } ; g <- function(...) { f(a=1, ...) } ; g(b=2,3) }");
    }

    @Ignore
    public void TestSimpleFunctions_testDotsIgnore_446276723386c4e17ee775d34b52759a() {
        assertEval("{ f <- function(a, barg, bextra, dummy) { a + barg } ; g <- function(...) { f(a=1, ...) } ; g(be=2,du=3, 3) }");
    }

    @Ignore
    public void TestSimpleFunctions_testDotsIgnore_30b478f9a7f62680adb64c9c36c9ab71() {
        assertEval("{ f <- function(a, barg, bextra, dummy) { a + barg } ; g <- function(...) { f(a=1, ...) } ; g(1,2,3) }");
    }

    @Ignore
    public void TestSimpleFunctions_testDotsIgnore_ba5a64f80ce3db2ca6ec2bc574c2b011() {
        assertEval("{ f <- function(...,d) { ..1 + ..2 } ; f(1,d=4,2) }");
    }

    @Ignore
    public void TestSimpleFunctions_testDotsIgnore_ccfd3930d86a89add4a6dbc2941c216e() {
        assertEval("{ f <- function(...,d) { ..1 + ..2 } ; f(1,2,d=4) }");
    }

    @Ignore
    public void TestSimpleFunctions_testDotsIgnore_a3678db1544ef8395deec4ed02acdb3d() {
        assertEvalError("{ g <- function(a,b,x) { a + b * x } ; f <- function(...) { g(x=4, ..., 10) }  ; f(b=1,a=2) }");
    }

    @Ignore
    public void TestSimpleFunctions_testDotsIgnore_67eac84ba5b2dac0c1bc9214053b228c() {
        assertEvalError("{ f <- function(...) { ..3 } ; f(1,2) }");
    }

    @Ignore
    public void TestSimpleFunctions_testDotsIgnore_452f05dd561690c47f4f03db94d54b6b() {
        assertEvalError("{ f <- function() { dummy() } ; f() }");
    }

    @Ignore
    public void TestSimpleFunctions_testDotsIgnore_20c4c3aa63da2253e51ef2c5ba9d4a1b() {
        assertEvalError("{ f <- function() { if (FALSE) { dummy <- 2 } ; dummy() } ; f() }");
    }

    @Ignore
    public void TestSimpleFunctions_testDotsIgnore_8645241807f4b8810f69603e0858ef16() {
        assertEvalError("{ f <- function() { if (FALSE) { dummy <- 2 } ; g <- function() { dummy() } ; g() } ; f() }");
    }

    @Ignore
    public void TestSimpleFunctions_testDotsIgnore_edee5dc6f81e51ce659c0f3a2fb21571() {
        assertEvalError("{ f <- function() { dummy <- 2 ; g <- function() { dummy() } ; g() } ; f() }");
    }

    @Ignore
    public void TestSimpleFunctions_testDotsIgnore_c3c566ad3a1f22872c3f310db5ae8933() {
        assertEvalError("{ f <- function() { dummy() } ; dummy <- 2 ; f() }");
    }

    @Ignore
    public void TestSimpleFunctions_testDotsIgnore_5606499974e8a959bd2e5a755f7832c8() {
        assertEvalError("{ dummy <- 2 ; dummy() }");
    }

    @Ignore
    public void TestSimpleFunctions_testDotsIgnore_76837b302e412d60cdec11289bac184b() {
        assertEvalError("{ lapply(1:3, \"dummy\") }");
    }

    @Ignore
    public void TestSimpleFunctions_testDotsIgnore_27d8843efbecef3fd6ae84611b61cdff() {
        assertEvalError("{ f <- function(a, b) { a + b } ; g <- function(...) { f(a=1, ...) } ; g(a=2) }");
    }

    @Ignore
    public void TestSimpleFunctions_testDotsIgnore_7f8c80886bf192821872b6edd793baf2() {
        assertEvalError("{ f <- function(a, barg, bextra) { a + barg } ; g <- function(...) { f(a=1, ...) } ; g(b=2,3) }");
    }

    @Ignore
    public void TestSimpleFunctions_testDotsIgnore_997c167046500987d88720745d0018c2() {
        assertEvalError("{ f <- function(a, barg, bextra, dummy) { a + barg } ; g <- function(...) { f(a=1, ...) } ; g(be=2,bex=3, 3) }");
    }

    @Ignore
    public void TestSimpleFunctions_testDotsIgnore_601a671e48fcffae9a23e5b3466aa324() {
        assertEvalError("{ f <- function(a, barg, bextra, dummy) { a + barg } ; g <- function(...) { f(a=1, ..., x=2) } ; g(1) }");
    }

    @Ignore
    public void TestSimpleFunctions_testDotsIgnore_c42cdbf8980cb24618b0e81c71c76f87() {
        assertEvalError("{ f <- function(a, barg, bextra, dummy) { a + barg } ; g <- function(...) { f(a=1, ..., x=2,z=3) } ; g(1) }");
    }

    @Ignore
    public void TestSimpleFunctions_testDotsIgnore_673e885ab1ad8a737dbc0b05d6a34eed() {
        assertEvalError("{ f <- function(a, barg, bextra, dummy) { a + barg } ; g <- function(...) { f(a=1, ..., xxx=2) } ; g(1) }");
    }

    @Ignore
    public void TestSimpleFunctions_testDotsIgnore_4ef97fc6760900dfba4abef33ebb3620() {
        assertEvalError("{ f <- function(a, barg, bextra, dummy) { a + barg } ; g <- function(...) { f(a=1, xxx=2, ...) } ; g(1) }");
    }

    @Ignore
    public void TestSimpleFunctions_testDotsIgnore_3df181a7e78ef23b092f1aba322bbfa1() {
        assertEvalError("{ f <- function(a, barg, bextra, dummy) { a + barg } ; g <- function(...) { f(a=1, ...,,,) } ; g(1) }");
    }

    @Ignore
    public void TestSimpleFunctions_testDotsIgnore_abcc928e40684f62d0ad26ee2f35b057() {
        assertEvalError("{ f <- function(...) { ..2 + ..2 } ; f(1,,2) }");
    }

    @Ignore
    public void TestSimpleFunctions_testDotsIgnore_408a647f1319d8f5216323761b223a47() {
        assertEvalError("{ f <- function(...) { ..1 + ..2 } ; f(1,,3) }");
    }

    @Ignore
    public void TestSimpleFunctions_testErrors_97c1046334e0c7a03ba92803615fccd6() {
        assertEvalError("{ x<-function(){1} ; x(y=1) }");
    }

    @Ignore
    public void TestSimpleFunctions_testErrors_e45fc91400caff4d8a5596ec8cd2edfc() {
        assertEvalError("{ x<-function(y, b){1} ; x(y=1, 2, 3, z = 5) }");
    }

    @Ignore
    public void TestSimpleFunctions_testErrors_e8fd77ad56a4fc8e254f827faed5c973() {
        assertEvalError("{ x<-function(){1} ; x(1) }");
    }

    @Ignore
    public void TestSimpleFunctions_testErrors_9c686da74e6a9bfda861ec6e834613e8() {
        assertEvalError("{ x<-function(a){1} ; x(1,) }");
    }

    @Ignore
    public void TestSimpleFunctions_testErrors_423440c018b8f580500bc17469c52cb8() {
        assertEvalError("{ x<-function(){1} ; x(y=sum(1:10)) }");
    }

    @Ignore
    public void TestSimpleFunctions_testErrors_483a6566dbfd75258c3c09b229efb70b() {
        assertEvalError("{ f <- function(x) { x } ; f() }");
    }

    @Ignore
    public void TestSimpleFunctions_testErrors_da6b1096c4e55e8bb4ac7400d7e63552() {
        assertEvalError("{ x<-function(y,b){1} ; x(y=1,y=3,4) }");
    }

    @Ignore
    public void TestSimpleFunctions_testErrors_3e920d36beba426178bb6e2c548151b7() {
        assertEvalError("{ x<-function(foo,bar){foo*bar} ; x(fo=10,f=1,2) }");
    }

    @Ignore
    public void TestSimpleFunctions_testErrors_1f3190100b071debf5b11ed7f2fae959() {
        assertEvalError("{ f <- function(a,a) {1} }");
    }

    @Ignore
    public void TestSimpleFunctions_testErrors_bf29c1dae99e04f8cd11a340f54e1287() {
        assertEvalError("{ f <- function(a,b,c,d) { a + b } ; f(1,x=1,2,3,4) }");
    }

    @Ignore
    public void TestSimpleFunctions_testMatchingIgnore_7c113e0683905a2c65072aebc1cf14dc() {
        assertEvalError("{ f <- function(hello, hi) { hello + hi } ; f(h = 1) }");
    }

    @Ignore
    public void TestSimpleFunctions_testMatchingIgnore_1bd6b789e14102f4d5c84c2e1cd0b3cd() {
        assertEvalError("{ f <- function(hello, hi) { hello + hi } ; f(hello = 1, bye = 3) }");
    }

    @Ignore
    public void TestSimpleFunctions_testMatchingIgnore_b27e201723ae1ff4db0c5bcbe14b18b6() {
        assertEvalError("{ f <- function(a) { a } ; f(1,2) }");
    }

    @Ignore
    public void TestSimpleFunctions_testPromisesIgnore_c7558b8584a0a8c1dff6c7ee5575ab52() {
        assertEval("{ f <- function(x = z) { z = 1 ; x } ; f() }");
    }

    @Ignore
    public void TestSimpleFunctions_testPromisesIgnore_b817867bec89270f00c9820b107edd80() {
        assertEval("{ z <- 1 ; f <- function(c = z) {  z <- z + 1 ; c  } ; f() }");
    }

    @Ignore
    public void TestSimpleFunctions_testPromisesIgnore_0782b9c8b5990e31ca5d45f3d355ad83() {
        assertEval("{ f <- function(a) { g <- function(b) { x <<- 2; b } ; g(a) } ; x <- 1 ; f(x) }");
    }

    @Ignore
    public void TestSimpleFunctions_testPromisesIgnore_9a98faefce072c525121fc846528b144() {
        assertEval("{ f <- function(a) { g <- function(b) { a <<- 3; b } ; g(a) } ; x <- 1 ; f(x) }");
    }

    @Ignore
    public void TestSimpleFunctions_testPromisesIgnore_f502212c6a9fc0404104e3f44f29d926() {
        assertEval("{ f <- function(x) { function() {x} } ; a <- 1 ; b <- f(a) ; a <- 10 ; b() }");
    }

    @Ignore
    public void TestSimpleFunctions_testPromisesIgnore_1d4e596e32ad6ce14263c2861138bb44() {
        assertEvalError("{ f <- function(x = y, y = x) { y } ; f() }");
    }

    @Ignore
    public void TestSimpleIfEvaluator_testCast_9199af29689a0510d0f2b7657d6f9656() {
        assertEvalError("{ if (integer()) { TRUE } }");
    }

    @Ignore
    public void TestSimpleIfEvaluator_testCast_9759a28257afd267f562c056ecb21bc3() {
        assertEvalError("{ if (1[2:1]) { TRUE } }");
    }

    @Ignore
    public void TestSimpleIfEvaluator_testCast_16ad47e3aae858392d62ccd5199242c9() {
        assertEvalError("{ if (c(1L[2],0L,0L)) { TRUE } else { 2 } }");
    }

    @Ignore
    public void TestSimpleIfEvaluator_testCast_bda065a78031d440e536225f68fb6c2c() {
        assertEvalError("{ f <- function(cond) { if (cond) { TRUE } else { 2 }  } ; f(logical()) }");
    }

    @Ignore
    public void TestSimpleIfEvaluator_testCast_82982f95ffe974f98ccba036dfa8744e() {
        assertEvalWarning("{ f <- function(a) { if (is.na(a)) { 1 } else { 2 } } ; f(5) ; f(1:3)}");
    }

    @Ignore
    public void TestSimpleIfEvaluator_testCast_0db47653499ad8ead6375d84cb54b7f9() {
        assertEvalWarning("{ if (1:3) { TRUE } }");
    }

    @Ignore
    public void TestSimpleIfEvaluator_testCast_099b8bdf35d655c86519abbffda1ce8d() {
        assertEvalWarning("{ if (c(0,0,0)) { TRUE } else { 2 } }");
    }

    @Ignore
    public void TestSimpleIfEvaluator_testCast_813778d331bc4877ff5907cb5b3c7f3c() {
        assertEvalWarning("{ if (c(1L,0L,0L)) { TRUE } else { 2 } }");
    }

    @Ignore
    public void TestSimpleIfEvaluator_testCast_3e2b75fc9ef406c71f3e29e6b3d99c78() {
        assertEvalWarning("{ if (c(0L,0L,0L)) { TRUE } else { 2 } }");
    }

    @Ignore
    public void TestSimpleIfEvaluator_testCast_7fc18aa80c865a84fa5e33de006f8ccd() {
        assertEvalWarning("{ f <- function(cond) { if (cond) { TRUE } else { 2 } } ; f(1:3) ; f(2) }");
    }

    @Ignore
    public void TestSimpleIfEvaluator_testCast_54e42c6c4429a21b131e545c9dc37dbe() {
        assertEvalWarning("{ f <- function(cond) { if (cond) { TRUE } else { 2 }  } ; f(c(TRUE,FALSE)) ; f(FALSE) }");
    }

    @Ignore
    public void TestSimpleIfEvaluator_testCast_f221f10e3f4b7d00f239da0a0f88304f() {
        assertEvalWarning("{ f <- function(cond) { if (cond) { TRUE } else { 2 }  } ; f(c(TRUE,FALSE)) ; f(1) }");
    }

    @Ignore
    public void TestSimpleIfEvaluator_testIfDanglingElseIgnore_d73be7d76c1d5f7720c73594824df7ea() {
        assertEvalNoOutput("if(FALSE) if (FALSE) 1 else 2");
    }

    @Ignore
    public void TestSimpleIfEvaluator_testIfIgnore_e44614f9767a91b8721567cbaab6aa97() {
        assertEvalWarning("{ f <- function(x) { if (x) 1 else 2 } ; f(1) ; f(1:3) }");
    }

    @Ignore
    public void TestSimpleIfEvaluator_testIfWithoutElseIgnore_a1e01cf7b16f44e54f53f0bd7b7d4712() {
        assertEvalNoOutput("if(FALSE) 1");
    }

    @Ignore
    public void TestSimpleLists_testListArgumentEvaluation_f62339e36ed620e527abf492790cea00() {
        assertEval("{ a <- c(0,0,0) ; f <- function() { g <- function() { a[2] <<- 9 } ; g() } ; u <- function() { a <- c(1,1,1) ; f() ; a } ; list(a,u()) }");
    }

    @Ignore
    public void TestSimpleLoop_testDynamic_f61782f946510fe4afa8081fcbdd8fb1() {
        assertEval("{ l <- quote({x <- 0 ; for(i in 1:10) { x <- x + i } ; x}) ; f <- function() { eval(l) } ; x <<- 10 ; f() }");
    }

    @Ignore
    public void TestSimpleLoop_testLoops3_e52a6f4007d0a090db2f28b255bf413a() {
        assertEval("{ l <- quote({for(i in c(1,2)) { x <- i } ; x }) ; f <- function() { eval(l) } ; f() }");
    }

    @Ignore
    public void TestSimpleLoop_testLoops3_6548e4ec40613c3fef7af0ad99e9633e() {
        assertEval("{ l <- quote(for(i in s) { x <- i }) ; s <- 1:3 ; eval(l) ; s <- 2:1 ; eval(l) ; x }");
    }

    @Ignore
    public void TestSimpleLoop_testLoops3_46a097a0af4ffe6e8077dcbe5e4430e0() {
        assertEval("{ l <- quote({for(i in c(2,1)) { x <- i } ; x }) ; f <- function() { if (FALSE) i <- 2 ; eval(l) } ; f() }");
    }

    @Ignore
    public void TestSimpleLoop_testLoops3_569178ca1ef4a4eb52481f6da3753a5a() {
        assertEval("{ l <- quote(for(i in s) { x <- i }) ; s <- 1:3 ; eval(l) ; s <- NULL ; eval(l) ; x }");
    }

    @Ignore
    public void TestSimpleLoop_testLoops3_05c2bfcd5008d009fec146738755dac8() {
        assertEval("{ l <- quote({ for(i in c(1,2,3,4)) { if (i == 1) { next } ; if (i==3) { break } ; x <- i ; if (i==4) { x <- 10 } } ; x }) ; f <- function() { eval(l) } ; f()  }");
    }

    @Ignore
    public void TestSimpleLoop_testLoops3_ea11d8de89669a91c43b8a2985aaf4a0() {
        assertEval("{ l <- quote({ for(i in 1:4) { if (i == 1) { next } ; if (i==3) { break } ; x <- i ; if (i==4) { x <- 10 } } ; x }) ; f <- function() { eval(l) } ; f()  }");
    }

    @Ignore
    public void TestSimpleLoop_testLoopsErrorsIgnore_f394e8f19fc73574a5c55ba7f8e03973() {
        assertEvalError("{ l <- quote(for(i in s) { x <- i }) ; s <- 1:3 ; eval(l) ; s <- function(){} ; eval(l) ; x }");
    }

    @Ignore
    public void TestSimpleLoop_testLoopsErrorsIgnore_2b1a508671083a1b18d0ddb3fe0979c2() {
        assertEvalError("{ l <- function(s) { for(i in s) { x <- i } ; x } ; l(1:3) ; s <- function(){} ; l(s) ; x }");
    }

    @Ignore
    public void TestSimpleLoop_testLoopsErrorsIgnore_eb72a8fa37e3e5c2ac10481c6173a724() {
        assertEvalError("{ l <- quote({ for(i in s) { x <- i } ; x }) ; f <- function(s) { eval(l) } ; f(1:3) ; s <- function(){} ; f(s) ; x }");
    }

    @Ignore
    public void TestSimpleLoop_testOneIterationLoops_2b49e8a8d835c688af57e7939698d86a() {
        assertEvalNoNL("{ for (a in 1) cat(a) }");
    }

    @Ignore
    public void TestSimpleLoop_testOneIterationLoops_d16fcada6748f3bb2cf6eb7647ccd86f() {
        assertEvalNoNL("{ for (a in 1L) cat(a) }");
    }

    @Ignore
    public void TestSimpleLoop_testOneIterationLoops_133be12813e36ebfe9c2af618ab288c8() {
        assertEvalNoNL("{ for (a in \"xyz\") cat(a) }");
    }

    @Ignore
    public void TestSimpleSequences_testSequenceConstructionIgnore_b9324a4b0cb6cce5fbe2323872e18705() {
        assertEvalWarning("{ (1:3):3 }");
    }

    @Ignore
    public void TestSimpleTruffle_test1Ignore_3ec182256a363ba8d70350f6d949593b() {
        assertEvalNoOutput("{ f<-function(i) { if(i==1) { i } } ; f(1) ; f(2) }");
    }

    @Ignore
    public void TestSimpleTruffle_test1Ignore_6b932d60711336223d0b7667e5e39f6d() {
        assertEvalNoOutput("{ f<-function() { if (!1) TRUE } ; f(); f() }");
    }

    @Ignore
    public void TestSimpleTruffle_test1Ignore_97edc61479ed325f8e463f75a53a34d4() {
        assertEvalNoOutput("{ f<-function() { if (!TRUE) 1 } ; f(); f() }");
    }

    @Ignore
    public void TestSimpleTruffle_test1Ignore_71c46963de35ffad054f0a585f749a4f() {
        assertEvalNoOutput("{ f<-function(i) { if (FALSE) { i } } ; f(2) ; f(1) }");
    }

    @Ignore
    public void TestSimpleVectors_testMoreVectorsOtherIgnore_461a050f655ae44ddfc5d11f6a011e93() {
        assertEvalError("{ x<-1:4; x[[1]]<-NULL; x }");
    }

    @Ignore
    public void TestSimpleVectors_testMoreVectorsOtherIgnore_5a63039e693f0bcdb40f33a133932ebd() {
        assertEvalError("{ x<-1:4; x[[0]]<-NULL; x }");
    }

    @Ignore
    public void TestSimpleVectors_testMoreVectorsOtherIgnore_3b27f8602ed093e9302f1ed670a155cf() {
        assertEvalError("{ b<-3:5; dim(b) <- c(1,3) ; b[[c(1)]] <- NULL ; b }");
    }

    @Ignore
    public void TestSimpleVectors_testMoreVectorsOtherIgnore_4b570d690c92236829b8974bae01fe3e() {
        assertEvalError("{ b<-3:5; dim(b) <- c(1,3) ; b[[0]] <- NULL ; b }");
    }

    @Ignore
    public void TestSimpleVectors_testMoreVectorsOtherIgnore_fe5461bdd4035e24804d4c684b9bb20f() {
        assertEvalError("{ x <- integer() ; x[[NA]] <- NULL ; x }");
    }

    @Ignore
    public void TestSimpleVectors_testMoreVectorsOtherIgnore_f09061c93f11ca4a2ec5ecd4f85f7548() {
        assertEvalError("{ x <- c(1) ; x[[NA]] <- NULL ; x }");
    }

    @Ignore
    public void TestSimpleVectors_testMoreVectorsOtherIgnore_4eea10efa7dfc459fce3420e5cf8d9fc() {
        assertEvalError("{ x <- c(1,2) ; x[[NA]] <- NULL ; x }");
    }

    @Ignore
    public void TestSimpleVectors_testMoreVectorsOtherIgnore_ad453b3eec6a2d91d42ea4c78a0c9356() {
        assertEvalError("{ x <- c(1,2,3) ; x[[NA]] <- NULL ; x }");
    }

    @Ignore
    public void TestSimpleVectors_testMoreVectorsOtherIgnore_d5bbba1f1bb5b771dbc80175679415c5() {
        assertEvalError("{ x<-c(1,2,3,4); dim(x)<-c(2,2); x[[1]]<-NULL; x }");
    }

    @Ignore
    public void TestSimpleVectors_testScalarUpdateIgnore_ea7d1aaf03e73608bdd0d9114c96e3a8() {
        assertEvalError("{ f <- function(b,v) { b[[2]] <- v ; b } ; f(c(\"a\",\"b\"),\"d\") ; f(c(\"a\",\"b\"),NULL) }");
    }

    @Ignore
    public void TestSimpleVectors_testScalarUpdateIgnore_5d198ef5c0421165963dc6da0d622857() {
        assertEvalError("{ x <- 4:10 ; x[[\"z\"]] <- NULL ; x }");
    }

    @Ignore
    public void TestSimpleVectors_testVectorUpdateIgnore_4bb6389721e2adbd8f6b69aa42e80569() {
        assertEval("{ x<-1:5 ; x[x[4]<-2] <- (x[4]<-100) ; x }");
    }

    @Ignore
    public void TestSimpleVectors_testVectorUpdateIgnore_09e16a78eb04d58e35b4c9045cbc0acb() {
        assertEval("{ x<-5:1 ; x[x[2]<-2] }");
    }

}

