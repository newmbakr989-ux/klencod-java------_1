<!DOCTYPE html>
<html lang="ar" dir="rtl">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>مؤقت تسخين وتبريد المواسير</title>
    <style>
        * { box-sizing: border-box; margin: 0; padding: 0; font-family: Tahoma, Arial, sans-serif; }
        body { background-color: #f0f4f8; color: #333; display: flex; justify-content: center; align-items: center; min-height: 100vh; padding: 10px; }
        .app-container { width: 100%; max-width: 420px; background: #ffffff; border-radius: 20px; box-shadow: 0 8px 25px rgba(0,0,0,0.15); overflow: hidden; border: 4px solid #1a5276; }
        .header { background: #1a5276; color: white; padding: 12px 15px; display: flex; justify-content: space-between; align-items: center; }
        .header h1 { font-size: 17px; font-weight: bold; text-align: center; flex-grow: 1; }
        .header-btn { background: none; border: none; color: white; font-size: 20px; cursor: pointer; padding: 5px; }
        .section-title { background: #1a5276; color: white; font-size: 14px; text-align: center; padding: 6px; margin: 8px 10px; border-radius: 6px; font-weight: bold; }
        .process-row, .pressure-row { display: flex; gap: 10px; padding: 0 10px; margin-top: 8px; }
        .btn-process, .btn-pressure { flex: 1; padding: 12px; font-size: 16px; font-weight: bold; border-radius: 12px; border: 2px solid #ccc; cursor: pointer; transition: 0.2s; background: #f8f9f9; color: #333; display: flex; align-items: center; justify-content: center; gap: 8px; }
        .btn-process.active-heat { background: #ffe6cc; border-color: #e67e22; color: #d35400; box-shadow: 0 0 10px rgba(230,126,34,0.4); }
        .btn-process.active-cool { background: #d4e6f1; border-color: #2980b9; color: #2980b9; box-shadow: 0 0 10px rgba(41,128,185,0.4); }
        .btn-pressure.active { background: #ebf5fb; border-color: #2980b9; color: #1b4f72; box-shadow: 0 0 10px rgba(41,128,185,0.5); }
        .diameters-grid { display: grid; grid-template-columns: repeat(4, 1fr); gap: 6px; padding: 0 10px; margin-top: 8px; }
        .btn-dia { padding: 10px 5px; font-size: 15px; font-weight: bold; background: #ecf0f1; border: 2px solid #bdc3c7; border-radius: 8px; cursor: pointer; text-align: center; transition: 0.1s; }
        .btn-dia.active { background: #2980b9; color: white; border-color: #1b4f72; box-shadow: 0 0 8px rgba(41,128,185,0.6); }
        .timer-box { background: #e8f8f5; border: 3px solid #27ae60; border-radius: 15px; margin: 10px; padding: 12px; text-align: center; }
        .timer-label { font-size: 14px; color: #1e8449; font-weight: bold; margin-bottom: 5px; }
        .timer-display { font-size: 42px; font-weight: bold; color: #196f3d; font-family: monospace; }
        .timer-info { font-size: 13px; color: #27ae60; margin-top: 4px; font-weight: bold; }
        .action-row { display: flex; gap: 10px; padding: 0 10px 10px 10px; }
        .btn-start { flex: 2; background: #27ae60; color: white; border: none; padding: 12px; font-size: 18px; font-weight: bold; border-radius: 10px; cursor: pointer; display: flex; align-items: center; justify-content: center; gap: 8px; }
        .btn-start.running { background: #c0392b; }
        .btn-reset { flex: 1; background: #7f8c8d; color: white; border: none; padding: 12px; font-size: 15px; font-weight: bold; border-radius: 10px; cursor: pointer; display: flex; align-items: center; justify-content: center; gap: 5px; }
        .footer-alert { background: #1a5276; color: white; padding: 8px 10px; display: flex; justify-content: space-between; align-items: center; font-size: 13px; }
        .btn-test-sound { background: #2980b9; color: white; border: none; padding: 5px 10px; border-radius: 6px; cursor: pointer; font-size: 12px; font-weight: bold; }
        .footer-rights { background: #112d42; color: #f1c40f; text-align: center; padding: 10px; font-size:
