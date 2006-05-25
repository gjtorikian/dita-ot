<?xml version='1.0'?>

<!-- 
Copyright © 2004-2005 by Idiom Technologies, Inc. All rights reserved. 
IDIOM is a registered trademark of Idiom Technologies, Inc. and WORLDSERVER
and WORLDSTART are trademarks of Idiom Technologies, Inc. All other 
trademarks are the property of their respective owners. 

IDIOM TECHNOLOGIES, INC. IS DELIVERING THE SOFTWARE "AS IS," WITH 
ABSOLUTELY NO WARRANTIES WHATSOEVER, WHETHER EXPRESS OR IMPLIED,  AND IDIOM
TECHNOLOGIES, INC. DISCLAIMS ALL WARRANTIES, EXPRESS OR IMPLIED, INCLUDING
BUT NOT LIMITED TO WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR 
PURPOSE AND WARRANTY OF NON-INFRINGEMENT. IDIOM TECHNOLOGIES, INC. SHALL NOT
BE LIABLE FOR INDIRECT, INCIDENTAL, SPECIAL, COVER, PUNITIVE, EXEMPLARY,
RELIANCE, OR CONSEQUENTIAL DAMAGES (INCLUDING BUT NOT LIMITED TO LOSS OF 
ANTICIPATED PROFIT), ARISING FROM ANY CAUSE UNDER OR RELATED TO  OR ARISING 
OUT OF THE USE OF OR INABILITY TO USE THE SOFTWARE, EVEN IF IDIOM
TECHNOLOGIES, INC. HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGES. 

Idiom Technologies, Inc. and its licensors shall not be liable for any
damages suffered by any person as a result of using and/or modifying the
Software or its derivatives. In no event shall Idiom Technologies, Inc.'s
liability for any damages hereunder exceed the amounts received by Idiom
Technologies, Inc. as a result of this transaction.

These terms and conditions supersede the terms and conditions in any
licensing agreement to the extent that such terms and conditions conflict
with those set forth herein.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:fo="http://www.w3.org/1999/XSL/Format"
    version="1.0">

    <xsl:include href="../../cfg/fo/attrs/hi-domain-attr.xsl"/>

    <xsl:template match="*[contains(@class,' hi-d/b ')]">
        <fo:inline xsl:use-attribute-sets="b" id="{@id}">
            <xsl:apply-templates/>
        </fo:inline>
    </xsl:template>

    <xsl:template match="*[contains(@class,' hi-d/i ')]">
      <fo:inline xsl:use-attribute-sets="i" id="{@id}">
        <xsl:apply-templates/>
      </fo:inline>
    </xsl:template>

    <xsl:template match="*[contains(@class,' hi-d/u ')]">
      <fo:inline xsl:use-attribute-sets="u" id="{@id}">
        <xsl:apply-templates/>
      </fo:inline>
    </xsl:template>

    <xsl:template match="*[contains(@class,' hi-d/tt ')]">
      <fo:inline xsl:use-attribute-sets="tt" id="{@id}">
        <xsl:apply-templates/>
      </fo:inline>
    </xsl:template>

    <xsl:template match="*[contains(@class,' hi-d/sup ')]">
      <fo:inline xsl:use-attribute-sets="sup" id="{@id}">
        <xsl:apply-templates/>
      </fo:inline>
    </xsl:template>

    <xsl:template match="*[contains(@class,' hi-d/sub ')]">
      <fo:inline xsl:use-attribute-sets="sub" id="{@id}">
        <xsl:apply-templates/>
      </fo:inline>
    </xsl:template>

</xsl:stylesheet>