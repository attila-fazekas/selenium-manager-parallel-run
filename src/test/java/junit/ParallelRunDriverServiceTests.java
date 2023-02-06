package junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.remote.service.DriverService;
import org.openqa.selenium.safari.SafariDriverService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.bridge.SLF4JBridgeHandler;

import java.io.IOException;

class ParallelRunDriverServiceTests {

    private static final Logger logger = LoggerFactory.getLogger(ParallelRunDriverServiceTests.class);

    private DriverService ds;

    @BeforeAll
    static void printExecutionPath() {
        SLF4JBridgeHandler.removeHandlersForRootLogger();
        SLF4JBridgeHandler.install();
        logger.info(String.format("temp dir: %s", System.getProperty("java.io.tmpdir")));
    }

    @AfterEach
    void stopDriverService() {
        ds.stop();
    }

    @Test
    void test1() throws IOException {
        ds = ChromeDriverService.createDefaultService();
        ds.start();
    }

    @Test
    void test2() throws IOException {
        ds = EdgeDriverService.createDefaultService();
        ds.start();
    }

    @Test
    void test3() throws IOException {
        ds = GeckoDriverService.createDefaultService();
        ds.start();
    }

    @Test
    void test4() throws IOException {
        ds = SafariDriverService.createDefaultService();
        ds.start();
    }

    @Test
    void test5() throws IOException {
        ds = EdgeDriverService.createDefaultService();
        ds.start();
    }

    @Test
    void test6() throws IOException {
        ds = EdgeDriverService.createDefaultService();
        ds.start();
    }

    @Test
    void test7() throws IOException {
        ds = GeckoDriverService.createDefaultService();
        ds.start();
    }

    @Test
    void test8() throws IOException {
        ds = SafariDriverService.createDefaultService();
        ds.start();
    }

    @Test
    void test9() throws IOException {
        ds = EdgeDriverService.createDefaultService();
        ds.start();
    }

    @Test
    void test10() throws IOException {
        ds = EdgeDriverService.createDefaultService();
        ds.start();
    }

    @Test
    void test11() throws IOException {
        ds = GeckoDriverService.createDefaultService();
        ds.start();
    }

    @Test
    void test12() throws IOException {
        ds = SafariDriverService.createDefaultService();
        ds.start();
    }

    @Test
    void test13() throws IOException {
        ds = EdgeDriverService.createDefaultService();
        ds.start();
    }

    @Test
    void test14() throws IOException {
        ds = EdgeDriverService.createDefaultService();
        ds.start();
    }

    @Test
    void test15() throws IOException {
        ds = GeckoDriverService.createDefaultService();
        ds.start();
    }

    @Test
    void test16() throws IOException {
        ds = SafariDriverService.createDefaultService();
        ds.start();
    }
}