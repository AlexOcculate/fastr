#
# Copyright (c) 2014, 2019, Oracle and/or its affiliates. All rights reserved.
# DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
#
# This code is free software; you can redistribute it and/or modify it
# under the terms of the GNU General Public License version 3 only, as
# published by the Free Software Foundation.
#
# This code is distributed in the hope that it will be useful, but WITHOUT
# ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
# FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
# version 3 for more details (a copy is included in the LICENSE file that
# accompanied this code).
#
# You should have received a copy of the GNU General Public License version
# 3 along with this work; if not, write to the Free Software Foundation,
# Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
#
# Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
# or visit www.oracle.com if you need additional information or have any
# questions.
#

.PHONY: all clean

export TOPDIR = $(CURDIR)
export FASTR_R_HOME=$(abspath $(TOPDIR)/..)
export FASTR_LIB_DIR=$(FASTR_R_HOME)/lib
export FASTR_NATIVE_DIR = $(TOPDIR)
export R_VERSION = 3.5.1
export DEFAULT_CRAN_MIRROR = "https://mran.microsoft.com/snapshot/2019-02-13"
export GNUR_HOME = $(TOPDIR)/gnur/patch-build

$(info R_VERSION: $(R_VERSION))
$(info GNUR_HOME: $(GNUR_HOME))

ifndef FASTR_RFFI
export FASTR_RFFI = nfi
endif

ifndef GNUR_HOME_BINARY
export GNUR_HOME_BINARY = $(FASTR_R_HOME)/libdownloads/R-$(R_VERSION)
$(info GNUR_HOME_BINARY not set. Assuming the default location at $(GNUR_HOME_BINARY))
endif

# Completely accurate dependency analysis is very difficult for this project, so use a version number
# to force a clean build, and elsewhere use sentinels to avoid rebuilding when we can't compute the
# dependencies accurately.

ifeq ($(FASTR_RFFI),llvm)
all: checkversion
	$(MAKE) -C gnur
	$(MAKE) -C ../f2c/f2c
	FASTR_RFFI=llvm-only $(MAKE) -C ../f2c/libf2c
	$(MAKE) -C include
	$(MAKE) -C fficall
	$(MAKE) -C $(GNUR_HOME)/src/library
	$(MAKE) -C run
	cp version.source version.built

clean:
	$(MAKE) -C include clean
	$(MAKE) -C fficall clean
	$(MAKE) -C run clean
	$(MAKE) -C ../f2c/libf2c clean
	$(MAKE) -C ../f2c/f2c clean		
	$(MAKE) -C gnur clean
else
all: checkversion
	$(MAKE) -C gnur
	$(MAKE) -C include
	$(MAKE) -C fficall
	$(MAKE) -C $(GNUR_HOME)/src/library
	$(MAKE) -C run
	cp version.source version.built

clean:
	$(MAKE) -C include clean
	$(MAKE) -C fficall clean
	$(MAKE) -C run clean
	$(MAKE) -C gnur clean
endif

version.source := $(shell cat version.source)

#$(info version: $(version.source))
ifeq ($(wildcard version.built),)
	doclean = 1
else
version.built := $(shell cat version.built)
#$(info version.built: $(version.built))
ifneq ($(version.source),$(version.built))
	doclean = 1
else
	doclean = 0
endif
endif

$(info doclean: $(doclean))
checkversion:
ifeq ($(doclean),1)
	$(MAKE) clean
endif
