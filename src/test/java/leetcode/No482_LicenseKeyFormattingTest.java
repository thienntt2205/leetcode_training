package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class No482_LicenseKeyFormattingTest {

    @Test
    public void licenseKeyFormatting() {
        No482_LicenseKeyFormatting format = new No482_LicenseKeyFormatting();
        assertEquals("5F3Z-2E9W", format.licenseKeyFormatting("5F3Z-2e-9-w", 4));
    }
}